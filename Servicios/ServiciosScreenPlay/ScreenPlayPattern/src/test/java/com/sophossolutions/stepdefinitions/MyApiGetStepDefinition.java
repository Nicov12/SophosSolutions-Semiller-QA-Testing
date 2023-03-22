package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import org.hamcrest.CoreMatchers;

import com.sophossolutions.task.ExecuteGet;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class MyApiGetStepDefinition {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} establece la base url {string}")
	public void estableceLaBaseUrl(String strActorName, String strBaseUrl) {
		OnStage.theActorCalled(strActorName).whoCan(CallAnApi.at(Constants.getData(strBaseUrl)));
	}
	@When("Consulta el endpoint {string} de My API con el id {string}")
	public void consultaElEndpointDeMyAPIConElId(String strEndPoint, String strIdUser) {
		//OnStage.theActorInTheSpotlight().attemptsTo(ExecuteGet.withToken(Constants.getData(strEndPoint), strIdUser));
	    OnStage.theActorInTheSpotlight().attemptsTo(ExecuteGet.withoutToken(Constants.getData(strEndPoint), strIdUser));
	}
	@Then("Validar que el status code sea {int}")
	public void validarQueElStatusCodeSea(Integer intStatusCode) {
		OnStage.theActorInTheSpotlight().should(seeThatResponse(validateResponse -> 
	    validateResponse.statusCode(intStatusCode)));
	}
}
