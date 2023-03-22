package com.sophossolutions.apis;

import java.io.IOException;
import java.util.Map;

import com.sophossolutions.restinteractions.RestInteraction;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;

public class RestFulApi {
	
	public static final String STR_TOKEN = "QpwL5tke4Pnpja7X4";
	
	public static void setBaseUrl(String strBaseUrl) {
		RestInteraction.setBaseUrl(strBaseUrl);
	}
	
	
	
	public static void executeGetRest(String strEndPoint) {
		RestInteraction.executeGetRest(strEndPoint);
	}
	
	
	
	public static void validateStatusCode(int intStatusCode) {
		RestInteraction.validateStatusCode(intStatusCode);
	}

	
	public static void validateUserFields(DataTable dataTable ) {
		
		Map<String, String> map = dataTable.asMap();
	    map.forEach((key, value) -> RestInteraction.validateUserFields(key, value));
		
	}
	
	public static void validateSchema(String strSchema) {
		RestInteraction.validateSchema(Constants.getData(strSchema));
	}
	
	public static void executePost(String strBody, String strEndpoint) throws IOException {
		RestInteraction.executePost(Constants.getData(strBody), Constants.getData(strEndpoint));
	}
	
}
