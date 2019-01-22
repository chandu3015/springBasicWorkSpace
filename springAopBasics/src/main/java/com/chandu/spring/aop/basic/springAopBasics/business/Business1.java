package com.chandu.spring.aop.basic.springAopBasics.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.spring.aop.basic.springAopBasics.data.Dao1;

@Service
public class Business1 {

	@Autowired
	private Dao1 dao1;
	
	
	public String calCulateSomething()
	{
		return dao1.retrieveSomething();
	}
	
	
}
