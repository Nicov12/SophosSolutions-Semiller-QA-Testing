package com.sophossolutions.apis;

import java.io.IOException;
import java.util.Map;

import com.sophossolutions.restinteractions.RestInteraction;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;

public class MyApiRestApi {
	
	public static int intIdUserCreated;
	
	public static void setBaseUrl(String strBaseUrl) {
		RestInteraction.setBaseUrl(Constants.getData(strBaseUrl));
	}
	
	
	
	public static void executeGetRest(String strEndPoint) {
		RestInteraction.executeGetRest(Constants.getData(strEndPoint));
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
	
	
	//Crear Usuario
	public static int executePostAndGetUser(String strBody, String strEndpoint) throws IOException {

		intIdUserCreated = RestInteraction.executePostAndGetUser(Constants.getData(strBody), Constants.getData(strEndpoint));
		return intIdUserCreated;
	}
	
	//Consultar el usuario creado
	public static void executeGetUserCreated(String strEndPoint) {

		RestInteraction.executeGetUserCreated(Constants.getData(strEndPoint)+intIdUserCreated);
	}
}
