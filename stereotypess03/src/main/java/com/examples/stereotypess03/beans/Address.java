package com.examples.stereotypess03.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
   @Value("Hyderabad")
   private String city;
   @Value("Telangana")
   private String  state;
   @Value("5000001")
   private String pincode;
  
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
}
   
}
