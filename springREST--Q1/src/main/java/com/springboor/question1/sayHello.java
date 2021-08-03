package com.springboor.question1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sayHello {
	
	@RequestMapping("/hi")
	public String hello()
	{
		return "Hello Jeyasurya";
	}

}
