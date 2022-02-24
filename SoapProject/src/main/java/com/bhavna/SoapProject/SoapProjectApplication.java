package com.bhavna.SoapProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.bhavna")

@SpringBootApplication
public class SoapProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapProjectApplication.class, args);
	}

}
