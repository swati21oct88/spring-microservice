package com.user.service.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private Environment env;
	
	@GetMapping("/status/check")
	public String check() {
		return "user service working";
	}

}
