package com.ys.spring.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ys.spring.aggregator.dto.Customer;
import com.ys.spring.beans.ShashantApp;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
 
		ShashantApp sApp = (ShashantApp)context.getBean("shashantApp");
		//Customer customer=CustomerFactory.buildCustomer(CustomerType.Prime);
		//customer.setCustomerId(567002);
		//customer.setFirstName("Shubham");
		//customer.setLastName("Panwar");
		//sApp.createCustomer(customer);
		
		Customer newCustomer=sApp.findCustomer(567002);
		System.out.println("Customer is : "+newCustomer.getFirstName()+" "+newCustomer.getLastName()+" "+newCustomer.getCustomerType());
	}
}
