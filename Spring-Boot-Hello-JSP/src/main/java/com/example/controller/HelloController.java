package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@Value("${welcome.message:Hi}")
	private String message;
	
	@RequestMapping("/")
	public String sayHello(Model model){
		model.addAttribute("message", message);
		return "welcome";
	}
}
