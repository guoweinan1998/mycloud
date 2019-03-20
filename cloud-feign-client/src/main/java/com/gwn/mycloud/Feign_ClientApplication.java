package com.gwn.mycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@ComponentScan
@EnableEurekaClient
public class Feign_ClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(Feign_ClientApplication.class, args);
	}
}
