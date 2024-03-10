package com.nt.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nt.dto.User;

@Controller
public class RegistrationController {

	@RequestMapping("/registration")
	public String showRegistrationForm(@ModelAttribute("user") User user) {
		return "registration";
	}

	@PostMapping("/processRegistration")
	public String processRegistration(@Valid @ModelAttribute("user") User user, BindingResult result) {
		if (result.hasErrors()) {
			return "registration"; // Return registration page with validation errors
		}
		// Process registration
		return "redirect:/welcome"; // Redirect to welcome page upon successful registration
	}
}
