package com.nt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dto.employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional(readOnly = true)
	public List<employee> searchEmployee(String EMailId, String name) throws DataAccessException {
		try {
			Session session = sessionFactory.getCurrentSession();
			String hql = "FROM employee WHERE name = :name OR EMailId=:EMailId";
			return session.createQuery(hql).setParameter("name", name).setParameter("EMailId", EMailId).list();
		} catch (DataAccessException e) {
			throw new DataAccessException("Error occurred while searching employee by name", e) {
			};
		}
	}

	@Override
	@Transactional(rollbackFor = DataAccessException.class)
	public void insert(employee emp) throws DataAccessException {
		try {
			Session session = sessionFactory.getCurrentSession();
			// Set employee details
			emp.setName(emp.getName());
			emp.setPass(emp.getPass());
			emp.setPhone(emp.getPhone());
			emp.setEMailId(emp.getEMailId());
			session.save(emp);
		} catch (DataAccessException e) {
			throw new DataAccessException("Error occurred while inserting employee", e) {
			};
		}
	}

	@Override
	@Transactional(readOnly = true)
	public List<employee> searchEmployeeByName(String pass, String name) throws DataAccessException {
		try {
			Session session = sessionFactory.getCurrentSession();
			String hql = "FROM employee WHERE name = :name and pass=:pass";
			return session.createQuery(hql).setParameter("name", name).setParameter("pass", pass).list();
		} catch (DataAccessException e) {
			throw new DataAccessException("Error occurred while searching employee by name", e) {
			};
		}
	}

}
