package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class WingoFlightsPage{
	
	public static Target txtPrice = Target.the("price first flight").locatedBy("(//div[@id = 'vuelos-ida']//div[contains(@class, 'card-selected')]//div[contains(@class, 'price-bundle')])[1]");
	public static Target validate = Target.the("titulo de buscar")
			.locatedBy("//div[@class='c8305f6688']");
	
}
