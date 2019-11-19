package com.javabrains.springApi.course_api.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
 
import com.javabrains.springApi.course_api.dao.EmployeeDAO;
import com.javabrains.springApi.course_api.model.Employee;
import com.javabrains.springApi.course_api.model.Employees;
 
@RestController
@RequestMapping(path = "/employees")
public class EmployeeController 
{
    @Autowired
    private EmployeeDAO employeeDao;
     
    @GetMapping(path="/get", produces = "application/json")
    public List<Employees> getEmployees() 
    {
    	
    	return   employeeDao.getAllEmployees();
    	
    }
     
    @GetMapping(path= "/add")
    public String addEmployee() 
    { System.out.println("*****");
    	Employees e= new Employees(233,"xbdbdb");
    	return employeeDao.addEmployee(e);
    	
    }
    @GetMapping(path= "/delete")
   	public String deleteEmployee() 
    { 
    	System.out.println("*****");
        Employees e= new Employees(233,"xbdbdb");
        return employeeDao.addEmployee(e);
        }
}