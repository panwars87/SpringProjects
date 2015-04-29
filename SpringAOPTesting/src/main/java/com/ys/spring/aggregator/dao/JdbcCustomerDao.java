package com.ys.spring.aggregator.dao;

import com.ys.spring.aggregator.dto.Customer;

public interface JdbcCustomerDao {

	void createCustomer(Customer customer);
	Customer findCustomer(int customerId);
}
