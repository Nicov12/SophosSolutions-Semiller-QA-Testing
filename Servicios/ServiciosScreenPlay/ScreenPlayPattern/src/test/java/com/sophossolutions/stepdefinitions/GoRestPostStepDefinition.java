package com.sophossolutions.stepdefinitions;

import com.sophossolutions.task.ExecutePost;
import com.sophossolutions.utils.Constants;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class GoRestPostStepDefinition {
	
	
	@When("Consulta el endpoint {string} por medio de una peticion post con la data")
	public void consultaElEndpointPorMedioDeUnaPeticionPostConLaData(String strEndpoint, io.cucumber.datatable.DataTable dataTable) {
	    OnStage.theActorInTheSpotlight().attemptsTo(ExecutePost.withTokens(Constants.getData(strEndpoint), dataTable));
	}
	@Then("Validar que el status code sea {int} y que el esquema {string} sea correcto.")
	public void validarQueElStatusCodeSeaYQueElEsquemaSeaCorrecto(Integer intStatusCode, String strSchema) {
		OnStage.theActorInTheSpotlight().should(seeThatResponse(validateResponse -> 
		validateResponse.statusCode(intStatusCode)));
	}
}
