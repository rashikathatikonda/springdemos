package com.examples.S01springcoreapp;

public class EmployeeDao {
   private String dbserver;
   private String  dbport;
   private String dbuser;
   private String dbpassword;
public EmployeeDao(String dbserver, String dbport, String dbuser, String dbpassword) {
	super();
	this.dbserver = dbserver;
	this.dbport = dbport;
	this.dbuser = dbuser;
	this.dbpassword = dbpassword;
}
public Employee getEmployee(int id)
{
	return null;
}

@Override
public String toString() {
	return "EmployeeDao [dbserver=" + dbserver + ", dbport=" + dbport + ", dbuser=" + dbuser + ", dbpassword="
			+ dbpassword + "]";
}
   
}
