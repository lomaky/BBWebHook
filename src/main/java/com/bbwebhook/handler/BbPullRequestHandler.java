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
		try {
			HashMap<String, String> mapInput = (HashMap<String, String>) input;
			String body = mapInput.get("body");
			Gson g = new Gson(); 
			BBWebHookData bbWebHookData = g.fromJson(body, BBWebHookData.class);
			
			AmazonSNS sns = AmazonSNSClient.builder().build();
			sns.publish(
					new PublishRequest("arn:aws:sns:us-east-1:257530247365:GSBBAlarm",
						body, 
						bbWebHookData.getPullrequest().getTitle())
					);
			return new GatewayResponse(
	        		"{ \"Output\": \""+bbWebHookData.getPullrequest().getTitle()+"\"}",
	        		headers, 200);
		}catch (Exception e) {
			return new GatewayResponse(
	        		"{ \"Output FAIL\": \""+e.getMessage()+"\"}",
	        		headers, 400);
		}
    }

}
