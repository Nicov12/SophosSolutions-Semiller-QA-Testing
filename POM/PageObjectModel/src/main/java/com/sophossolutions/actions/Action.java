package com.sophossolutions.actions;

import java.awt.Font;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v109.input.Input;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.support.ui.Select;

public class Action {

	public static void sendData(WebDriver myBrowser, By target, String data) {
		myBrowser.findElement(target).sendKeys(data);
	}
	
	public static void clickElement(WebDriver myBrowser, By target) {
		myBrowser.findElement(target).click();
	}
	
	public static String getText(WebDriver myBrowser, By target) {
		
		return myBrowser.findElement(target).getText();
		
	}
	
	public static void selectFromOption(WebDriver myBrowser, String opcion, By target) {
		WebElement listaSelect = myBrowser.findElement(target);
		Select select = new Select(listaSelect);
		select.selectByVisibleText(opcion);
	}
	
}
