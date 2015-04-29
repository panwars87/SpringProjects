package com.ys.spring.aggregator.helpers;

import com.ys.spring.aggregator.dto.Customer;
import com.ys.spring.aggregator.dto.CustomerType;
import com.ys.spring.aggregator.dto.PrimeCustomer;
import com.ys.spring.aggregator.dto.RegularCustomer;
import com.ys.spring.aggregator.dto.StudentCustomer;

public class CustomerFactory {

	public static Customer buildCustomer(CustomerType customerType){
		Customer customer=null;
		switch(customerType){
			case Prime: return customer=new PrimeCustomer();
			case Student: return customer=new StudentCustomer();
			case Regular: return customer=new RegularCustomer();
		}
		if(customer == null){
			customer=new Customer(customerType);
		}
		return customer;
	}

}
