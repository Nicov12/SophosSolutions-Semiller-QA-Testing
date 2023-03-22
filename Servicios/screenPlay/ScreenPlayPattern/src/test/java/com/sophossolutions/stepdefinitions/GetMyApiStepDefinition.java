package com.sophossolutions.stepdefinitions;

import com.sophossolutions.apis.GoRestApi;
import com.sophossolutions.apis.MyApiRestApi;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GetMyApiStepDefinition {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} establece la base url {string}")
	public void estableceLaBaseUrl(String strNameActor, String strBaseUrl) {
	    MyApiRestApi.setBaseUrl(strBaseUrl);
	}
	
	@When("Consulta el endpoint {string} de My API")
	public void consultaElEndpointDeMyAPI(String strEndPoint) {
		MyApiRestApi.executeGetRest(strEndPoint);
	}
	
	@Then("Validar que el status code sea {int} y la respuesta de la api contenga")
	public void validarQueElStatusCodeSeaYLaRespuestaDeLaApiContenga(Integer intStatusCode, io.cucumber.datatable.DataTable dataTable) {
	   MyApiRestApi.validateStatusCode(intStatusCode);
	   MyApiRestApi.validateUserFields(dataTable);
	}
	
	
}
