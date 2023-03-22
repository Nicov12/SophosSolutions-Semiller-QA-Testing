package com.sophossolutions.stepdefinitions;

import com.sophossolutions.task.ExecutePost;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class MyApiPostStepDefinition {
	
	
	@When("Consulta el endpoint {string} de My API vía post con los datos")
	public void consultaElEndpointDeMyAPIVíaPostConLosDatos(String strEndpoint, io.cucumber.datatable.DataTable dataTable) {
	    //OnStage.theActorInTheSpotlight().attemptsTo(ExecutePost.withTokens(Constants.getData(strEndpoint), dataTable));
		OnStage.theActorInTheSpotlight().attemptsTo(ExecutePost.withoutTokens(Constants.getData(strEndpoint), dataTable));
	}
}
