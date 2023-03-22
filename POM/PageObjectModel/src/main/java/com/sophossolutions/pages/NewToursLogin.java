package com.sophossolutions.pages;

import org.openqa.selenium.By;
import com.sophossolutions.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.guru99.com/V4/")
public class NewToursLogin extends PageObject {
	
	 //Guru newTours
	 By userName = By.name("userName"); 
	 By password = By.name("password");
	 By button = By.name("submit");

	public void navegar(String url) {
		 getDriver().navigate().to(url);;
	 }
	 
	 public void login(String userName, String password) {
		 Action.sendData(getDriver(), this.userName, userName); //envio el username
		 Action.sendData(getDriver(), this.password, password); //envio la clave
		 Action.clickElement(getDriver(), this.button);
	 }
	
}
