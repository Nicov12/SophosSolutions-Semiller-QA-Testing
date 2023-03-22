package com.sophossolutions.task;

import com.sophossolutions.ui.WingoPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class FindFlightWith implements Task {
	
	//Origen
	Target btnOrigen;
	Target inputOrigen;
	String strOrigen;
	Target selectOrigen;
	//Destino
	Target inputDestino;
	String strDestino;
	Target selectDestino;
	Target selectDayOn;
	Target selectDayReturn;
	Target btnSearch;
	
	
	
	public FindFlightWith(Target btnOrigen, Target inputOrigen, String strOrigen, Target selectOrigen,
			Target inputDestino, String strDestino, Target selectDestino, Target selectDayOn,
			Target selectDayReturn, Target btnSearch) {
		super();
		this.btnOrigen = btnOrigen;
		this.inputOrigen = inputOrigen;
		this.strOrigen = strOrigen;
		this.selectOrigen = selectOrigen;
		this.inputDestino = inputDestino;
		this.strDestino = strDestino;
		this.selectDestino = selectDestino;
		this.selectDayOn = selectDayOn;
		this.selectDayReturn = selectDayReturn;
		this.btnSearch = btnSearch;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(btnOrigen),
				 Enter.theValue(strOrigen).into(inputOrigen),
				 Click.on(selectOrigen),
				 Enter.theValue(strDestino).into(inputDestino),
				 Click.on(selectDestino),
				 Click.on(selectDayOn),
				 Click.on(selectDayReturn),
				 Click.on(btnSearch));
		
	}
	
public static FindFlightWith findFlightWith(String strOrigen, String strDestino) {
		
		return Tasks.instrumented(FindFlightWith.class, WingoPage.btnOrigen, WingoPage.inputOrigen, strOrigen, WingoPage.selectOrigen,
								  WingoPage.inputDestino, strDestino, WingoPage.selectDestino, WingoPage.selectDayOn, WingoPage.selectDayReturn,
								  WingoPage.btnSearch);
	}

}
