package com.example.Eurikaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EuriekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EuriekaServiceApplication.class, args);
	}
}
