package com.CustomerBasicExample.customerbasicexample.service;

import java.util.ArrayList;
import java.util.List;

import com.CustomerBasicExample.customerbasicexample.model.Address;
import com.CustomerBasicExample.customerbasicexample.model.Customer;
import com.CustomerBasicExample.customerbasicexample.model.Order;

public class CustomerService {
	
	public CustomerService(){}
	

public List<Customer> getCustomerDetalis() {
	
	//List<Customer> customerlist = new ArrayList<>();
	
	Order order1 =new Order(11, "paraslChikenBiryane", 9832145679l);
	Order order2 =new Order(12,"MuttonBiryaneBoneLess",9874521671l );
	
	System.out.println(order1);
	System.out.println(order2);
	
	List<Order> list=new ArrayList<>();
	list.add(order1);
	list.add(order2);
	System.out.println(list);
	
	Customer c1=new Customer(1, "manju", 9618003546l, list);
	Customer c2=new Customer(2,"japal", 9876543210l, list);
	Customer c3=new Customer(3,"sai", 7654321890l, list);
	Customer c4=new Customer(4,"baba", 630216789l, list);
	Customer c5=new Customer(5,"naveen", 9874321876l, list);
	
	List<Customer> customerList=new ArrayList<>();
	
	customerList.add(c1);
	customerList.add(c2);
	customerList.add(c3);
	customerList.add(c4);
	customerList.add(c5);
	
	System.out.println("customerlist................."+customerList);
	
	for(Customer customer:customerList) {
		
		System.out.println("customerlist................."+customer.getCid()+"...., "+customer.getName()+"........,"+customer.getOrder());	
	}

	return customerList;

}

public List<Order> getOrderDetails(int customerId){
	   Order order1 = new Order(131,"fishCurry", 9618003546l);
	   Order order2 = new Order(132,"boneFish", 630888996l);
	   Order order3 = new Order(133, "fruitJam", 987654433l);
	   Order order4 = new Order(134, "breedMilk",908763459l);
	   List<Order> orderList = new ArrayList<>();
	   orderList.add(order1);
	   orderList.add(order2);
	   orderList.add(order3);
	   orderList.add(order4);

	   return orderList;
}

public List<Address> getAddressDetails(int customerId){
	   List<Address> addressDetails = new ArrayList<>();  
	   Address address1 = new Address(1,"marathalli", 515591l);
	   Address address2 = new Address(2,"odc",515531l);
	   addressDetails.add(address1);
	   addressDetails.add(address2);	   
	   return addressDetails;
}

     public static  List<Order> getOrderDetailsForVip(int customerId){
	   Order order1 = new Order(131,"fishCurry", 9618003546l);
	   Order order2 = new Order(132,"boneFish", 630888996l);
	   Order order3 = new Order(133, "fruitJam", 987654433l);
	   Order order4 = new Order(134, "breedMilk",908763459l);
	   List<Order> orderList = new ArrayList<>();
	   orderList.add(order1);
	   orderList.add(order2);
	   orderList.add(order3);
	   orderList.add(order4);

	   return orderList;
}

}
