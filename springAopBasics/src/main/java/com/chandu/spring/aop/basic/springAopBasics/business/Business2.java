package com.chandu.spring.aop.basic.springAopBasics.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.spring.aop.basic.springAopBasics.data.Dao2;

@Service
public class Business2 {

	@Autowired
	private Dao2 dao2;
	
	
	public String calCulateSomething()
	{
		return dao2.retrieveSomething();
	}
	
	
}
