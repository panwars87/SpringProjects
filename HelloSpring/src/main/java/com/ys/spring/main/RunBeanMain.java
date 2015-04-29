package com.ys.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ys.spring.bean.Bottle;
import com.ys.spring.bean.BottleHelper;
import com.ys.spring.bean.Customer;
import com.ys.spring.bean.ShapeHelper;
import com.ys.spring.bean.TestingBean;

public class RunBeanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
 
		//TestingBean obj = (TestingBean) context.getBean("testBean");
		//System.out.println(obj.getName() + " and "+obj.getAge());
		
		//ShapeHelper sh = (ShapeHelper)context.getBean("shapeHelper");
		//System.out.println(sh.drawShape());
		
		//Customer nishu = (Customer)context.getBean("customer");
		//System.out.println(nishu);
		
		BottleHelper bottleHelper=(BottleHelper)context.getBean("bottleHelper");
		System.out.println(bottleHelper.getBottleType());
		
	}

}
