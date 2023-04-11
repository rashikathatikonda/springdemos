package com.examples.S01springcoreapp;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
     int id;
     String name;
     private List<String> departments;
     private Set<String> friends;
     private Map<Integer,String> products;
     private Properties countries;
     private Address address;
    private Shoppingcart items;
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
	
	public List<String> getDepartments() {
		return departments;
	}
	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
	
	public Map<Integer, String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
	
	public Properties getCountries() {
		return countries;
	}
	public void setCountries(Properties countries) {
		this.countries = countries;
	}
	
	public Set<String> getFriends() {
		return friends;
	}
	public void setFriends(Set<String> friends) {
		this.friends = friends;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Shoppingcart getItems() {
		return items;
	}
	public void setItems(Shoppingcart items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ",departments="+departments+",products="+products+",countries="+countries+",friends="+friends+",address="+address+",items="+items+"]";
	}
	public void setFirstName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setLastName(String string) {
		// TODO Auto-generated method stub
		
	}
     
}
