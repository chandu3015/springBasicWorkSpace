package com.chandu.spring.aop.basic.springAopBasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chandu.spring.aop.basic.springAopBasics.business.Business1;
import com.chandu.spring.aop.basic.springAopBasics.business.Business2;

@SpringBootApplication
public class SpringAopBasicsApplication implements CommandLineRunner {
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Business1 business1;
	
	@Autowired
	private Business2 business2;

	public static void main(String[] args) {
		System.out.println("In Main Method");
		System.out.println("............Getting Application Context.........");
		SpringApplication.run(SpringAopBasicsApplication.class, args);
		System.out.println("...........Got  Application Context.........");
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("********************************************");
		System.out.println("Begin Of command Line Runner interface");
		
		System.out.println("Business1 sys :"+business1.calCulateSomething());
		
		LOGGER.info(business1.calCulateSomething());
		
		
		System.out.println("Business2 sys"+business2.calCulateSomething());
		LOGGER.info(business2.calCulateSomething());
		
		
		System.out.println("End Of command Line Runner interface");
		System.out.println("********************************************");
		
	}

}

