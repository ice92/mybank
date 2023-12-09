package com.zywatest.bankstatementapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"repository","controller","service","model"})
public class BankstatementapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankstatementapiApplication.class, args);
	}

}
