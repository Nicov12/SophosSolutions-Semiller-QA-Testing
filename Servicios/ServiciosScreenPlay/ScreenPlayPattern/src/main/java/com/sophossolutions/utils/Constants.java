package com.sophossolutions.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	
	private static Constants instance;
	private Map<String,String> constantDir = new HashMap<String, String>();

	
	private Constants() {
		constantDir.put("Go Rest", "https://gorest.co.in");
		constantDir.put("Actor", "Automator");
		constantDir.put("endpoint", "/public/v2/users/");
		
		constantDir.put("Token", "55dda34c2a96a129c847b108337529acedd84811bb68d7b937455feb603b0732");
		
		constantDir.put("Post Go Rest", "/public/v2/users/");
		constantDir.put("SchemaGoRest", "src/test/resources/com/sophossolutions/schema/gorest_schema.json");
		constantDir.put("data gorest", "src/test/resources/com/sophossolutions/schema/gorest_data.json");
		
		
		constantDir.put("My Api", "http://localhost:3000");
		constantDir.put("endpoint GET My Api", "/users/");
		constantDir.put("endpoint POST My Api", "/users");
		constantDir.put("endpoint DELETE My Api", "/users/");
		constantDir.put("data MyApi", "src/test/resources/com/sophossolutions/schema/myapi_data.json");
		constantDir.put("schema MyApi", "src/test/resources/com/sophossolutions/schema/myapi_schema.json");
		
	}
	
	public static String getData(String key) {
		if( instance == null) {
			instance = new Constants();
		}
		return instance.constantDir.get(key);
	}
	
}
