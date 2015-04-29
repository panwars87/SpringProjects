package com.ys.spring.aggregator;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ys.spring.aggregator.dto.Customer;
import com.ys.spring.aggregator.dto.CustomerType;
import com.ys.spring.aggregator.helpers.CustomerFactory;

class RunBeanMain {

	private static final Logger logger = Logger.getLogger(RunBeanMain.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
 
		if(logger.isDebugEnabled()){
			logger.info("Debug enebled for logger");
		}
		
		ShashantApp sApp = (ShashantApp)context.getBean("shashantApp");
		//Customer customer=CustomerFactory.buildCustomer(CustomerType.Prime);
		//customer.setCustomerId(567002);
		//customer.setFirstName("Shubham");
		//customer.setLastName("Panwar");
		//sApp.createCustomer(customer);
		
		Customer newCustomer=sApp.findCustomer(567002);
		logger.debug("Customer is : "+newCustomer.getFirstName()+" "+newCustomer.getLastName()+" "+newCustomer.getCustomerType());
		System.out.println("Customer is : "+newCustomer.getFirstName()+" "+newCustomer.getLastName()+" "+newCustomer.getCustomerType());
	}

}