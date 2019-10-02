package com.sd.eureka;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSrvAppln {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaSrvAppln.class, args);

	}

}