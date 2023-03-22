package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.despegar.com.co/shop/flights/results/roundtrip/BOG/ADZ/2023-03-18/2023-04-18/2/0/0")
public class DespegarFlightPage extends PageObject{
	
	
	public static Target vuelosBaratos =Target.the("opción vuelos baratos").locatedBy("//tab-component");
	public static Target selectVuelosBaratos =Target.the("opción vuelos").locatedBy("//tab-component[{0}]");
	public static Target nameAeroline =Target.the("name of aeroline").locatedBy("//span[@class ='name']");
	public static Target lstOfPrices =Target.the("list of final price").locatedBy
			("//cluster//item-fare[@classes = 'fare-price']//span[contains(@class,\"price-amount\")]");
	public static Target popUp =Target.the("popup").locatedBy("//i[@class = 'eva-3-icon-close tooltip-close']");
	
	public static Target prueba1 = Target.the("prueba").locatedBy("//tab-component[1]");
	public static Target prueba2 = Target.the("prueba").locatedBy("//tab-component[2]");
	public static Target prueba3 = Target.the("prueba").locatedBy("//tab-component[3]");
	
	
	
}
