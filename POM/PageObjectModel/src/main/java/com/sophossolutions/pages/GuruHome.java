package com.sophossolutions.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action; //Trae todos los metodos y atributos pero hay que utilizar "Action."

import static com.sophossolutions.actions.Action.getText; //Especificamente un metodo o atributo

import net.serenitybdd.core.pages.PageObject;

public class GuruHome extends PageObject{

	By text = By.xpath("//td[contains(text(),'Manger Id')]");
	
	public void validateText(String text) {
		
		assertEquals("Falló validación ", text, getText(getDriver(), this.text));
	
	}
	
}
