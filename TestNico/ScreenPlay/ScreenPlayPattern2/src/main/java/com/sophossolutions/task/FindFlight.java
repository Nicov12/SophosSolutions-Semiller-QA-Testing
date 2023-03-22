package com.sophossolutions.task;

import com.sophossolutions.ui.WingoPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class FindFlight implements Task {
	
	Target btnOrigen;
	Target inputOrigen;
	Target optionOrigen;
	Target inputDestino;
	Target optionDestino;
	Target optionDayOneWay;
	Target optionDayReturn;
	Target btnSearch;
	

	public FindFlight(Target btnOrigen, Target inputOrigen, Target optionOrigen, Target inputDestino,
			Target optionDestino, Target optionDayOneWay, Target optionDayReturn, Target btnSearch) {
		super();
		this.btnOrigen = btnOrigen;
		this.inputOrigen = inputOrigen;
		this.optionOrigen = optionOrigen;
		this.inputDestino = inputDestino;
		this.optionDestino = optionDestino;
		this.optionDayOneWay = optionDayOneWay;
		this.optionDayReturn = optionDayReturn;
		this.btnSearch = btnSearch;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(btnOrigen),
						 Enter.theValue("cal").into(inputOrigen),
						 Click.on(optionOrigen),
						 Enter.theValue("bog").into(inputDestino),
						 Click.on(optionDestino),
						 Click.on(optionDayOneWay),
						 Click.on(optionDayReturn),
						 Click.on(btnSearch));
	}

	public static FindFlight findFlight() {
		
		return Tasks.instrumented(FindFlight.class, WingoPage.btnOrigen, WingoPage.inputOrigen,WingoPage.optionOrigen,
								  WingoPage.inputDestino, WingoPage.optionDestino, WingoPage.optionDayOneWay, WingoPage.optionDayReturn,
								  WingoPage.btnSearch);
	}
	
	
}
