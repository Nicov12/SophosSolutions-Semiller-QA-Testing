package com.sophossolutions.stepdefinitions;

import com.sophossolutions.apis.MyApiRestApi;

import io.cucumber.java.en.When;

public class GetMyApiConsultUserCreatedStepDefinition {
	
	@When("Consulta el endpoint {string} con el id del usuario recien creado")
	public void consultaElEndpointConElIdDelUsuarioRecienCreado(String strEndpoint) {
	    MyApiRestApi.executeGetUserCreated(strEndpoint);
	}
}
