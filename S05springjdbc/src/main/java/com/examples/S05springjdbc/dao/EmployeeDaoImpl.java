package com.examples.S05springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.examples.S05springjdbc.entity.Employee;
@Component("employeedao")
public class EmployeeDaoImpl implements EmployeeDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Employee emp) {
		 String sql="insert into employee values(?,?,?)";
	 	   int result=jdbcTemplate.update(sql,emp.getId(),emp.getFirstName(),emp.getLastName());
	        
	       return result;	
	  }
	public int update(Employee emp) {
		 String sql="update employee set firstName=?,lastName=? where id=?";
	 	   int result=jdbcTemplate.update(sql,emp.getFirstName(),emp.getLastName(),emp.getId());
	        
	       return result;	
	  }
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		 String sql="delete from employee where id=?";
	 	   int result=jdbcTemplate.update(sql,id);
	        
	       return result;
	}
	@Override
	public Employee read(int id) {
		String sql="select * from employee where id=?";
		EmployeeRowMapper employeeRowMapper=new EmployeeRowMapper();
		Employee employee=jdbcTemplate.queryForObject(sql, employeeRowMapper,id);
		return employee;
		
	}
	public List<Employee> read() {
		// TODO Auto-generated method stub
		String sql="select * from employee ";
		EmployeeRowMapper employeeRowMapper=new EmployeeRowMapper();
		List<Employee> employees=(List<Employee>) jdbcTemplate.query(sql, employeeRowMapper);
		return employees;
		
	}
    
	
	
}
















