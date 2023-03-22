package com.sophossolutions.stepdefinitions;

import com.sophossolutions.task.FindFlightWith;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class WingoFindManyStepDefinition {
	
	

	@When("I enter the name {string} and name {string} in the fields to search for a flight")
	public void iEnterTheNameAndNameInTheFieldsToSearchForAFlight(String strOrigen, String strDestino) {
		OnStage.theActorInTheSpotlight().wasAbleTo(FindFlightWith.findFlightWith(strOrigen, strDestino));
	}

}
