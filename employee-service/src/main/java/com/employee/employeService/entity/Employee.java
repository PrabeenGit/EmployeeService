package com.employee.employeService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_service")
public class Employee {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	    @Column(name = "emp_id")
	    private Long empId;

	    @Column(name = "employee_name", length = 100, nullable = false)
	    private String employeeName;

	    @Column(name = "emp_branch", length = 100, nullable = false)
	    private String empBranch;

	    @Column(name = "emp_location", length = 100, nullable = false)
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
	        return "EmployeeService{" +
	                "empId=" + empId +
	                ", employeeName='" + employeeName + '\'' +
	                ", empBranch='" + empBranch + '\'' +
	                ", empLocation='" + empLocation + '\'' +
	                '}';
	    }
	}



