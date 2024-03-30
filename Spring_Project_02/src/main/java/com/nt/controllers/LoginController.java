package com.nt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Import Model
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.dto.employee;
import com.nt.service.EmployeeServiceImpl;

@Controller
public class LoginController {
	private final EmployeeServiceImpl employeeService;

	@Autowired
	public LoginController(EmployeeServiceImpl employeeService) {
		this.employeeService = employeeService;
	}

	@RequestMapping("/login")
	public String login(Model model) { // Add Model as parameter
		// Add the 'login' model attribute to the model
		model.addAttribute("login", new employee());
		return "login";
	}

	@PostMapping("/process")
	public String process(@ModelAttribute("login") employee emp) {
		// Implement your login logic here
		List<employee> l = employeeService.searchEmployeeByName(emp.getPass(), emp.getName());
		if (!(l.isEmpty())) {
			return "Device";
		} else {
			return "login";
		}
	}
}
