package com.ys.hibernate.testing.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	private static SessionFactory sessionFactory = null;
	
	private HibernateSessionFactory(){}
	
	@SuppressWarnings("deprecation")
	public static SessionFactory getSessionFactoryInstance(){
		if(sessionFactory == null){
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory;
	}
}
