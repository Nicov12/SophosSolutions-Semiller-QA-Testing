package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {
											//nombre del elemento
	public static Target txtText =Target.the("Titulo de Login correctamente").locatedBy("//h3[contains(text(),'Login')]");

}
