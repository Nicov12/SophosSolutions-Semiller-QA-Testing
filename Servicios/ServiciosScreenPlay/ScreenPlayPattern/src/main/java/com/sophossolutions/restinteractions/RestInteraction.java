package com.sophossolutions.restinteractions;

import static com.sophossolutions.utils.Constants.getData;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.sophossolutions.utils.Constants;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.rest.SerenityRest;

public class RestInteraction {
	
	public static String strBaseUrl;
	
	public static void setBaseUrl(String strBaseUrl) {
		RestInteraction.strBaseUrl = strBaseUrl;
	}
	
	public static void executeGetRest(String strEndPoint) {
		SerenityRest.given().when().get(strBaseUrl.concat(strEndPoint));
		
		SerenityRest.lastResponse().prettyPeek();
	}	
	
	public static void validateStatusCode(int intStatusCode) {
		int intResponseCode = SerenityRest.lastResponse().getStatusCode();
		
		assertEquals(intStatusCode, intResponseCode, "El codigo esperado no coincide" );
	}
	
	public static void validateField(String strFieldName, String strFieldValue) {
		JsonPath responseJSON = SerenityRest.lastResponse().jsonPath();
		String strFieldValueObtained = responseJSON.getString(strFieldName); 
		
		assertEquals(strFieldValue, strFieldValueObtained, "El contenido de los campos no coincide" );
	}

	public static void validateUserFields(String strKey, String strValue) {
		
		JsonPath responseJSON = SerenityRest.lastResponse().jsonPath();
		
		String strValueObtained = responseJSON.getString(strKey); 
		
        assertEquals(strValue, strValueObtained, "El "+strKey+" no coincide" );
            
	}
	
	public static void validateSchema(String strSchema) {
		SerenityRest.lastResponse().then()
		.assertThat().body(JsonSchemaValidator
				.matchesJsonSchema(new File(strSchema)));
	}
	
	public static void executePost(String strBody, String strEndpoint) throws IOException {
			
			String jsonBody = new String(Files.readAllBytes(Path.of(strBody)));
			
			System.out.println(jsonBody);
			
			SerenityRest.given().contentType(ContentType.JSON).when()
			.body(jsonBody).post((RestInteraction.strBaseUrl).concat(strEndpoint));
			SerenityRest.lastResponse().prettyPeek();
		
	}
	
	public static void executePostWithToken(String strBody, String strToken, String strEndpoint) {
		String jsonBody;
		try {
			jsonBody = new String(Files.readAllBytes(Path.of(strBody)));
			SerenityRest.given().auth().oauth2(strToken)
			.contentType(ContentType.JSON).when().body(jsonBody)
			.post((RestInteraction.strBaseUrl).concat(strEndpoint));
			
			SerenityRest.lastResponse().prettyPeek();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static int executePostAndGetUser(String strBody, String strEndpoint) throws IOException {

		//Archivo JSON donde tengo la info a enviar se convierte en STRING
		String jsonBody = new String(Files.readAllBytes(Path.of(strBody)));
		
		//Llamado POST a la API
		SerenityRest.given().contentType(ContentType.JSON).when()
		.body(jsonBody).post((RestInteraction.strBaseUrl).concat(strEndpoint));
		SerenityRest.lastResponse().prettyPeek();
		
		//Obtener el id del anterior llamado (Usuario creado)
		JsonPath responseJSON = SerenityRest.lastResponse().jsonPath();
		int intIdUserCreated = Integer.parseInt(responseJSON.getString("id"));

		//Retorno el id del usuario
		return intIdUserCreated;
	}
	
	public static void executeGetUserCreated(String strEndPoint) {
		
		//El endpoint es users + el id del usuario creado
		SerenityRest.given().when().get(strBaseUrl.concat(strEndPoint));
		SerenityRest.lastResponse().prettyPeek();
	}
	
	
}
