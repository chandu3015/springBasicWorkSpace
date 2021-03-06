package com.chandu.mvcController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chandu.mvcService.LoginService;

@Controller 
public class LoginController {
	
	@Autowired
	private LoginService loginService ;

	@RequestMapping(value = "/login" , method = RequestMethod.GET)
	//@ResponseBody
	public String sayHello()
	{
		//return "Hello , Chandu!!";
		return "login";
	}
	
	
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	//@ResponseBody
	public String Validate(ModelMap model ,@RequestParam String name,@RequestParam String password)
	{
		model.put("name",name);
		model.put("errorMessage","Auth Failed!!");
		
		if(loginService.AuthenticateUser(name, password) == true)
			
			return "welcomeMvc";
		
		return "loginMvc";
	}
	
	
	
}
