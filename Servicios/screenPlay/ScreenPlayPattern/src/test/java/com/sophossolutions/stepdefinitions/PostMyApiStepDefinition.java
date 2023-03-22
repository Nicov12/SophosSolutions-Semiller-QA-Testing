package com.sophossolutions.stepdefinitions;

import java.io.IOException;

import com.sophossolutions.apis.MyApiRestApi;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostMyApiStepDefinition {
	
	
	@When("Consulta el endpoint {string} de My API vía post con la data {string}")
	public void consultaElEndpointDeMyAPIVíaPostConLaData(String strEndpoint, String strData) throws IOException {
	    MyApiRestApi.executePostAndGetUser(strData, strEndpoint);
	}
	
	@Then("Validar el status code sea {int} y la respuesta contenga el schema {string}")
	public void validarElStatusCodeSeaYLaRespuestaContengaElSchema(Integer intStatusCode, String strSchema) {
		 MyApiRestApi.validateStatusCode(intStatusCode);
		 MyApiRestApi.validateSchema(strSchema);
	}
}
