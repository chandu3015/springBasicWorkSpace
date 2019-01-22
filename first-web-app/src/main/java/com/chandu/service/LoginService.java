package com.chandu.service;

import org.springframework.stereotype.Service;


public class LoginService {
	

	public boolean AuthenticateUser(String name, String password)
	{
		if(password.equalsIgnoreCase("123"))
		{
			return true;
		}
		
		return false;
	}

}
