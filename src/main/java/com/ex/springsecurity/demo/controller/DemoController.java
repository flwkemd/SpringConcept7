package com.ex.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String showHome() {
		
		return "home";		
	}
	
	// add request mapping for /leaders
	@GetMapping("/leaders")
	public String showLeaders() {
		
		return "leaders";		
	}

	// add request mapping for /admin
	@GetMapping("/admin")
	public String showAdmin() {
		
		return "admin";		
	}
}
