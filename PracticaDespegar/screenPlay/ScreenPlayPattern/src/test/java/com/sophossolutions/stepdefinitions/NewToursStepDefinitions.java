package com.sophossolutions.stepdefinitions;



import org.hamcrest.Matchers;

import com.sophossolutions.exception.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.SetCredentials;
import com.sophossolutions.ui.HomePage;
import com.sophossolutions.ui.LoginPage;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class NewToursStepDefinitions {

	
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("Me loguearé en la página  {string}")
	public void meLoguearéEnLaPágina(String url) {
		OnStage.theActorCalled("Nico").wasAbleTo(Open.url(Constants.getData(url)));
	    //OnStage.theActorCalled("Nico").wasAbleTo(Open.browserOn(new LoginPage()));
	    //OnStage.theActorInTheSpotlight().wasAbleTo(url);;
	}
	@When("Ingreso el {string} y la {string}")
	public void ingresoElYLa(String user, String pass) {
	    OnStage.theActorInTheSpotlight().wasAbleTo(SetCredentials.forNewTours(user,
	    															   pass));
	}
	@Then("Valido el mensaje {string}")
	public void validoElMensaje(String string) {
	    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(HomePage.txtText),
	    		Matchers.equalTo(string)).orComplainWith(UnexpectedResult.class, 
	    				"El titulo del elemento no coincide con el esperado"));
	}
	
	
}
