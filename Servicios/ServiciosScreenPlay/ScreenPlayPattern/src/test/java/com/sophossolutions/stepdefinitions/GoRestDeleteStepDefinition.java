package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import com.sophossolutions.task.ExecuteDelete;
import com.sophossolutions.task.ExecuteGet;
import com.sophossolutions.task.ExecutePost;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class GoRestDeleteStepDefinition {
	
	
	@When("Consulta el endpoint for delete {string} with id {string}")
	public void consultaElEndpointForDeleteWithId(String strEndPoint, String strIdUser) {
		//OnStage.theActorInTheSpotlight().attemptsTo(ExecuteGet.withToken(Constants.getData(strEndPoint), strIdUser));
	    OnStage.theActorInTheSpotlight().attemptsTo(ExecuteDelete.withToken(Constants.getData(strEndPoint), strIdUser));
	}
	
	@Then("Validar que el status code sea {int} y se haya eliminado el usuario")
	public void validarQueElStatusCodeSeaYSeHayaEliminadoElUsuario(Integer intStatusCode) {
	    System.out.println("Hola");
	    OnStage.theActorInTheSpotlight().should(seeThatResponse(validateResponse -> 
		validateResponse.statusCode(intStatusCode)));
	}
}
