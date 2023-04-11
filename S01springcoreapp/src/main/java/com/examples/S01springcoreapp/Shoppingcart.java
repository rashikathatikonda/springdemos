package com.examples.S01springcoreapp;

public class Shoppingcart {
   private String  ID;
   private String name;
   private String price;
   private String quantity;
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Shoppingcart [ID=" + ID + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
}
   
}
