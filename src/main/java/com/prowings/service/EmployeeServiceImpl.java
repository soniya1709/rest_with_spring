package com.prowings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.dao.EmployeeDao;
import com.prowings.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao empDao;
	
	@Override
	public boolean addEmployee(Employee emp) {
		
		return empDao.addEmployee(emp);
		
	}

	@Override
	public Employee getEmployee(int id) {
		
		return empDao.getEmployee(id);
	}
}
