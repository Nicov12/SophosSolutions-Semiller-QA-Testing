package com.sophossolutions.stepdefinitions;

import com.sophossolutions.apis.GoRestApi;
import com.sophossolutions.apis.RestFulApi;
import com.sophossolutions.apis.ZeldaApi;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

public class GetRestFulStepDefinition {
	
	@Given("{string} establece la base url de RestFul {string} del servicio")
	public void estableceLaBaseUrlDeRestFulDelServicio(String string, String strBaseUrl) {
		RestFulApi.setBaseUrl(Constants.getData(strBaseUrl));;
	}
	@When("Consulta el endpoint {string} vía get")
	public void consultaElEndpointVíaGet(String strEndPoint) {
	    RestFulApi.executeGetRest(Constants.getData(strEndPoint));
	    SerenityRest.lastResponse().prettyPeek();
	}
	
	@Then("Validar que el status code de la pagina zelda sea {int}, la respuesta contenga los datos correctos")
	public void validarQueElStatusCodeDeLaPaginaZeldaSeaLaRespuestaContengaLosDatosCorrectos(Integer intStatusCode, io.cucumber.datatable.DataTable dataTable) {
		RestFulApi.validateStatusCode(intStatusCode);
		RestFulApi.validateUserFields(dataTable);
	}
}
