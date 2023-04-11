package com.examples.S06SpringMVCDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.examples.S06SpringMVCDemo.Employee;

@Controller
public class HelloController {
   @RequestMapping("/hello")  
	public ModelAndView hello() {
	   ModelAndView modelView=new ModelAndView();
	   modelView.addObject("id",1);
	   modelView.addObject("name","ken");
	   modelView.addObject("salary",10000);
	   modelView.setViewName("hello");
		return modelView;
		
	}
   @RequestMapping("/readobject")  
  	public ModelAndView read2() {
  	   ModelAndView modelView=new ModelAndView();
  	   Employee emp=new Employee();
  	   emp.setId(2);
  	   emp.setName("max");
  	   emp.setSalary(20000);
  	 modelView.addObject("employee",emp);
  	   modelView.setViewName("hello");
  		return modelView;
   } 	
   @RequestMapping("/employees")  
 	public ModelAndView read3() {
 	   ModelAndView modelView=new ModelAndView();
 	   List<Employee> employees=new ArrayList<>();
 	   Employee emp=new Employee();
 	   emp.setId(2);
 	   emp.setName("max");
 	   emp.setSalary(20000);
 	   employees.add(emp);
 	   
 	   emp=new Employee();
	   emp.setId(3);
	   emp.setName("sam");
	   emp.setSalary(30000);
	   employees.add(emp);
	   
	   emp.setId(4);
	   emp.setName("jam");
	   emp.setSalary(40000);
	   employees.add(emp);
	   
	   emp=new Employee();
 	   emp.setId(5);
 	   emp.setName("ram");
 	   emp.setSalary(50000);
 	   employees.add(emp);
 	   
 	 modelView.addObject("employees",employees);
 	   modelView.setViewName("employees");
 		return modelView;
  } 	
}
