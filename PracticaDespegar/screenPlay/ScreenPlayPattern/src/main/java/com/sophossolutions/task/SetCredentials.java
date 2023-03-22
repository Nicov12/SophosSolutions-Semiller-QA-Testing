package com.sophossolutions.task;

import com.sophossolutions.interactions.ConsoleMessage;
import com.sophossolutions.models.UserCredentials;
import com.sophossolutions.ui.GuruLoginPage;
import com.sophossolutions.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SetCredentials implements Task{
	
	String strUser;
	String strPass;
	//Creo variables Target
	Target trgUser;
	Target trgPass;
	Target trgSubmit;
		
	public SetCredentials(String user, String pass) {
		
		this.strUser = user;
		this.strPass = pass;
		
	}	

	public SetCredentials(String user, String pass, Target trgUser, Target trgPass, Target trgSubmit) {
		
		this.strUser = user;
		this.strPass = pass;
		this.trgUser = trgUser;
		this.trgPass = trgPass;
		this.trgSubmit = trgSubmit;
		
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(this.strUser).into(trgUser),
				Enter.theValue(this.strPass).into(trgPass),
				ConsoleMessage.withMessage("Hola mundo"),
				Click.on(trgSubmit)
				);
		UserCredentials strRecordarMensaje = actor.recall("credenciales");
		System.out.println(strRecordarMensaje);
	}
	
	
	public static SetCredentials with() {
		
		return Tasks.instrumented(SetCredentials.class,"hola");
	}
	
																//Añado los campos según la pagina
	public static SetCredentials forNewTours(String strUser, String strPass) {
			
		return Tasks.instrumented(SetCredentials.class, strUser, strPass, LoginPage.txtUser, LoginPage.txtPassword, LoginPage.btnSubmit);
		//Con el instrumented llamo el constructor
	}
	
	public static SetCredentials forGuru(String strUser, String strPass) {
		
		return Tasks.instrumented(SetCredentials.class, strUser, strPass, GuruLoginPage.txtUser, GuruLoginPage.txtPassword, GuruLoginPage.btnSubmit);
	}

}
