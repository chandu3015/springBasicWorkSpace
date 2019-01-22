package com.chandu.spring.aop.basic.springAopBasics.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

	public String retrieveSomething()
	{
		return "Something2";
	}
}
