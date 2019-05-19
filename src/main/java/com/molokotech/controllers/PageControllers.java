package com.molokotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageControllers {
	
	@GetMapping("/index")
	String index1() {
		return "index";
	}
	
	@GetMapping("/")
	String index2() {
		return "index";
	}
}
