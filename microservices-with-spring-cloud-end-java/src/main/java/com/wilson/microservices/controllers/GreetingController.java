package com.wilson.microservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wilson.microservices.model.Greeting;

@RestController
public class GreetingController {
	
	@RequestMapping("/greeting")
	@GetMapping
	public Greeting greeting() {
		return null;
	}
}
