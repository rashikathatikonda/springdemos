package com.examples.S05springjdbc.dao;

import java.util.List;

import com.examples.S05springjdbc.entity.Employee;

public interface EmployeeDAO {
       int create(Employee employee);
       int update(Employee employee);
       int delete(int id);
       Employee read(int id);
	List<Employee> read();
	
       


}
