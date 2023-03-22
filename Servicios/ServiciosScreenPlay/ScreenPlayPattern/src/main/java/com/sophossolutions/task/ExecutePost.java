package com.sophossolutions.task;

import java.util.Map;

import org.apache.http.HttpHeaders;

import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class ExecutePost implements Task{
	
	private String strEndpoint;
	private Map<String, String> mapBody;
	private static int intKey;
	
	
	public ExecutePost(String strEndpoint, DataTable dataTable, int intKey) {
		super();
		this.strEndpoint = strEndpoint;
		this.mapBody = dataTable.asMap(String.class, String.class);
		this.intKey = intKey;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		if(intKey == 1) {
			actor.attemptsTo(Post.to(strEndpoint).with(requestEspecification -> 
			requestEspecification
			.header(HttpHeaders.CONTENT_TYPE, ContentType.JSON)
			.auth().oauth2(Constants.getData("Token")).body(mapBody)));
		}else{
			actor.attemptsTo(Post.to(strEndpoint).with(requestEspecification -> 
			requestEspecification.header(HttpHeaders.CONTENT_TYPE, ContentType.JSON).body(mapBody)));
		}
		
		SerenityRest.lastResponse().prettyPeek();
	}

	public static ExecutePost withTokens(String strEndpoint, DataTable dataTable) {
		return Tasks.instrumented(ExecutePost.class, strEndpoint, dataTable, intKey = 1);
	}
	
	public static ExecutePost withoutTokens(String strEndpoint, DataTable dataTable) {
		return Tasks.instrumented(ExecutePost.class, strEndpoint, dataTable, intKey = 2);
	}
}	
