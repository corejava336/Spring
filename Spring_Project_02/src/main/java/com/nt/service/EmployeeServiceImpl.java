package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.EmployeeDAO;
import com.nt.dto.employee;

@Service
@Transactional

public class EmployeeServiceImpl {

	@Autowired
	private EmployeeDAO employeeDAO;

	public void insert(employee emp) {
		employeeDAO.insert(emp);
	}

	public List<employee> searchEmployeeByName(String pass, String name) {
		return employeeDAO.searchEmployeeByName(pass, name);
	}

	public List<employee> searchEmployee(String EMailId, String name) {
		return employeeDAO.searchEmployee(EMailId, name);
	}
}
