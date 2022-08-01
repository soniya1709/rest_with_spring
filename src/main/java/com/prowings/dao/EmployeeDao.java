package com.prowings.dao;

import com.prowings.entity.Employee;

public interface EmployeeDao {
	public boolean addEmployee(Employee entity);
	public Employee getEmployee(int id);
}
