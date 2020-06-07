package com.discovery.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhtotoAppDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhtotoAppDiscoveryServiceApplication.class, args);
	}

}
