package com.poc.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.spring.mapper.EmployeeMapper;
import com.poc.spring.model.Employee;
import com.poc.spring.topic.EmployeeRegistrationSource;


@RestController
@RequestMapping("/employee")
public class EmployeeRegistrationController {


	private EmployeeRegistrationSource employeeRegistrationSource;
	
	private EmployeeMapper employeeMapper;
	
	
	@Autowired
	public EmployeeRegistrationController(EmployeeRegistrationSource employeeRegistrationSource,
			EmployeeMapper employeeMapper) {
		this.employeeRegistrationSource = employeeRegistrationSource;
		this.employeeMapper = employeeMapper;
	}



	@PostMapping("/register")
	public String sendMessage(@RequestBody Employee employee) {
		Employee updatedEmployee = employeeMapper.empToEmpMapper(employee);
		employeeRegistrationSource.employeeRegistration().send(MessageBuilder.withPayload(updatedEmployee).build());
		System.out.println(employee.toString());
		return "Employee Registered";
		
	}
}
