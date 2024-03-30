package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.employee;
import com.nt.service.EmployeeServiceImpl;

public class A {
	public static void main(String[] args) {
		// Create Spring application context
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			EmployeeServiceImpl employeeService = context.getBean(EmployeeServiceImpl.class);
			// Insert the employee using the service
			// Create an Employee object
			employee employee = new employee();
			employeeService.insert(employee);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}