package com.sophossolutions.task;

import com.sophossolutions.interactions.ShowPriceFlights;
import com.sophossolutions.ui.WingoFlightsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class FilterPrices implements Task {
	
	Target txtPrice;
	
	public FilterPrices(Target txtPrice) {
		super();
		this.txtPrice = txtPrice;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("performAs de FilterPrices");
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actor.attemptsTo(
				
				ShowPriceFlights.showPrices());
		
	}
	
	public static FilterPrices filterPricesOfFlights() {
		
		return Tasks.instrumented(FilterPrices.class, WingoFlightsPage.txtPrice);
	}
	
	
	
}
