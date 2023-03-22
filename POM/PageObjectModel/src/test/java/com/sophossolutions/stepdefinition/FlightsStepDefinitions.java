package com.sophossolutions.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.NewToursFlights;
import com.sophossolutions.pages.NewToursFlightsValidate;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class FlightsStepDefinitions {

	NewToursFlights nTFlights;
	NewToursFlightsValidate nTFV;
	
	@Managed /* Redirecciona a serenity.properties*/
	WebDriver myBrowser;
	
	@Given("Entro a la pagina NewTours {string}")
	public void entroALaPaginaNewTours(String url) {
	    nTFlights.navegar(Constants.getData(url));
	}
	@When("Selecciono el apartado de Flights")
	public void seleccionoElApartadoDeFlights() {
	    nTFlights.clickNavegarTo();
	}
	@When("Selecciona las opciones")
	public void seleccionaLasOpciones(io.cucumber.datatable.DataTable data) {
		nTFlights.selectOptions(data);

	}
	@Then("Valido el vuelo")
	public void validoElVuelo() {
		System.out.println("Entro al THEN\nSe supone que guardó todas las opciones y seleccionó el vuelo");
	}
}
