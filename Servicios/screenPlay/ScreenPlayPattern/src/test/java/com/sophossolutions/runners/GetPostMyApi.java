package com.sophossolutions.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class) //Enviamos la clase que contiene todas las instrucciones
@CucumberOptions(
		glue = "com.sophossolutions.stepdefinitions", //El paquete de los stepDefinitions
		features = {"src/test/resources/com/sophossolutions/features/1_post_myapi.feature",
					"src/test/resources/com/sophossolutions/features/2_get_myapi.feature"}, //ruta del archivo feature
		snippets = SnippetType.CAMELCASE
		)
public class GetPostMyApi {

}
