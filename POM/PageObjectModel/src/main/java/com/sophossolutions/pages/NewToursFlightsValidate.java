package com.sophossolutions.pages;

import static com.sophossolutions.actions.Action.getText;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class NewToursFlightsValidate extends PageObject {

	By textValidate = By.xpath("//font[contains(text(),'Please')]");
	By textRare = By.xpath("//td/p[@align='left']/font/b/font[@size='4']/text()[2]");
	
	public void validateText(String text) {
		
		assertEquals("Falló validación ", text, getText(getDriver(), textRare));
	}
}
