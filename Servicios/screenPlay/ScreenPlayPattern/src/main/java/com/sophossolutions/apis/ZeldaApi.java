package com.sophossolutions.apis;

import java.util.Map;

import com.sophossolutions.restinteractions.RestInteraction;

import io.cucumber.datatable.DataTable;

public class ZeldaApi {
	
	
	
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
	    map.forEach((key, value) -> RestInteraction.validateUserFields("data."+key, value));
		
	}
	
	public static void validateSchema(String strSchema) {
		RestInteraction.validateSchema(strSchema);
	}
	
	
	
}
