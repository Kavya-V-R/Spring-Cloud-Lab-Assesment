package com.zensar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.zensar.model.Department;
import com.zensar.repository.DeparmentRepo;

@Service
public class DepartmentService {

	@Autowired
	DeparmentRepo deparmentRepo;
	
	public List<Department> getAllDepartment() {
		return deparmentRepo.findAll();
	}
	
	public void addDepartment(Department department) {
		deparmentRepo.save(department);
	}
	

}