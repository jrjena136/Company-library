package com.jyoti.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableCircuitBreaker
@SpringBootApplication
@EnableHystrixDashboard
public class EmployeeLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeLibraryApplication.class, args);
	}
	
}
