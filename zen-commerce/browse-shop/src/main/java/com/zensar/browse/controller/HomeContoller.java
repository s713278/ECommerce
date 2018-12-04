package com.zensar.browse.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {

	 @Value("${message}")
	private String message;
	
	@GetMapping("/message")
	public String getMessage(){
		System.out.println("##################################################");
		return message;
	}
}
