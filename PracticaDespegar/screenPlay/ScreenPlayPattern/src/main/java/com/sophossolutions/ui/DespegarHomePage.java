package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.despegar.com.co/vuelos/")
public class DespegarHomePage extends PageObject{

	public static Target btnSearch =Target.the("Button for search").locatedBy("//button/descendant::em[text() = 'Buscar']");
	public static Target txtOrigen =Target.the("Button for search").locatedBy("//input[@placeholder=\"Ingresa desde dónde viajas\"]");
	public static Target btnDestino =Target.the("Button for search").locatedBy("//input[@placeholder=\"Ingresa hacia dónde viajas\"]");
	public static Target selectDestino = Target.the("Button for search").locatedBy("//li[@class='item'][1]//span//em[1]");
	
	public static Target btnIda = Target.the("Abrir Ida").locatedBy("//input[@placeholder='Ida']");
	public static Target selectIda = Target.the("select day ida").locatedBy("//div[@data-month='2023-03'][1]/descendant::div[@class='sbox5-monthgrid-datenumber-number' and text()='15']");
	public static Target btnVuelta = Target.the("Abrir Vuelta").locatedBy("//em[text() = 'Aplicar']");
	public static Target selectVuelta = Target.the("select day Vuelta").locatedBy("//div[@data-month='2023-03'][1]/descendant::div[@class='sbox5-monthgrid-datenumber-number' and text()='20']");
	
}
