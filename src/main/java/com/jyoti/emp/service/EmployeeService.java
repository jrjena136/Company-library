package com.jyoti.emp.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jyoti.emp.model.Company;
import com.jyoti.emp.model.CompanyModel;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@ComponentScan("com.jyoti.emp.config")
public class EmployeeService {
	@Autowired
	private RestTemplate restTemplate;
	
	/*public EmployeeService(RestTemplate rest) {
		this.restTemplate = rest;
	}*/
	
	@HystrixCommand(fallbackMethod="getDummyName")
	public String getCompanyName() {
		System.out.println("*******inside getCompanyName()***********");
		URI url = URI.create("http://localhost:4040/company/name");
		System.out.println("url : " + url.toString());
		System.out.println("resTemplate :" + restTemplate);
		String name = restTemplate.getForObject(url, String.class);
		System.out.println("name : " + name);
		return name;
	}
	
	public String getDummyName() {
		System.out.println("inside getDummy()");
		return "Dummy";
	}
	
	
	@HystrixCommand(fallbackMethod="reliable")
	public Company getCompanyDetails() {
		System.out.println("*******inside getCompanyDetails()***********");
		URI url = URI.create("http://localhost:4040/company/details");
		System.out.println("url : " + url.toString());
		System.out.println("resTemplate :" + restTemplate);
		ResponseEntity<Company> companyObj = restTemplate.getForEntity(url, Company.class);
		System.out.println("companyObj.getBody() : " + companyObj.getBody());
		return companyObj.getBody();
	}
	
	public Company reliable() {
		System.out.println("inside reliable()");
		CompanyModel model = new CompanyModel();
		model.setCompanyName("Dummy_Name");
		model.setEstablishment_year("Dummy_Year");
		model.setIsoCertified("N");
		model.setOwner("N/A");
		Company com = new Company();
		com.setCompany(model);
		return com;
	}

}
