package com.sophossolutions.stepdefinitions;

import com.sophossolutions.task.ChooseOption;
import com.sophossolutions.ui.DespegarFlightPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DespegarFlightStepDefinition {
	
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("the results of the flights")
	public void theResultsOfTheFlights() {
		OnStage.theActorCalled("Automator").wasAbleTo(Open.url
				("https://www.despegar.com.co/shop/flights/results/roundtrip/BOG/SLP/2023-03-15/2023-03-20/1/0/0/NA/NA/NA/NA/NA?from=SB&di=1-0"));
	}
	@When("I press the option {int}")
	public void iPressTheOption(Integer int1) {
		System.out.println("Entre al WHEEEENNN");
	    OnStage.theActorInTheSpotlight().wasAbleTo(ChooseOption.setOption(DespegarFlightPage.vuelosBaratos, int1));
	}
	@Then("I see the messages")
	public void iSeeTheMessages() {
	    System.out.println("Hola estoy en el then");
	}
}
