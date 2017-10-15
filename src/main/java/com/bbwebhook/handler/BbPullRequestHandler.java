package com.bbwebhook.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.HashMap;
import java.util.Map;

import com.bbwebhook.GatewayResponse;
import com.bbwebhook.models.BBWebHookData;

/**
 * Handler for requests to Lambda function.
 */
public class BbPullRequestHandler implements RequestHandler<Object, Object> {

	@Override
    public Object handleRequest(Object input, Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
		try {
			return new GatewayResponse(
	        		"{ \"Output OK\": \""+input+"\"}",
	        		headers, 200);
		}catch (Exception e) {
			return new GatewayResponse(
	        		"{ \"Output FAIL\": \""+e.getMessage()+"\"}",
	        		headers, 200);
		}
    }

}
