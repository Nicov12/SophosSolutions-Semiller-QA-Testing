package com.sophossolutions.stepdefinitions;

import com.sophossolutions.task.ExecuteDelete;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class MyApiDeleteStepDefinition {
	
	@When("Consulta el endpoint {string} de My API para borrar el contenido con el id {string}")
	public void consultaElEndpointDeMyAPIParaBorrarElContenidoConElId(String strEndpoint, String strIdUser) {
	    OnStage.theActorInTheSpotlight().attemptsTo(ExecuteDelete.withoutToken(Constants.getData(strEndpoint), strIdUser));
	}
}
