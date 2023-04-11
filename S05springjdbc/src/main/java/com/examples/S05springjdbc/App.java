package com.examples.S05springjdbc;

import java.util.List;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.S05springjdbc.dao.EmployeeDAO;
import com.examples.S05springjdbc.entity.Employee;

public class App 
{
    public static void main( String[] args )
    { 
		// TODO Auto-generated method stub
		System.out.println( "JDBC Template Demo!" );
	   //create();   
		//update();
		//delete();
		//readOneEmployee();
		readAllEmployees();
		
	}
	private static void readAllEmployees() {
		// TODO Auto-generated method stub
		 ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/examples/S05springjdbc/springconfig.xml");
	   	  EmployeeDAO employeedao=(EmployeeDAO)ctx.getBean("employeedao");
	   	  
	   	  List<Employee> employees=employeedao.read(); 
	   	System.out.println(employees);
	}
	private static void readOneEmployee() {
		// TODO Auto-generated method stub
		 ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/examples/S05springjdbc/springconfig.xml");
	   	  EmployeeDAO employeedao=(EmployeeDAO)ctx.getBean("employeedao");
	   	  
	   	  Employee employee=employeedao.read(2); 
	   	System.out.println(employee);
	}
	private static void create() {
		ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/examples/S05springjdbc/springconfig.xml");
	 	  EmployeeDAO employeedao=(EmployeeDAO)ctx.getBean("employeedao");
	 	  Employee emp=new Employee();
	 	  emp.setId(3);
	 	  emp.setFirstName("rahu");                         //Inserting data
	 	  emp.setLastName("sethu"); 
	 	  employeedao.create(emp);
	}
	
	private static void update() {
		// TODO Auto-generated method stub            //updating
		ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/examples/S05springjdbc/springconfig.xml");
	   	  EmployeeDAO employeedao=(EmployeeDAO)ctx.getBean("employeedao");
	   	  Employee emp=new Employee();
	   	 emp.setId(2);
		  emp.setFirstName("max");
		  emp.setLastName("robert");
	   	  employeedao.update(emp);
	}
	private static void delete() {
		// TODO Auto-generated method stub          //deleting
		 ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/examples/S05springjdbc/springconfig.xml");
	   	  EmployeeDAO employeedao=(EmployeeDAO)ctx.getBean("employeedao");
	   	  Employee emp=new Employee();
	   	  employeedao.delete(1); 
	}
	
	
}