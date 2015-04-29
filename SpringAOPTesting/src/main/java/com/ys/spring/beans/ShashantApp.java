package com.ys.spring.beans;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ys.spring.aggregator.dao.JdbcCustomerDao;
import com.ys.spring.aggregator.dto.Customer;

@Component(value="shashantApp")
public class ShashantApp{
	
	@Autowired
	Properties defaultProperties;
	
	@Autowired
	JdbcCustomerDao jdbcCustomerDaoImpl;
	
	@Autowired
	@Qualifier(value="customerBean")
	Customer customer;
	
	public void createCustomer(Customer customer){
		jdbcCustomerDaoImpl.createCustomer(customer);
	}
	
	public Customer findCustomer(int customerId){
		return jdbcCustomerDaoImpl.findCustomer(customerId);
	}
}