package com.javabrains.springApi.course_api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javabrains.springApi.course_api.model.Employee;
import com.javabrains.springApi.course_api.model.Employees;
 

@Repository
public class EmployeeDAO 
{
    List<Employees> empList;
     
    		EmployeeDAO() {	
    	empList=new ArrayList<Employees>();
    	empList.add(new Employees(1, "Lokesh" ));
    	empList.add(new Employees(2, "Alex" ));
    	empList.add(new Employees(3, "David"));
    }
    		
   
        
    
     
    public List<Employees> getAllEmployees() 
    {
    	
    	return empList;
    }
     
    public String  addEmployee(Employees employee) {
    	
    	empList.add(employee);
    	System.out.println(empList.size());
       return empList.size()>3 ? "Employee Record updated" :"Employee Record not updated";
    }
}