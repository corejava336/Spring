package com.nt.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.dto.employee;
import com.nt.service.EmployeeServiceImpl;

@Controller
public class RegisterController {
    private final EmployeeServiceImpl employeeService;

    @Autowired
    public RegisterController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/register")
    public String register(@ModelAttribute("register") employee emp) {
        return "register";
    }

    @PostMapping("/Reprocess")
    public String Reprocess(@Valid @ModelAttribute("register") employee emp, BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }
        List<employee> l = employeeService.searchEmployee(emp.getEMailId(), emp.getName());
        if (l.isEmpty()) {
            employeeService.insert(emp);
            // Redirect to the login page
            return "redirect:/login"; // Assuming "/login" is your login page endpoint
        } else {
            return "register";
        }
    }
}
