package com.sophossolutions.interactions;

import java.util.ArrayList;
import java.util.Arrays;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class ShowPriceFlights implements Interaction {
	
	Target prices;
	String strPrices;
	ArrayList<String> lstPrices = new ArrayList<>();
	ArrayList<String> lstPricesClear = new ArrayList<>();
	ArrayList<String> lstPricesHotels = new ArrayList<>();
	ArrayList<String> lstNameHotels = new ArrayList<>();
	ArrayList<String> lstCalificationHotels = new ArrayList<>();
	
	private String strPriceMenor = null;
	private String strPriceMayor = null;
	
	
	public ShowPriceFlights() {
		super();

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("performAs de ShowPriceFlights");
		//convertPrices(actor);
		pricesOfHotels(actor);
		
	}
	
	public void pricesOfHotels(Actor actor) {
		
		Target pricesHotels = Target.the("precios de los hoteles")
				.locatedBy("//div[@data-testid = 'property-card']//span[@data-testid = 'price-and-discounted-price']");
		Target nameHotels = Target.the("nombre de los hoteles")
				.locatedBy("//div[@data-testid = 'property-card']//div[@data-testid = 'title']");
		Target calificationHotels = Target.the("nombre de los hoteles")
				.locatedBy("//div[@data-testid = 'review-score']//div[contains(@class, 'd10a6220b4')]");
		
		ListOfWebElementFacades lstprices = pricesHotels.resolveAllFor(actor);
		ListOfWebElementFacades lstName = nameHotels.resolveAllFor(actor);
		ListOfWebElementFacades lstCalification = nameHotels.resolveAllFor(actor);
		
		for (WebElementFacade element : lstName) {
			lstNameHotels.add(element.getText());
		}
		
		for (WebElementFacade element : lstCalification) {
			lstCalificationHotels.add(element.getText());
		}
		int i = 0;
		for (WebElementFacade element : lstprices) {
			
			System.out.println("- - - - -\n"+lstNameHotels.get(i));
			System.out.println("Calificacion: "+lstCalificationHotels.get(i));
			System.out.println("Precio: "+element.getText()+"\n- - - - -\n");
			lstPricesHotels.add(element.getText());
			i++;
		}
		
		
		
		
		System.out.println("Precios limpios");
		i=0;
		for (String element : lstPricesHotels) {
			lstPricesClear.add(removePunctuations(element));
			System.out.println(lstPricesClear.get(i));
			i++;
		}
		
		System.out.println("El precio menor es: "+ findNumberLow(lstPricesClear));
		System.out.println("El precio mayor es: "+ findNumberHigh(lstPricesClear));
		
	}
	
	public String findNumberLow(ArrayList<String> lstPrices) {
		int intMenor = Integer.parseInt(lstPrices.get(0));
		
		int i=0;
		for (String element : lstPrices) {
			if(Integer.parseInt(element) < intMenor) {
				intMenor = Integer.parseInt(element);
				strPriceMenor = lstPricesHotels.get(i);
			}
			i++;
		}
		
		return strPriceMenor;
	}
	
	public String findNumberHigh(ArrayList<String> lstPrices) {
		int intMayor = Integer.parseInt(lstPrices.get(0));
		
		int i=0;
		for (String element : lstPrices) {
			if(Integer.parseInt(element) > intMayor) {
				intMayor = Integer.parseInt(element);
				strPriceMayor = lstPricesHotels.get(i);
			}
			i++;
		}
		
		return strPriceMayor;
	}
	
	
	
	public static String removePunctuations(String source) {
        return source.replaceAll("[^0-9]+", "");
    }
	
	public static ShowPriceFlights showPrices() {
		return Tasks.instrumented(ShowPriceFlights.class);
	}

}
