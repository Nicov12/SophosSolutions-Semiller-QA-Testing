package com.sophossolutions.task;

import com.sophossolutions.utils.Constants;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.questions.RestQueryFunction;

public class ExecuteDelete implements Task{
	
	private String strEndpoint;
	private String strId;
	private static int intKey;
	
	
	
	public ExecuteDelete(String strEndpoint, String strId, int intKey) {
		super();
		this.strEndpoint = strEndpoint;
		this.strId = strId;
		this.intKey = intKey;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		if(intKey == 1) {
			actor.attemptsTo(Delete.from(strEndpoint.concat(strId)).with(requestEspecification ->
			requestEspecification.auth().oauth2(Constants.getData("Token"))));
		}else{
			actor.attemptsTo(Delete.from(strEndpoint.concat(strId)));
		}
		
		SerenityRest.lastResponse().prettyPeek();
		
	}
	
	public static ExecuteDelete withToken(String strEndpoint, String strId) {
		
		return Tasks.instrumented(ExecuteDelete.class, strEndpoint, strId, intKey=1);
	}
	
	public static ExecuteDelete withoutToken(String strEndpoint, String strId) {
		
		return Tasks.instrumented(ExecuteDelete.class, strEndpoint, strId, intKey=2);
	}

}
