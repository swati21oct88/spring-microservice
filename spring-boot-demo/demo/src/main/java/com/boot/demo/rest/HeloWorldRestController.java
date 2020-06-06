package com.boot.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloWorldRestController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "running";
	}
}
