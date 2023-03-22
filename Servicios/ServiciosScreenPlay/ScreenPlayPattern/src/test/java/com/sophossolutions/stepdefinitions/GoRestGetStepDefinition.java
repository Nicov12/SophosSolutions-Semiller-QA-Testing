package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import java.util.Map;

import org.hamcrest.CoreMatchers;

import com.sophossolutions.apis.GoRestApi;
import com.sophossolutions.task.ExecuteGet;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.*;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

public class GoRestGetStepDefinition {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} establece la base url {string} del servicio")
	public void estableceLaBaseUrlDelServicio(String strActorName, String strBaseUrl) {
		
	    OnStage.theActorCalled(strActorName).whoCan(CallAnApi.at(Constants.getData(strBaseUrl)));
	}
	
	@When("Consulta el endpoint {string} con el id {string}")
	public void consultaElEndpointConElId(String strEndPoint, String strIdUser) {
		
	    OnStage.theActorInTheSpotlight().attemptsTo(ExecuteGet.withToken(Constants.getData(strEndPoint), strIdUser));

	}
	
	@Then("Validar que el status code sea {int} y la respuesta contenga")
	public void validarQueElStatusCodeSeaYLaRespuestaContenga(Integer intStatusCode, io.cucumber.datatable.DataTable dataTable) {
	    //OnStage.theActorInTheSpotlight().should(seeThatResponse(validateResponse -> validateResponse.statusCode(intStatusCode)));
	    OnStage.theActorInTheSpotlight().should(seeThatResponse(validateResponse -> 
	    validateResponse.statusCode(intStatusCode).body("name", CoreMatchers.equalTo("Nico"))));

	    
	}
	
}
