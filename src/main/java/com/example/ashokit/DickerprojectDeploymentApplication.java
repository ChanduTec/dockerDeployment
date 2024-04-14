package com.example.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class DickerprojectDeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DickerprojectDeploymentApplication.class, args);
		System.out.println("Welcoem to the docker application");
	}

}
