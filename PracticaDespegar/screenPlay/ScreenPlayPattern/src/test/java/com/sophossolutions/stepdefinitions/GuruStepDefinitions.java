package com.sophossolutions.stepdefinitions;
import org.hamcrest.Matchers;

import com.sophossolutions.exception.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.SetCredentials;
import com.sophossolutions.ui.GuruHomePage;
import com.sophossolutions.ui.GuruLoginPage;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GuruStepDefinitions {

	
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}
//	@Given("I enter the page {string}")
//	public void iEnterThePage(String url) {
//	    OnStage.theActorCalled("Automator").wasAbleTo(Open.url(Constants.getData(url)));
//	}
//	@When("I enter the {string} and the {string}")
//	public void iEnterTheAndThe(String username, String pass) {
//	    OnStage.theActorInTheSpotlight().wasAbleTo(SetCredentials.forGuru(username, 
//	    															   pass));
//	}
//	@Then("I validate the text {string} in the home of the guru page")
//	public void iValidateTheTextInTheHomeOfTheGuruPage(String text) {
//	    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(GuruHomePage.txtText),
//	    		Matchers.equalTo(text)).orComplainWith(UnexpectedResult.class, 
//	    				"El titulo del elemento no coincide con el esperado"));
//	}
}
