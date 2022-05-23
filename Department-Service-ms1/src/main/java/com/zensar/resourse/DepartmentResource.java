package com.zensar.resourse;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.zensar.model.Department;
import com.zensar.model.DepartmentList;


@RestController
@RequestMapping("/department")
public class DepartmentResource {
	
	//Hardcoded list of departments
	private List<Department> dept = Arrays.asList(
		new Department("A", "Development"),
		new Department("B", "Testing"),
		new Department("C", "IT")
	);
	/*
	@RequestMapping("/departments")
	public List<dept> getdepartments() {
		return dept;
	}*/
	
	
	//getDepartmentList returns a list of departmentList
	@RequestMapping("/departments")
	public DepartmentList getDepartmentList() {
		DepartmentList departmentList = new DepartmentList();
		departmentList.setDepatments(dept);
		return departmentList;
	}
	
	//getDepartmentsById returns the department with the given Id
	@RequestMapping("/diseases/{Id}")
	public Department getDepartmentsById(@PathVariable("Id") String Id) {
		
		Department d = dept.stream()
			.filter(dept -> Id.equals(dept.getId()))
			.findAny()
			.orElse(null);	
		
		return d;
	}	
}
