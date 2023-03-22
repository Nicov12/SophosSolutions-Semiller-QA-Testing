package com.sophossolutions.apis;

import java.io.IOException;
import java.util.Map;

import com.sophossolutions.restinteractions.RestInteraction;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;

public class GoRestApi {
	
	public static final String STR_TOKEN = "55dda34c2a96a129c847b108337529acedd84811bb68d7b937455feb603b0732";
	
	
	public static void setBaseUrl(String strBaseUrl) {
		RestInteraction.setBaseUrl(strBaseUrl);
	}
	
	public static void executeGetRest(String strEndPoint) {
		RestInteraction.executeGetRest(strEndPoint);
	}
	
	public static void validateStatusCode(int intStatusCode) {
		RestInteraction.validateStatusCode(intStatusCode);
	}
	
	public static void validateNameField(String strFieldValue) {
		String strFieldName = "name";
		RestInteraction.validateField(strFieldName, strFieldValue);
	}
	
	
	public static void validateUserFields(DataTable dataTable ) {
		
		Map<String, String> map = dataTable.asMap();
	    map.forEach((key, value) -> RestInteraction.validateUserFields(key, value));
		
	}
	
	public static void validateSchema(String strSchema) {
		RestInteraction.validateSchema(Constants.getData(strSchema));
	}
	
	
	//POST
	
	public static void executePostWithToken(String strBody, String strEndpoint) {
		RestInteraction.executePostWithToken(Constants.getData(strBody), STR_TOKEN, Constants.getData(strEndpoint));
	}
	
	//DELETE
	
	
	
}

