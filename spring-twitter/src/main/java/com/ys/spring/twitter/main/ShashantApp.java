package com.ys.spring.twitter.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ys.spring.twitter.beans.TwitterBean;

public class ShashantApp{
	
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		TwitterBean tweet = context.getBean("twitterBean",TwitterBean.class);
		tweet.getBeanName();
	}
}