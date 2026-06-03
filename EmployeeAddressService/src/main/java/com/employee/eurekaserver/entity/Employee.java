package com.employee.eurekaserver.entity;

public class Employee {

	private Long empId;

	private String employeeName;

	private String empBranch;

	private String empLocation;

	// Getters and Setters
	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmpBranch() {
		return empBranch;
	}

	public void setEmpBranch(String empBranch) {
		this.empBranch = empBranch;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	@Override
	public String toString() {
		return "EmployeeService{" + "empId=" + empId + ", employeeName='" + employeeName + '\'' + ", empBranch='"
				+ empBranch + '\'' + ", empLocation='" + empLocation + '\'' + '}';
	}
}
