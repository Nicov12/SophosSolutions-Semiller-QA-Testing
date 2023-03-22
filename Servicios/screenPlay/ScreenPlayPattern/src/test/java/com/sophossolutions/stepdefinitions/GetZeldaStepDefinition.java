package com.sophossolutions.stepdefinitions;

import java.util.Map;

import com.sophossolutions.apis.GoRestApi;
import com.sophossolutions.apis.ZeldaApi;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GetZeldaStepDefinition {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} establece la base url {string} del servicio zelda")
	public void estableceLaBaseUrlDelServicioZelda(String string, String strBaseUrl) {
	    ZeldaApi.setBaseUrl(Constants.getData(strBaseUrl));
	}
	@When("Consulta el endpoint {string} de zelda")
	public void consultaElEndpointDeZelda(String strEndPoint) {
		ZeldaApi.executeGetRest(Constants.getData(strEndPoint));
	}
	@Then("Validar que el status code de la pagina zelda sea {int}, la respuesta contenga los datos correctos y el esquema {string} correcto")
	public void validarQueElStatusCodeDeLaPaginaZeldaSeaLaRespuestaContengaLosDatosCorrectosYElEsquemaCorrecto(Integer intStatusCode, String strSchema, io.cucumber.datatable.DataTable dataTable) {
		ZeldaApi.validateStatusCode(intStatusCode);
		ZeldaApi.validateUserFields(dataTable);
		ZeldaApi.validateSchema(strSchema);
	}

}
