package com.sophossolutions.actions;

import static org.mockito.ArgumentMatchers.anyString;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Action {

	public static void sendData(WebDriver myBrowser, By target, String data) {
		myBrowser.findElement(target).sendKeys(data);
	}
	
	public static void sendNumbers(WebDriver myBrowser, By target, String [] data, By buttonSubmit, By message) {
		
		for (int i = 0; i < data.length; i++) {

			String message2 = ""+data[i]+": Too low!";
			
			try {
				myBrowser.findElement(target).sendKeys(data[i]);
				clickElement(myBrowser, buttonSubmit);
				message = By.xpath("//b/i");
				System.out.println(message2);
				System.out.println(myBrowser.findElement(message).getText());
				Thread.sleep(2*1000);
				
				if(myBrowser.findElement(message).getText().contains("Correct")) {
					i = data.length;
				}
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
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
