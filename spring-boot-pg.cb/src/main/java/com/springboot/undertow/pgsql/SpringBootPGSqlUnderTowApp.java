package com.springboot.undertow.pgsql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class SpringBootPGSqlUnderTowApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPGSqlUnderTowApp.class, args);
	}
}
