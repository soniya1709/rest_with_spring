package com.prowings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.entity.Employee;
import com.prowings.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empService;

//	@PostMapping("/employee")
//	public ResponseEntity<?> saveEmployee(@RequestBody Employee emp) {
//		boolean empSaved = empService.addEmployee(emp);
//		if (empSaved)
//			return ResponseEntity.ok("Employee record saved successfully!!");
//		else
//			return ResponseEntity.ok("Employee record not saved!!");
//	}
	@GetMapping("/employee/{id}")
	public ResponseEntity<?> getEmployee(@PathVariable("id") int id) {
		Employee emp=empService.getEmployee(id);
		return ResponseEntity.ok().body(emp);
	}
}
