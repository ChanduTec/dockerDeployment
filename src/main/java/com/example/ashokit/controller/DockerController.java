package com.example.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping(value = "/dockerwelcome")
	public String welcomeDocker() {
		System.out.println("Welcoem to the docker appliaction chandu");
		return "Welcome to the docker application->Your docker is running";
	}
	
	@GetMapping(value = "/hi")
	public String helloDocker() {
		return "Hello docker is running here";
	}
}
