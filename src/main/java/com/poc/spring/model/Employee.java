package com.poc.spring.model;

import java.util.UUID;

public class Employee {

	private String empName;
	private UUID empId;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, UUID empId) {
		this.empName = empName;
		this.empId = UUID.randomUUID();
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public UUID getEmpId() {
		return empId;
	}

	public void setEmpId(UUID empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + "]";
	}

}
