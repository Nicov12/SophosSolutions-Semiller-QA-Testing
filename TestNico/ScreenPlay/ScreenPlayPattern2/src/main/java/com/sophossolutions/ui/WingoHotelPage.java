package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class WingoHotelPage {
	public static Target validate = Target.the("validate text")
			.locatedBy("//h3[@class ='content-title']");
}
