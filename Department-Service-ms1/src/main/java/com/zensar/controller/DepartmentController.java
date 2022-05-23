package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.model.Department;
import com.zensar.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService service;
	
	@PostMapping("/departmnet/add")
	public void addDepartment(Department department) {
		service.addDepartment(department);
	}
	
	@GetMapping("/department/getAll")
	public List<Department> getAllDept() {
		return service.getAllDepartment();
	}
	

}