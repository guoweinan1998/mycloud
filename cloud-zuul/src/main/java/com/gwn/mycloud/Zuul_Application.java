package com.gwn.mycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul_Application {
	public static void main(String[] args) {
		SpringApplication.run(Zuul_Application.class, args);
	}
}
