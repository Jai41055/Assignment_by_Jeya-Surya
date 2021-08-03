package com.springboor.question2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.POST, value="/login")
    public String checkUser(@RequestBody User u1)
	{
		System.out.println(u1.getUsername()+" "+u1.getPassword());
		return service.checkuser(u1);
		
	}
	@RequestMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	
}
