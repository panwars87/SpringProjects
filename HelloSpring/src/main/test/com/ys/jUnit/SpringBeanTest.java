package com.ys.jUnit;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ys.spring.bean.ShapeHelper;
import com.ys.spring.bean.TestingBean;

//This @RunWith(SpringJUnit4ClassRunner.class) annotation and class helps to run & autowire dependency.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springConfig.xml")
public class SpringBeanTest {

	ApplicationContext ac;
	
	@Autowired
	private TestingBean testBean;
	
	@Before
	public void setUp(){
		ac=new ClassPathXmlApplicationContext("classpath:springConfig.xml");
	}
	
	@Test
	public void testBean() {
		Assert.assertEquals("Shashant", testBean.getName());
	}
	
	@Test
	public void testBean2(){
		TestingBean tb = (TestingBean)ac.getBean("testBean");
		Assert.assertEquals("Expected values is :26 ","26", tb.getAge());
	}
	
	@Test
	public void getShape(){
		ShapeHelper sh = (ShapeHelper)ac.getBean("shapeHelper");
		Assert.assertSame("Triangle", sh.drawShape());
	}
	
}
