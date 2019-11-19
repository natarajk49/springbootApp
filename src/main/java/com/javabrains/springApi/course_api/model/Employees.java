package com.javabrains.springApi.course_api.model;

import java.util.ArrayList;
import java.util.List;
 
public class Employees 
{
	private int empId;
   public Employees(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
private String empName;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
     
    
}