package com.jyoti.emp.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jyoti.emp.model.Company;
import com.jyoti.emp.model.Employee;
import com.jyoti.emp.model.EmployeeModel;
import com.jyoti.emp.service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeControler{
	@Autowired
	private EmployeeModel employee;
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/details")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployeeDetails() {
		Employee e1 = new Employee();
		employee.setEmpName("Jyoti");
		employee.setEmpID("0083F6");
		employee.setDoj("25/Apr/2016");
		employee.setYearOfExp("2");
		System.out.println("before calling method");
		//String companyName = service.getCompanyName();
		//employee.setComapnyName(companyName);
		Company company = service.getCompanyDetails();
		employee.setCompanyDetails(company);
		
		e1.setEmp(employee);
		return e1;
	}
	
}
