package com.chandu.spring.aop.basic.springAopBasics.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.aspectj.lang.annotation.Before;

@Aspect
@Configuration
public class BeforeAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Before("execution(* com.chandu.spring.aop.basic.springAopBasics.business.*.*(..))")
	public void Before(JoinPoint joinPoint)
	{
		//System.out.println("intercepted Method"+joinPoint.toString());
		logger.info("+++++++++++++++++++++++Intercepted Method calls++++++++++++");
		logger.info("intercepted Method {}",joinPoint);
	}
	

}
