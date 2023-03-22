package com.sophossolutions.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	
	private static Constants instance;
	private Map<String,String> constantDir = new HashMap<String, String>();

	
	private Constants() {
		constantDir.put("New Tours", "https://demo.guru99.com/test/newtours/");
		constantDir.put("Guru", "https://demo.guru99.com/V4/");
		constantDir.put("user", "nico2");
		constantDir.put("pass", " 12345678");
		constantDir.put("Despegar", "https://www.despegar.com.co/");
		constantDir.put("origen", "Bogotá, Colombia");
		constantDir.put("destino", "san");
	}
	
	public static String getData(String key) {
		if( instance == null) {
			instance = new Constants();
		}
		return instance.constantDir.get(key);
	}
	
}