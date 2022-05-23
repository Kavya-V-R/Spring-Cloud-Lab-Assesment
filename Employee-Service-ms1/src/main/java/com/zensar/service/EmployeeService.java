package com.zensar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.model.Employee;
import com.zensar.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;
	
	public void addEmployee(Employee employee) {
		employeeRepo.save(employee);
	}
	
	
	public List<Employee> getAllEmployee(){
		return employeeRepo.findAll();
	}
	
	public Employee getEmpById(int id) {
		Optional<Employee> optional=employeeRepo.findById(id);
		Employee employee=null;
		if(optional.isPresent()) {
			employee=optional.get();
		}else {
			System.out.println("Employee not found with id "+id);
		}
		
		return employee;
	}
}