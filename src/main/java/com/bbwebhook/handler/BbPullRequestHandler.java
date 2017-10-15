package com.bbwebhook.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.HashMap;
import java.util.Map;

import com.bbwebhook.GatewayResponse;
import com.bbwebhook.models.BBWebHookData;
import com.google.gson.Gson;

/**
 * Handler for requests to Lambda function.
 */
public class BbPullRequestHandler implements RequestHandler<Object, Object> {

	@Override
    public Object handleRequest(Object input, Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
		try {
			HashMap<String, String> mapInput = (HashMap<String, String>) input;
			String body = mapInput.get("body");
			Gson g = new Gson(); 
			BBWebHookData bbWebHookData = g.fromJson(body, BBWebHookData.class);
			return new GatewayResponse(
	        		"{ \"Output\": \""+bbWebHookData.getPullrequest().getTitle()+"\"}",
	        		headers, 401);
		}catch (Exception e) {
			return new GatewayResponse(
	        		"{ \"Output FAIL\": \""+e.getMessage()+"\"}",
	        		headers, 401);
		}
    }

}
