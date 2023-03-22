package com.sophossolutions.task;

import java.util.ArrayList;
import java.util.List;

import com.sophossolutions.ui.DespegarHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SetInfo implements Task{
	
	Target trgButton;
	Target trgOrigen;
	Target trgDestino;
	Target trgInsertDestino;
	Target trgSelectDestino;
	Target trgDayIda;
	Target selectDayIda;
	Target trgDayVuelta;
	Target selectDayVuelta;
	String strOrigen;
	String strDestino;

	
	public SetInfo(String strOrigen, String strDestino, Target trgButton,
			Target trgOrigen, Target trgDestino, Target selectDestino,
			Target trgDayIda, Target selectDayIda, Target trgDayVuelta, Target selectDayVuelta) {
			
			this.strOrigen = strOrigen;
			this.strDestino = strDestino;
			this.trgButton = trgButton; // boton buscar
			this.trgOrigen = trgOrigen;
			this.trgDestino = trgDestino;
			this.trgSelectDestino = selectDestino;
			this.trgDayIda = trgDayIda;
			this.selectDayIda = selectDayIda;
			this.trgDayVuelta = trgDayVuelta;
			this.selectDayVuelta = selectDayVuelta;
			
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(this.strOrigen).into(trgOrigen),
				Click.on(trgDestino),
				Enter.theValue(this.strDestino).into(trgDestino),
				Click.on(this.trgSelectDestino),
				Click.on(this.trgDayIda),
				Click.on(this.selectDayIda),
				Click.on(this.selectDayVuelta),
				//Click.on(this.trgDayVuelta),
				//ConsoleMessage.withMessage("Hola mundo"),
				Click.on(trgButton)
				);
		
	}
	
	public static SetInfo forDespegar(String strOrigen, String strDestino) {
		
		return Tasks.instrumented(SetInfo.class, strOrigen, strDestino,
				DespegarHomePage.btnSearch, DespegarHomePage.txtOrigen, DespegarHomePage.btnDestino,
				DespegarHomePage.selectDestino, DespegarHomePage.btnIda, DespegarHomePage.selectIda,
				DespegarHomePage.btnVuelta, DespegarHomePage.selectVuelta);
	}
}
