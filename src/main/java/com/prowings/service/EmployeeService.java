package com.prowings.service;

import com.prowings.entity.Employee;

public interface EmployeeService {
	public boolean addEmployee(Employee emp);
    public Employee getEmployee(int id);
}
