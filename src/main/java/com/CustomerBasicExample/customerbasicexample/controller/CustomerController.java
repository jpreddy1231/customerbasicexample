package com.CustomerBasicExample.customerbasicexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerBasicExample.customerbasicexample.model.Customer;
import com.CustomerBasicExample.customerbasicexample.service.CustomerService;


@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("login")
	public List<Customer> getCustomerDetalis() {
		
		List<Customer> customerList = customerService.getCustomerDetalis();
		
		return customerList;
	}

}
