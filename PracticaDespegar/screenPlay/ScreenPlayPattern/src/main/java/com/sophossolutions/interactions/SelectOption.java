package com.sophossolutions.interactions;

import java.util.ArrayList;
import java.util.*;

import com.sophossolutions.ui.DespegarFlightPage;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;


public class SelectOption implements Interaction{
	
	Target select;
	Target flight;
	String strValue;
	int intValue;
	ArrayList<String> strNames = new ArrayList<>();
	ArrayList<String> strNamesForFlight = new ArrayList<>();
	ArrayList<String> lstPrices = new ArrayList<>();
	ArrayList<String> lstPricesWithoutPoints = new ArrayList<>();
	String strPriceFinal = null;
	String strNameAeroline = null;
	
	public SelectOption(Target select, int intValue) {
		super();
		this.select = select;
		this.intValue = intValue;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("intValue: "+intValue);
		if(intValue == 1) {
			showFlights(actor, 1);
		}else if(intValue == 2) {
			showFlights(actor, 2);
		}else if(intValue == 3) {
			showFlights(actor, 3);
		}
		//actor.attemptsTo(SelectFromOptions.byValue(this.strValue).from(this.select));
		//actor.attemptsTo(SelectFromOptions.byIndex(intValue).from(this.select));
	}
	
	public void showFlights(Actor actor, int intOption) {
		
		Target flights = null;
		Target prices = null;
		Target luggage = null;
		if(intOption == 1) {
			flights = Target.the("name of aeroline").locatedBy("//span[@class ='name']"); 
			prices = Target.the("list of final price").locatedBy
						("//cluster//span[@class = \"amount price-amount\"]");
			//ListOfWebElementFacades listFlights3 = luggage.resolveAllFor(actor);
			
		}else if(intOption == 2) {
			flights = Target.the("name of aeroline").locatedBy("//span[@class ='name']"); 
			prices = Target.the("list of final price").locatedBy
					("//cluster//span[@class = \"amount price-amount\"]");
		}else if(intOption == 3) {
			flights = Target.the("name of aeroline").locatedBy("//span[@class ='name']"); 
			prices = Target.the("list of final price").locatedBy
					("//cluster//span[@class = \"amount price-amount\"]");
		}
		
		
		ListOfWebElementFacades listFlights = flights.resolveAllFor(actor);
		ListOfWebElementFacades listFlights2 = prices.resolveAllFor(actor);
		
		
		int i= 0;
		for(WebElementFacade element : listFlights) {
			System.out.println(element.getText());
			//System.out.println("Entro al nombre de todas las aerolineas");
			strNames.add(element.getText());
		}
		searchAeroline();
		for(WebElementFacade element : listFlights2) {
			System.out.println(element.getText());
			//System.out.println("Entro al precio de todos los vuelos");
			lstPrices.add(listFlights2.get(i).getTextContent());
			convertStrings(lstPrices.get(i));
			//System.out.println("precio: "+lstPrices.get(i)+ "$");
			i++;
		}
		
		if(intOption == 1) {
			System.out.println("DATOS VUELOS RECOMENDADOS\n"+searchMenor(1));
		}else if(intOption == 2) {
			System.out.println("DATOS VUELOS BARATOS\n"+searchMenor(2));
		}else if(intOption == 3) {
			System.out.println("DATOS VUELOS RAPIDOS\n"+searchMenor(3));
		}
		
		
	}
	
	private void searchAeroline() {
		
		for (int i = 0; i < strNames.size(); i++) {
			strNamesForFlight.add(strNames.get(i));
			i++;
		}
	}
	
	private String searchMenor(int intOption) {
		
		if(intOption == 2) {
			int intMenor = Integer.parseInt(lstPricesWithoutPoints.get(0));
			for (int j = 1; j < lstPrices.size()-1; j++) {
				int intNum = Integer.parseInt(lstPricesWithoutPoints.get(j));
				if(intMenor < intNum) {
					strPriceFinal = lstPrices.get(0);
					strNameAeroline = strNamesForFlight.get(0);
				}else {
					intMenor = intNum;
					strPriceFinal = lstPrices.get(j);
					strNameAeroline = strNamesForFlight.get(j);
				}
			}
		}else {
			strNameAeroline = strNamesForFlight.get(0);
			strPriceFinal = lstPrices.get(0);
		}
		
		return "Aerolinea: "+strNameAeroline+"\n Precio: "+strPriceFinal;
	}
	
	private void convertStrings(String string) {
		String intMayor = removePunctuations(lstPrices.get(0).toString());
		for (String change : lstPrices) {
			lstPricesWithoutPoints.add(removePunctuations(change));
		}
	}
	
	public static String removePunctuations(String source) {
        return source.replaceAll("\\p{Punct}", "");
    }
	
	public static SelectOption selectOption(Target select, int intValue) {
		return Tasks.instrumented(SelectOption.class, select, intValue);
	}
	
	
}
