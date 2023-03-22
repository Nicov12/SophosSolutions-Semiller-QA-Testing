package com.sophossolutions.interactions;

import com.sophossolutions.models.UserCredentials;
import com.sophossolutions.utils.Constants;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class ConsoleMessage implements Interaction {
	
	String strMessage;
	Constants user, pass;
	
	public ConsoleMessage(String strMessage) {
		super();
		this.strMessage = strMessage;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println(strMessage);
		strMessage = strMessage + " holaa";
		actor.remember("credenciales", new UserCredentials(user,pass)); //Recuerde el mensaje
	}
	
	public static ConsoleMessage withMessage(String strMessage) {

		return Tasks.instrumented(ConsoleMessage.class, strMessage);
	}

	
}
