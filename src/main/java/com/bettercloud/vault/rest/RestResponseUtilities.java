package com.bettercloud.vault.rest;

public class RestResponseUtilities {

    public static String getErrorResponse(RestResponse restResponse) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vault responded with HTTP status code: ").append(restResponse.getStatus());
        if (null != restResponse.getBody()) {
            stringBuilder.append("Error: ").append(new String(restResponse.getBody()));
        }
        return stringBuilder.toString();
    }
}
