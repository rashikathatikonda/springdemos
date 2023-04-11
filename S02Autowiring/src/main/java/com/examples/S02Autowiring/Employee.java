package com.examples.S02Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
     int id;
     String name;
     @Autowired
     @Qualifier("address1")
     private Address homeaddress;
     @Autowired
     @Qualifier("address2")
     private Address officeaddress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return homeaddress;
	}
	
	public void setAddress(Address address) {
		this.homeaddress = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", homeaddress=" + homeaddress + ", officeaddress=" + officeaddress + "]";
	}
	
}
