package com.zensar.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zensar.model.DepartmentList;
import com.zensar.model.EmployeeDetails;
import com.zensar.model.EmployeesList;

@RestController
@RequestMapping("/administration")
public class AdministrationResource {

	@Autowired

	private RestTemplate restTemplate;

	// A hardcoded list of EmployeeDetails
	List<EmployeeDetails> EmployeeDetails = Arrays.asList(new EmployeeDetails("P1", "Joseph", "Brazil"),
			new EmployeeDetails("P2", "William", "American"), new EmployeeDetails("P3", "Sanjith", "Indian"));

	// getEmployeeDetails() returns a list of EmployeeDetails
	@RequestMapping("/EmployeeDetails")
	public List<EmployeeDetails> getEmployeeDetails() {
		return EmployeeDetails;
	}

	// getPatientById() returns a patient with a given Id
	@RequestMapping("/EmployeeDetails/{Id}")
	public EmployeeDetails getemDetailsbyId(@PathVariable("Id") String Id) {
		EmployeeDetails p = EmployeeDetails.stream().filter(EmployeeDetails -> Id.equals(EmployeeDetails.getId())).findAny().orElse(null);
		return p;
	}

	// getPhysicians calls the hr-service microservice to get list of physicians
	@RequestMapping("/employees")
	public EmployeesList getPhysicians() {
		EmployeesList employees =
				// restTemplate.getForObject("http://localhost:8082/hr/employees",
				// EmployeesList.class);
				restTemplate.getForObject("http://employee-service/em/employees", EmployeesList.class);
		return employees;
	}

	// getDiseases calls the pathology-service to get list of diseases
	@RequestMapping("/departments")
	public DepartmentList getDiseases() {
		DepartmentList departments =
				// restTemplate.getForObject("http://localhost:8083/pathology/diseases",
				// DiseasesList.class);
				restTemplate.getForObject("http://department-service/department/departments", DepartmentList.class);

		return departments;
	}
}