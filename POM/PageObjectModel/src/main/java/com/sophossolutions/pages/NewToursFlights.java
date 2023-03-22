package com.sophossolutions.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.PageObject;

public class NewToursFlights extends PageObject {

	By selectionFlights = By.xpath("//a[@href = 'reservation.php']");
	//Opciones
	By type;
	By passenger = By.name("passCount");
	By fromPort = By.name("fromPort"); 
	By monthOn = By.name("fromMonth");
	By dayOn = By.name("fromDay"); 
	By arriving = By.name("toPort");
	By toMonth = By.name("toMonth");
	By toDay = By.name("toDay");
	By serviceClass;
	By airline = By.name("airline");
	
	By buttonContinue = By.name("findFlights");
	
	public void navegar(String url) {
		getDriver().navigate().to(url);
	}
	
	public void clickNavegarTo() {	
		Action.clickElement(getDriver(), selectionFlights);
	}
	
	public void selectOptions(String type, String opcion, String fromPort, String monthOn, 
			String dayOn, String arriving, String toMonth, String toDay, String serviceClass, String airlines) {
		
		try {
			Action.clickElement(getDriver(), this.type = By.xpath("//input[@value = '"+type+"']"));
			Action.selectFromOption(getDriver(), opcion, passenger);
			Action.selectFromOption(getDriver(), fromPort, this.fromPort);
			Action.selectFromOption(getDriver(), monthOn, this.monthOn);
			Action.selectFromOption(getDriver(), dayOn, this.dayOn);
			Action.selectFromOption(getDriver(), arriving, this.arriving);
			Action.selectFromOption(getDriver(), toMonth, this.toMonth);
			Action.selectFromOption(getDriver(), toDay, this.toDay);
			Action.clickElement(getDriver(),
								this.serviceClass = By.xpath("//input[@name = 'servClass' and @value='"+serviceClass+"']"));
			Action.selectFromOption(getDriver(), airlines, this.airline);
			Thread.sleep(3*1000);
			Action.clickElement(getDriver(), buttonContinue);
			Action.clickElement(getDriver(), selectionFlights);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void selectOptions(DataTable datos) {
		
		Map<String, String> info = datos.asMap(String.class, String.class);
		try {
			Action.clickElement(getDriver(), this.type = By.xpath("//input[@value = '"+info.get("type")+"']"));
			Action.selectFromOption(getDriver(), info.get("pasajeros"), this.passenger);
			Action.selectFromOption(getDriver(), info.get("fromPort"), this.fromPort);
			Action.selectFromOption(getDriver(), info.get("monthOn"), this.monthOn);
			Action.selectFromOption(getDriver(), info.get("dayOn"), this.dayOn);
			Action.selectFromOption(getDriver(), info.get("arriving"), this.arriving);
			Action.selectFromOption(getDriver(), info.get("toMonth"), this.toMonth);
			Action.selectFromOption(getDriver(), info.get("toDay"), this.toDay);
			Action.clickElement(getDriver(),
								this.serviceClass = By.xpath("//input[@name = 'servClass' and @value='"+info.get("serviceClass")+"']"));
			Action.selectFromOption(getDriver(), info.get("airlines"), this.airline);
			Thread.sleep(3*1000);
			Action.clickElement(getDriver(), buttonContinue);
			Action.clickElement(getDriver(), selectionFlights);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
