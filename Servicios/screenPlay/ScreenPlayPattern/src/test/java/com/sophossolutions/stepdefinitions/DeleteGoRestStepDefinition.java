package com.sophossolutions.stepdefinitions;

import com.sophossolutions.apis.GoRestApi;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class DeleteGoRestStepDefinition {
	
	
	@When("Consulta el endpoint for delete {string} with id {int}")
	public void consultaElEndpointForDeleteWithId(String strEndpoint, Integer idUser) {
		SerenityRest.given().auth().oauth2(GoRestApi.STR_TOKEN).contentType(ContentType.JSON).when()
		.delete(Constants.getData("Go Rest").concat(Constants.getData(strEndpoint).concat(idUser+"")));
		SerenityRest.lastResponse().prettyPeek();
	}
	
	@Then("Validar que el status code sea {int} y se haya eliminado el usuario")
	public void validarQueElStatusCodeSeaYSeHayaEliminadoElUsuario(Integer intStatusCode) {
	    GoRestApi.validateStatusCode(intStatusCode);
	}
}
