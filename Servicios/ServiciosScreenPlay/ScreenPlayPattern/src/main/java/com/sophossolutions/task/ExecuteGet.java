package com.sophossolutions.task;

import com.sophossolutions.utils.Constants;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ExecuteGet implements Task{
	
	private String strEndpoint;
	private String strId;
	private static int intKey;
	
	public ExecuteGet(String strEndpoint, String strId, int intKey) {
		super();
		this.strEndpoint = strEndpoint;
		this.strId = strId;
		this.intKey = intKey;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		if(intKey == 1) {
			actor.attemptsTo(Get.resource(strEndpoint.concat(strId)).with(requestEspecification -> 
			requestEspecification.auth().oauth2(Constants.getData("Token"))));
		}else{
			actor.attemptsTo(Get.resource(strEndpoint.concat(strId)));
		}
		
		
		SerenityRest.lastResponse().prettyPeek();
	}
	
	public static ExecuteGet withToken(String strEndpoint, String strId) {
		
		return Tasks.instrumented(ExecuteGet.class, strEndpoint, strId, intKey = 1);
	}
	
	public static ExecuteGet withoutToken(String strEndpoint, String strId) {
		
		return Tasks.instrumented(ExecuteGet.class, strEndpoint, strId, intKey = 2);
	}

}
