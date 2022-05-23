package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceMsApplication.class, args);
	}

}
