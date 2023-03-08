package com.jsonreader.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JsonReaderApplication {

	public static void main(String[] args) {
//		SpringApplication.run(JsonReaderApplication.class, args);
		ApplicationContext context=SpringApplication.run(JsonReaderApplication.class, args);
		TestJson test= context.getBean(TestJson.class);
		test.method();
	}
}
