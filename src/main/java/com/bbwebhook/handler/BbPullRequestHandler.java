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
public class BbPullRequestHandler implements RequestHandler<BBWebHookData, Object> {

	@Override
    public Object handleRequest(final BBWebHookData input, final Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        
        return new GatewayResponse(input.getPullrequest().getTitle() , headers, 200);
    }

}
