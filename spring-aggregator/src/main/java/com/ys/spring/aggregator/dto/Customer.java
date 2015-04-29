package com.ys.spring.aggregator.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository(value="customerBean")
public class Customer {
	private CustomerType customerType;
	
	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	@Value("#{addressBean}")
	Address customerAddress;
	
	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Value("#{contactBean}")
	Contact contact;
	
	private int customerId;
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	private String firstName;
	private String lastName;

	public Customer(){
		this.customerType=CustomerType.Regular;
	}
	
	public Customer(CustomerType customerType){
		this.customerType=customerType;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
