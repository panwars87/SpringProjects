package com.ys.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bottleHelper")
public class BottleHelper {
	
	@Autowired
	Bottle bottleBean;
	
	public String getBottleType(){
		return bottleBean.toString();
	}
}
