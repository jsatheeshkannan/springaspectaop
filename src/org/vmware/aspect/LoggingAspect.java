package org.vmware.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	
	//@Before("allGetters()")
	//@Before("execution(public *  get*(..))")
	public void loggingAdvice(){
		System.out.println("First Advice run. on GetMethod");
	}
	@After("allGetters()")
	//@Before("execution(public *  getName(..))")
	public void SecondAdvice(){
		System.out.println("Second Advice run. on GetMethod");
	}
	@Before("allGetters()")
	//@Before("execution(public *  getName(..))")
	public void ThirdAdvice(){
		System.out.println("Third Advice run. on GetMethod");
	}
	@Before("allGetterscirclemethods()")
	public void FourthAdvice(){
		System.out.println("Four Advice run. on GetMethod");
	}
	
	@Pointcut("execution(public * getName(..))")
	public void allGetters(){}

	@Pointcut("within(org.vmware.spring.model.Circle)")
	public void allGetterscirclemethods(){}

}
 