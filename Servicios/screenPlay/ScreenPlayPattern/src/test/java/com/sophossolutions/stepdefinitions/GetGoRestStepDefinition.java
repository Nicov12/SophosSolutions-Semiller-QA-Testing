package com.sophossolutions.stepdefinitions;

import java.util.Map;

import com.sophossolutions.apis.GoRestApi;
import com.sophossolutions.apis.ZeldaApi;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.*;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class GetGoRestStepDefinition {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} establece la base url {string} del servicio")
	public void estableceLaBaseUrlDelServicio(String strActorName, String strBaseUrl) {
	//    OnStage.theActorCalled(Constants.getData(strActorName)).whoCan(CallAnApi.at(Constants.getData(strBaseUrl)));
		GoRestApi.setBaseUrl(Constants.getData(strBaseUrl));
	}
	@When("Consulta el endpoint {string}")
	public void consultaElEndpoint(String strEndPoint) {
	    //OnStage.theActorInTheSpotlight().attemptsTo(null);
		GoRestApi.executeGetRest(Constants.getData(strEndPoint));
	}
	
	@Then("Validar que el status code sea {int} y la respuesta contenga")
	public void validarQueElStatusCodeSeaYLaRespuestaContenga(Integer intStatusCode, io.cucumber.datatable.DataTable dataTable) {
	    
		GoRestApi.validateStatusCode(intStatusCode);
		GoRestApi.validateUserFields(dataTable);
	    
	}
	
	
//	@Then("Validar que el status code sea {int} y la respuesta contenga el nombre {string}")
//	public void validarQueElStatusCodeSeaYLaRespuestaContengaElNombre(Integer intStatusCode, String strFieldName) {
//	    GoRestApi.validateStatusCode(intStatusCode);
//	    GoRestApi.validateNameField(strFieldName);
//	}
	
}
