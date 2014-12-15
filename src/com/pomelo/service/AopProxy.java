package com.pomelo.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopProxy {
	//@Pointcut("execution(public * com.pomelo.dao.impl.UserImpl.save(com.pomelo.entity.User))")
	@Pointcut("execution(public * com.pomelo.service..*.addUser(..))")
	public void myMethod(){};
	@Before("myMethod()")
	public void beforeMethod(){
		System.out.println("method start");
	}
	
	@After("myMethod()")
	public void afterMethod(){
		System.out.println("method end");
	}
}
