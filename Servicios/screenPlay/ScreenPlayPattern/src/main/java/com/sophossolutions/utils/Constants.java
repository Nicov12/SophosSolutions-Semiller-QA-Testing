package com.sophossolutions.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	
	private static Constants instance;
	private Map<String,String> constantDir = new HashMap<String, String>();

	
	private Constants() {
		constantDir.put("Go Rest", "https://gorest.co.in");
		constantDir.put("Nico", "Automator");
		constantDir.put("endpoint", "/public/v2/users/");
		constantDir.put("Zelda", "https://zelda.fanapis.com");
		constantDir.put("endpoint Zelda", "/api/characters/5f6d186f246bd9a0809d6188");
		constantDir.put("Post Go Rest", "/public/v2/users/");
		constantDir.put("SchemaZelda", "src/test/resources/com/sophossolutions/schema/schema.json");
		constantDir.put("SchemaGoRest", "src/test/resources/com/sophossolutions/schema/gorest_schema.json");
		constantDir.put("data gorest", "src/test/resources/com/sophossolutions/schema/gorest_data.json");
		
		constantDir.put("Schema RestFul", "src/test/resources/com/sophossolutions/schema/restful_schema.json");
		constantDir.put("RestFul", "https://api.restful-api.dev");
		constantDir.put("endpoint RestFul", "/objects?id=3");
		constantDir.put("Post RestFul", "/objects");
		constantDir.put("data RestFul", "src/test/resources/com/sophossolutions/schema/restful_data.json");
		
		//MY API
		constantDir.put("My Api", "http://localhost:3000");
		constantDir.put("endpoint My Api", "/users/1");
		constantDir.put("endpoint My Api Post", "/users");
		constantDir.put("data MyApi", "src/test/resources/com/sophossolutions/schema/myapi_data.json");
		constantDir.put("schema MyApi", "src/test/resources/com/sophossolutions/schema/myapi_schema.json");
		constantDir.put("endpoint MyApi User Created", "/users/");
	}
	
	public static String getData(String key) {
		if( instance == null) {
			instance = new Constants();
		}
		return instance.constantDir.get(key);
	}
	
}
