package com.CustomerBasicExample.customerbasicexample.model;

import java.util.ArrayList;
import java.util.List;

//import Com.sample.Address;

//import Com.sample.Address;

public class Customer {
	
int cid;
String name;
Long number;
List<Order> order;
List<Address> address;

public Customer() {
	
}

public Customer(int cid,String name,long number, List<Order> order ) {
	super();
	this.cid=cid;
	this.name=name;
	this.number=number;
	this.order=order;  
}




public Customer(int cid, String name, Long number, List<Order> order, List<Address> address) {
	super();
	this.cid = cid;
	this.name = name;
	this.number = number;
	this.order = order;
	this.address = address;
	
}

public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Long getNumber() {
	return number;
}
public void setNumber(Long number) {
	this.number = number;
}
public List<Order> getOrder() {
	return order;
}
public void setOrder(List<Order> order) {
	this.order = order;
}
public List<Order> getOrder(List<Order> Order) {
	return Order;

}

public List<Address> getAddress() {
	return address;
}

public void setAddress(List<Address> address) {
	this.address = address;
}   
   
@Override
public String toString() {
	return "Customer [cid=" + cid + ", name=" + name + ", number=" + number + ", order=" + order + "]";
}

}
