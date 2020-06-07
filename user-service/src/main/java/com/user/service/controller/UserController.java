package com.user.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private Environment env;
	
	@Autowired
	public UserController(Environment env) {
		this.env = env;
	}
	
	@GetMapping("/status/check")
	@LoadBalanced
	public String check() {
		return "user service working" + env.getProperty("local.server.port");
	}

}
