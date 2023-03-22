package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GuruHomePage extends PageObject{
	
	public static Target txtText =Target.the("Title of Home").locatedBy("//td[contains (text(),'Manger')]");
}
