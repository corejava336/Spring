package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.dto.LoginDto;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String showLoginPage(Model model) {
		// Add a new User object to the model
		model.addAttribute("LoginDto", new LoginDto());
		return "login";
	}
}
