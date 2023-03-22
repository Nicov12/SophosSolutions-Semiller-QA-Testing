package com.sophossolutions.pages;

import static com.sophossolutions.actions.Action.getText;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://testsheepnz.github.io/random-number.html")
public class NumberGame extends PageObject {
	
	By select;
	By textValidate = By.xpath("//i[contains(text(), 'Correct')]");
	By buttonRoll = By.id("rollDiceButton");
	By inputNumber = By.id("numberGuess");
	By buttonSubmit = By.id("submitButton");
	By labelTurn = By.id("turnNumber");
	By message, messageCorrect;
	
	String [] numbers = {"1","2","3","4","5","6","7","8","9","10","11","12","13"};
	
	
	
	public void navigate(String url) {
		 getDriver().navigate().to(url);;
	 }
	
	public void throwDice(String strValue) {
		Action.clickElement(getDriver(), select =  By.xpath("//select//option[@value = '"+strValue+"']"));
		Action.clickElement(getDriver(), buttonRoll);
		//Action.sendData(getDriver(), inputNumber, "4");
		Action.sendNumbers(getDriver(), inputNumber, numbers, buttonSubmit, message);
		//Action.clickElement(getDriver(), buttonSubmit);
		try {
			Thread.sleep(2*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void validateMessage(String strTextValidate, String strTurns, String strComplete) {
		strTurns = getText(getDriver(), this.labelTurn);
		strTurns = strTurns.replaceAll("[^0-9]+", "");
		assertEquals("El texto no es igual", strTextValidate+" "+strTurns+" "+strComplete, getText(getDriver(), this.textValidate));
	}
	
	public void showForConsole() {
		System.out.println(getText(getDriver(), this.labelTurn));
	}
	
	
}
