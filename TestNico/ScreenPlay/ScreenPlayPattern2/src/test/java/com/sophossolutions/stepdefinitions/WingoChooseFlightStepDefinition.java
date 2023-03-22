package com.sophossolutions.stepdefinitions;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import com.sophossolutions.exception.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.FindFlight;
import com.sophossolutions.ui.WingoFlightsPage;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;



public class WingoChooseFlightStepDefinition {
	
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} sets the Wingo url {string}")
	public void setsTheWingoUrl(String strActor, String strUrl) {
	    OnStage.theActorCalled(strActor).wasAbleTo(Open.url(Constants.getData(strUrl)));
	}
	@When("I enter the data in the fields to search for a flight")
	public void iEnterTheDataInTheFieldsToSearchForAFlight() {
	    System.out.println("Debo de llenar los campos");
	    OnStage.theActorInTheSpotlight().wasAbleTo(FindFlight.findFlight());
	}
	@Then("I visualize the flights that the page offers me and validate the message {string}")
	public void iVisualizeTheFlightsThatThePageOffersMeAndValidateTheMessage(String strTextValidate) {
	    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(WingoFlightsPage.validate),
	    		Matchers.equalTo(strTextValidate)).orComplainWith(UnexpectedResult.class,
	    				"El titulo del elemento no coincide"));
	}
}
