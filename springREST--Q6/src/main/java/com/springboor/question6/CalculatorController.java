package com.springboor.question6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	    
	    @Autowired
	    private CalculatorService answer;
	
		@RequestMapping("/add/{a}/{b}")
	       
	    public int giveAdd(@PathVariable int a,@PathVariable int b) {
			
		   return answer.addService(a, b);}
		   
		@RequestMapping("/subract/{a}/{b}")
	       
		 public int givesubtract(@PathVariable int a,@PathVariable int b) {
				
		  return answer.subractionService(a, b);}
		@RequestMapping("/multiply/{a}/{b}")
	       
		 public int givemultiplication(@PathVariable int a,@PathVariable int b) {
				
		  return answer.multiplicationService(a, b);}
		@RequestMapping("/division/{a}/{b}")
	       
		 public int givedivision(@PathVariable int a,@PathVariable int b) {
				
		  return answer.divisionService(a, b);}
		@RequestMapping("/squre/{a}")
	       
		 public int givesqure(@PathVariable int a) {
				
		  return answer.squreService(a);}
		
	}



