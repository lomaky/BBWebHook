package com.bbwebhook.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;

import java.util.HashMap;
import java.util.Map;

import com.bbwebhook.GatewayResponse;
import com.bbwebhook.models.BBWebHookData;
import com.bbwebhook.models.v2.BBPREvent;
import com.google.gson.Gson;

/**
 * Handler for requests to Lambda function.
 */
public class BbPullRequestHandler implements RequestHandler<Object, Object> {

	@SuppressWarnings("unchecked")
	@Override
    public Object handleRequest(Object input, Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        boolean fail1 = false;
        boolean fail2 = false;
        String error1 = "";
        String error2 = "";
		try {
			HashMap<String, String> mapInput = (HashMap<String, String>) input;
			String body = mapInput.get("body");
			Gson g = new Gson(); 
			BBWebHookData bbWebHookData = g.fromJson(body, BBWebHookData.class);
			
			AmazonSNS sns = AmazonSNSClient.builder().withRegion("us-east-1")
					.build();
			sns.publish(
					new PublishRequest("arn:aws:sns:us-east-1:257530247365:GSBBAlarm",
						body, 
						bbWebHookData.getPullrequest().getTitle())
					);
			return new GatewayResponse(
	        		"{ \"Output\": \""+bbWebHookData.getPullrequest().getTitle()+"\"}",
	        		headers, 200);
		}catch (Exception e) { fail1 = true; error1 = e.getMessage(); }
		
		try {
			HashMap<String, String> mapInput = (HashMap<String, String>) input;
			String body = mapInput.get("body");
			Gson g = new Gson(); 
			BBPREvent bbPREvent = g.fromJson(body, BBPREvent.class);
			
			AmazonSNS sns = AmazonSNSClient.builder().withRegion("us-east-1")
					.build();
			sns.publish(
					new PublishRequest("arn:aws:sns:us-east-1:257530247365:GSBBAlarm",
						body,
						bbPREvent.getActor().getName())
					);
			return new GatewayResponse(
	        		"{ \"Output\": \""+bbPREvent.getActor().getName()+"\"}",
	        		headers, 200);
		}catch (Exception e) { fail2 = true; error2 = e.getMessage(); }
		
		if (fail1 && fail2) {
			return new GatewayResponse(
	        		"{ \"Output FAIL\": \"e1:"+error1+" | e2:"+error2+"\"}",
	        		headers, 400);
		}
		return new GatewayResponse(
        		"{ \"Output FAIL\": \"Unknown Error\"}",
        		headers, 400);
    }

}
