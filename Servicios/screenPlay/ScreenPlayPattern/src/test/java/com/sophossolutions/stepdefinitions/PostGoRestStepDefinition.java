package com.sophossolutions.stepdefinitions;

import java.io.IOException;
import java.util.Map;

import com.sophossolutions.apis.GoRestApi;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import static com.sophossolutions.utils.Constants.getData;

public class PostGoRestStepDefinition {
	
	
	
	
	@When("Consulta el endpoint {string} por medio de una peticion post con la data {string}")
	public void consultaElEndpointPorMedioDeUnaPeticionPostConLaData(String strEndpoint, String strUrlJsonData) throws IOException {
		
		GoRestApi.executePostWithToken(strUrlJsonData, strEndpoint);
	}
	
	@Then("Validar que el status code sea {int} y que el esquema {string} sea correcto.")
	public void validarQueElStatusCodeSeaYQueElEsquemaSeaCorrecto(Integer statusCode, String schema) {
	    GoRestApi.validateStatusCode(statusCode);
	    GoRestApi.validateSchema(schema);
	}
	
}
