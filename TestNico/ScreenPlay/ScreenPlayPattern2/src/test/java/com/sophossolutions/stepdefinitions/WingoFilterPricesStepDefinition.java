package com.sophossolutions.stepdefinitions;

import com.sophossolutions.task.FilterPrices;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class WingoFilterPricesStepDefinition {
	
	@When("I filter the prices")
	public void iFilterThePrices() {
		System.out.println("Debo filtrar los precios");
	    OnStage.theActorInTheSpotlight().wasAbleTo(FilterPrices.filterPricesOfFlights());
	}
}
