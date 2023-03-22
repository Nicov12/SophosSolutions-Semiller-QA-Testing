package com.sophossolutions.task;

import com.sophossolutions.interactions.SelectOption;
import com.sophossolutions.ui.DespegarFlightPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ChooseOption implements Task {
	
	Target select;
	int intValue;
	
	public ChooseOption(Target select, int intValue) {
		super();
		this.select = select;
		this.intValue = intValue;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("Estoy en el actor de chooseOption");
		System.out.println("valor que entró: "+intValue);
	
		actor.attemptsTo(
	//			Click.on(DespegarFlightPage.prueba)
				//Click.on(DespegarFlightPage.popUp),
				SelectOption.selectOption(select, intValue)
				//Click.on(DespegarFlightPage.selectVuelosBaratos.of(String.valueOf(intValue)))
//				WaitUntil.the(DespegarFlightPage.selectVuelosBaratos, WebElementStateMatchers.hasValue(String.valueOf(intValue))).forNoMoreThan(3).seconds()
				);
		
		try {
			Thread.sleep(3*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static ChooseOption setOption(Target select, int intValue){
		return Tasks.instrumented(ChooseOption.class, select, intValue);
	}

}
