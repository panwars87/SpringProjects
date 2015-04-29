package com.ys.spring.aggregator.dto;

import org.springframework.stereotype.Repository;

@Repository(value="studentCustomerBean")
public class StudentCustomer extends Customer{
	
	public StudentCustomer(CustomerType customerType) {
		super(customerType);
	}

	public StudentCustomer(){
		super(customer);
	}
	
	static CustomerType customer=CustomerType.Student;
}