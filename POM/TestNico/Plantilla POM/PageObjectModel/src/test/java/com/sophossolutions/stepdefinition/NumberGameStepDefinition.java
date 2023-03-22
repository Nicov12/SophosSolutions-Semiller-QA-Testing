package com.sophossolutions.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.NumberGame;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class NumberGameStepDefinition {
	
	NumberGame numberGame;
	
	@Managed /* Redirecciona a serenity.properties*/
	WebDriver myBrowser;
	
	@Given("Dado que me encuentro en la pagina {string}")
	public void dadoQueMeEncuentroEnLaPagina(String strUrlPage) {
	    numberGame.navigate(Constants.getData(strUrlPage));
	}
	@When("hago roll con cantidad {string}")
	public void hagoRollConCantidad(String strValue) {
	    numberGame.throwDice(strValue);
	}
	@Then("veo el mensaje {string} {string} {string}")
	public void veoElMensaje(String strTextValidate, String strTurns, String strComplete) {
		
	    numberGame.validateMessage(strTextValidate,strTurns,strComplete);
	}
	@Then("imprimo el numero de intentos por consola")
	public void imprimoElNumeroDeIntentosPorConsola() {
	    numberGame.showForConsole();
	}
}
