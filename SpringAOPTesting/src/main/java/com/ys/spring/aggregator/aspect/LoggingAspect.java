package com.ys.spring.aggregator.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component(value="loggingAspect")
public class LoggingAspect {
	
	@Before("getterPointCut()")
	public void beforeLog(){
		System.out.println("Going to execute Find Cusotmer method.");
	}
	
	@Pointcut("execution(* get*())")
	public void getterPointCut(){}
}
