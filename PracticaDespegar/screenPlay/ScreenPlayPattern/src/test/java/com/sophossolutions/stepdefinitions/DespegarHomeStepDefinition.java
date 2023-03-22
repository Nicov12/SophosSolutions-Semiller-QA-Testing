package com.sophossolutions.stepdefinitions;

import com.sophossolutions.task.SetInfo;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DespegarHomeStepDefinition {
	
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}
	@Given("I enter the page {string}")
	public void iEnterThePage(String url) {
	    OnStage.theActorCalled("Automator").wasAbleTo(Open.url(Constants.getData(url)));
	}
	@When("I enter the {string} and the {string}")
	public void iEnterTheAndThe(String username, String pass) {
	    OnStage.theActorInTheSpotlight().wasAbleTo(SetInfo.forDespegar
	    		(Constants.getData(username),Constants.getData(pass)));
	}
	@Then("I see the flights")
	public void iSeeTheFlights() {
	    System.out.println("Estoy en el then");
	}
	
}
