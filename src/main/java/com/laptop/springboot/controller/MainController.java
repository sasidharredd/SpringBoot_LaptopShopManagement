package com.laptop.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.laptop.springboot.model.User;

@Controller
public class MainController {
	
	User user;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/ContactPageSuccess")
	public String contactSuccess() {
		return "ContactPageSuccess";
	}
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}
	@GetMapping("/homePage")
	public String showHomePage() {
		return "Home";
	}
	@GetMapping("/aboutPage")
	public String showAboutPage() {
		return "About";
	}
	@GetMapping("/contactPage")
	public String showContactPage() {
		return "Contact";
	}
	@GetMapping("/categoriesPage")
	public String showCategoriesPage() {
		return "Categories";
	}
	
	
    
}
