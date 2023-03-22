package com.sophossolutions.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.GuruHome;
import com.sophossolutions.pages.GuruLogin;
import com.sophossolutions.pages.NewToursHome;
import com.sophossolutions.pages.NewToursLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class GuruLoginStepDefinitions {
	
	GuruLogin  guruLogin;
	GuruHome guruHome;
	NewToursHome nTHome;
	NewToursLogin nTLogin;
	
	@Managed /* Redirecciona a serenity.properties*/
	WebDriver myBrowser;
	//Guru99
	@Given("Me encuentro en la pagina Guru99 {string}")
	public void meEncuentroEnLaPaginaGuru99(String string) {
	    guruLogin.navegar(string);
	}
	@When("En la pagina Guru99 ingresa el usuario {string} y la clave {string} y se autentica")
	public void enLaPaginaGuru99IngresaElUsuarioYLaClaveYSeAutentica(String string, String string2) {
	    guruLogin.login(string, string2);
	}

	@Then("valido el mensaje {string}")
	public void validoElMensaje(String string) {
	    guruHome.validateText(string);
	}
	
	//NewTours
	@Given("Me encuentro en la pagina GuruNewTours {string}")
	public void meEncuentroEnLaPaginaGuruNewTours(String string) {
	    nTLogin.navegar(string);
	}
	@When("En la pagina GuruNewTours ingresa el usuario {string} y la clave {string} y se autentica")
	public void enLaPaginaGuruNewToursIngresaElUsuarioYLaClaveYSeAutentica(String string, String string2) {
	    nTLogin.login(string, string2);
	}
	@Then("En la pagina GuruNewTours valido el mensaje {string}")
	public void enLaPaginaGuruNewToursValidoElMensaje(String string) {
		nTHome.validateText(string);
	}
	
	
	
}
