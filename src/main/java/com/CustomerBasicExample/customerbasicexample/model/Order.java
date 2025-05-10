package com.CustomerBasicExample.customerbasicexample.model;

public class Order {
int id;
String name;
long number;


public Order() {
	super();
}
public Order(int id, String name,long number) {
	this.id = id;
	this.name= name;
	this.number = number;


}
@Override
public String toString() {
	return "Order [id=" + id + ", name=" + name + ", number=" + number + "]";
}



}
