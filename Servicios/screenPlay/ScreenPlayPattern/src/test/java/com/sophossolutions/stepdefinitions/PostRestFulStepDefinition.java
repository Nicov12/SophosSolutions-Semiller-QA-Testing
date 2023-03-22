package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.utils.Constants.getData;

import java.io.IOException;
import java.util.Map;

import com.sophossolutions.apis.RestFulApi;
import com.sophossolutions.apis.ZeldaApi;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class PostRestFulStepDefinition {
	
	
	@When("Consulta el endpoint {string} vía petición post con la data {string}")
	public void consultaElEndpointVíaPeticiónPostConLaData(String streEndpoint, String strUrlJsonData) throws IOException {
		RestFulApi.executePost(strUrlJsonData, streEndpoint);
	}
	
	@Then("Validar que el status code sea {int} y que el esquema {string} del Req Res sea correcto.")
	public void validarQueElStatusCodeSeaYQueElEsquemaDelReqResSeaCorrecto(Integer intStatusCode, String strSchema) {
		RestFulApi.validateStatusCode(intStatusCode);
		RestFulApi.validateSchema(strSchema);
	}
}
