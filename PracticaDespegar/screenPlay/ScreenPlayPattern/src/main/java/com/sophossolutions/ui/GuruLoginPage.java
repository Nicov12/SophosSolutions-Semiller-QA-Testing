package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.guru99.com/V4/")
public class GuruLoginPage extends PageObject {

	public static Target txtUser=Target.the("username field").locatedBy("//input[@name='uid']");
	public static Target txtPassword=Target.the("password field").locatedBy("//input[@name='password']");
	public static Target btnSubmit=Target.the("Login Button").locatedBy("//input[@name='btnLogin']");
}
