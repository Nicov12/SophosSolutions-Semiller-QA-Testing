package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.utils.Constants.getData;

import java.util.HashMap;
import java.util.Map;

import com.sophossolutions.apis.GoRestApi;

import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class GetGoRestConsultUserStepDefinition {
	
	
	@When("Consulta el endpoint {string} con una peticion get usando el token")
	public void consultaElEndpointConUnaPeticionGetUsandoElToken(String endpoint) {
	    
	}
	
	@When("Consulta el endpoint {string} con una peticion get usando el token y el id {string}")
	public void consultaElEndpointConUnaPeticionGetUsandoElTokenYElId(String endpoint, String id) {
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Authorization", "Bearer ".concat(GoRestApi.STR_TOKEN));
		headers.put("Content-Type", "application/json");
		
//		SerenityRest.given().auth().oauth2(GoRestApi.STR_TOKEN)
//		.get(getData("Go Rest").concat(getData(endpoint).concat(id)));
//		
//		SerenityRest.given()
//			.headers("Authorization", "Bearer ".concat(GoRestApi.STR_TOKEN), "Content-Type", ContentType.JSON)
//		.get(getData("Go Rest").concat(getData(endpoint).concat(id)));
		
		SerenityRest.given().headers(headers)
		.get(getData("Go Rest").concat(getData(endpoint).concat(id)));
		
	    SerenityRest.lastResponse().prettyPeek();
	}
}
