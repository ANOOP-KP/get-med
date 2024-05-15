package com.luminar.getmed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/register")
	public String showRegisterPage() {
		return "register"; //  register.html
	}

	@GetMapping("/medicines")
	public String showMedicinesPage() {
		return "medicines"; //  medicines.html
	}
}