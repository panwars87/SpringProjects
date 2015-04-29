package com.ys.hibernate.testing.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ys.hibernate.testing.beans.SampleHibernateBean;
import com.ys.hibernate.testing.dto.Address;
import com.ys.hibernate.testing.dto.AutoInsurance;
import com.ys.hibernate.testing.dto.UserEntityBean;
import com.ys.hibernate.testing.dto.Vehicle;



public class ShashantApp{
	
	public static void main(String args[]){
		//ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		//SampleHibernateBean tweet = context.getBean("sampleHibernateBean",SampleHibernateBean.class);
		//tweet.getBeanName();
		
		/**For now we are using normal hibernate without Spring integration, so dont get confuse with spring bean and file in this 
		 * project.
		 * We will update the same project and integrate spring init.
		 * For now, think of this as a simple Java-Hibernate project with Maven.**/
		
		UserEntityBean user = new UserEntityBean();
		Address adr = new Address();
		Address adr2 = new Address();
		Vehicle audi = new Vehicle();
		Vehicle bmw = new Vehicle();
		AutoInsurance auto = new AutoInsurance();
		
		
		user.setDob("18-12-1987");
		user.setFirstName("Shubham");
		user.setLastName("Panwar");
		user.setUserName("spanwar");
		user.setUserDescription("Prime");
		
		adr.setApt("5208");
		adr.setCity("Novi");
		adr.setCountry("United States");
		adr.setState("MI");
		adr.setStreet("31160 Portside Dr");
		adr.setZipcode(48377);
		
		adr2.setApt("5210");
		adr2.setCity("Novi");
		adr2.setCountry("United States");
		adr2.setState("MI");
		adr2.setStreet("31170 Portside Dr");
		adr2.setZipcode(48378);
		
		audi.setVehicleName("Audi");
		bmw.setVehicleName("BMW");
		
		auto.setPolicyName("AUTO001");
		auto.setUser(user);
		
		user.setInsurance(auto);
		user.getVehicle().add(audi);
		user.getVehicle().add(bmw);
		user.getListOfAddress().add(adr);
		user.getListOfAddress().add(adr2);
		
		//Creating Hibernate Session from SessionFactory
		Session session = HibernateSessionFactory.getSessionFactoryInstance().openSession();
		try{
			session.beginTransaction();
			session.save(user);
			session.save(audi);
			session.save(bmw);
			session.save(auto);
			session.getTransaction().commit();
			session.close();
		}catch(HibernateException e){
			e.printStackTrace();
		}
	}
}