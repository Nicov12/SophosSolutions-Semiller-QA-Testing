package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.wingo.com/")
public class WingoPage {
	
	//ORIGEN
	public static Target btnOrigen = Target.the("Select origen").locatedBy("//div[contains(@class, 'styledSelectOrigen')]");
	public static Target inputOrigen = Target.the("Write origen").locatedBy("//input[@id='inputOrigen']");
	public static Target optionOrigen = Target.the("option origen").locatedBy("//span[@class = 'textCity' and contains(text(), 'Cali')]");
	//DESTINO
	public static Target inputDestino = Target.the("Write destino").locatedBy("//input[@id='inputDestino']");
	public static Target optionDestino = Target.the("option destino").locatedBy("//span[@class = 'textCity' and contains(text(), 'Bogotá')]");
	//Día ida
	public static Target optionDayOneWay = Target.the("option ida").locatedBy("(//table[@class='month1']//div[contains(@class,'toMonth') and contains(text(),'23')])[1]");
	//Día vuelta
	public static Target optionDayReturn = Target.the("option vuelta").locatedBy("(//table[@class='month2']//div[contains(@class,'toMonth') and contains(text(),'10')])[2]");
	//Boton buscar
	public static Target btnSearch = Target.the("btn search").locatedBy("//div[contains(@class,'bt-search')]");
	
	
	public static Target selectOrigen = Target.the("select first origen")
			.locatedBy("//div[@class ='select']//ul[@id='comboOrigen']//li//span[1]");
	
	public static Target selectDestino = Target.the("select first destino")
			.locatedBy("//div[@class ='select']//ul[@id='comboDestino']//li//span[1]");
	
	public static Target selectDayOn = Target.the("select day one way")
			.locatedBy("(//table[@class='month1']//div[contains(@class,'toMonth') and contains(text(),'22')])[1]");
	
	public static Target selectDayReturn = Target.the("select day one way")
			.locatedBy("(//table[@class='month1']//div[contains(@class,'toMonth') and contains(text(),'29')])[2]");
	
	
}
