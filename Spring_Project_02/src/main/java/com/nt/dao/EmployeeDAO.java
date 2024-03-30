package com.nt.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.nt.dto.employee;

public interface EmployeeDAO {

	void insert(employee emp);

	List<employee> searchEmployeeByName(String pass, String name);

	List<employee> searchEmployee(String EMailId, String name) throws DataAccessException;
}
