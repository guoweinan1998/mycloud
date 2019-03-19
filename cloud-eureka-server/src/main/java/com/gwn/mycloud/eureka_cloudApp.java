package com.gwn.mycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class eureka_cloudApp {
	
	public static void main(String[] args) {
		SpringApplication.run(eureka_cloudApp.class, args);
	}
}
