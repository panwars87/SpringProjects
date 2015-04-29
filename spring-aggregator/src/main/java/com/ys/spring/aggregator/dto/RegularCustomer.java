package com.ys.spring.aggregator.dto;

import org.springframework.stereotype.Repository;

@Repository(value="regularCustomerBean")
public class RegularCustomer extends Customer{
	
	public RegularCustomer(CustomerType customerType) {
		super(customerType);
	}

	public RegularCustomer(){
		super(customer);
	}
	
	static CustomerType customer=CustomerType.Regular;
}