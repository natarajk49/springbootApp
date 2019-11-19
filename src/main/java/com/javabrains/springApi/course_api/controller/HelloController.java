package com.javabrains.springApi.course_api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabrains.springApi.course_api.model.Employee;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	@RequestMapping("/Employee")
	public void employee(){
		System.out.println("Employee test");
	}
	/*public List<Employee> getEmployee(){
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
		return emplist;
	}*/
}
