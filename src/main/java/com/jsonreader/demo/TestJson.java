package com.jsonreader.demo;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Component;

@Component
public class TestJson {
	public void method() {
		JSONParser jsonParser= new JSONParser();
		try {
			FileReader reader= new FileReader("C:\\Users\\kavin\\OneDrive\\Desktop\\Eclipse Workspace\\JsonReader\\src\\main\\resources\\test.json");
			JSONObject obj=(JSONObject) jsonParser.parse(reader);
			System.out.println(obj);
			parseEmployeeObject(obj);
		}catch (Exception e) {
			System.out.println("There is some error"+e.getMessage()+e);
		}
	}
	
	public static void parseEmployeeObject(JSONObject obj) {
		Map<String,String> testMap=new HashMap<>();
		Map<String,String> map = (Map<String, String>) obj.get("External");
		testMap.putAll(map);
		System.out.println(testMap);
		System.out.println(testMap.get("name"));
	}
}
