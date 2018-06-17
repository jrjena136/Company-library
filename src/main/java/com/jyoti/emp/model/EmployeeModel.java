package com.jyoti.emp.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class EmployeeModel {
	private String empName;
	private String empID;
	private String doj;
	private String yearOfExp;
	//private String comapnyName;
	private Company companyDetails;

}
