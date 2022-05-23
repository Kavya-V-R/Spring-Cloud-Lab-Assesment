package com.zensar.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zensar.model.EmployeeDetails;

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


}