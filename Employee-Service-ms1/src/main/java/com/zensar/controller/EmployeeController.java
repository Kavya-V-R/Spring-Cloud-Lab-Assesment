package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.model.Employee;
import com.zensar.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@PostMapping("/employee/add")
	public void saveEmployee(Employee employee) {
		empService.addEmployee(employee);
	}
	
	@GetMapping("/employee/getAll")
	public List<Employee> getAllEmployeea(){
		return empService.getAllEmployee();
	}
	
	@GetMapping("/employee/getEmpById/{eid}")
	public Employee getEmployeeById(@PathVariable(name="eid") int id) {
		return empService.getEmpById(id);
	}
}