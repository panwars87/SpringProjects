package com.ys.spring.aggregator.dto;

import org.springframework.stereotype.Repository;

@Repository(value="primeCustomerBean")
public class PrimeCustomer extends Customer{
	
	public PrimeCustomer(CustomerType customerType) {
		super(customerType);
	}

	public PrimeCustomer(){
		super(customer);
	}
	
	static CustomerType customer=CustomerType.Prime;
}
