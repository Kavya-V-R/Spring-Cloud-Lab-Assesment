package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableEurekaClient
@EnableWebMvc
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "com.zensar")
public class EmployeeServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceMsApplication.class, args);
	}

}
