package com.icicibank.apimgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class DbAsynchronusOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbAsynchronusOperationsApplication.class, args);
	}

}
