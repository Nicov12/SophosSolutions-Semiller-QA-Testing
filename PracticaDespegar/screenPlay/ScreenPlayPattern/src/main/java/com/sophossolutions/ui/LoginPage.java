package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.guru99.com/test/newtours/")
public class LoginPage extends PageObject {
	
	public static Target txtUser=Target.the("Campo de username").locatedBy("//input[@name='userName']");
	public static Target txtPassword=Target.the("Campo de password").locatedBy("//input[@name='password']");
	public static Target btnSubmit=Target.the("Botón de ingresar").locatedBy("//input[@type='submit']");

}
