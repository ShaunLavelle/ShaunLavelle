package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller("/")
public class HomeController {

	public String homeController() {
		return "Hello";
	}
	
	
	
}
