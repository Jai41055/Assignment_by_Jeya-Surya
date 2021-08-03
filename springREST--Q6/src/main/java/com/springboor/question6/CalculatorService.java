package com.springboor.question6;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	
		  public int addService(int a,int b) {
			  return a+b;
		  }
		  public int subractionService(int a,int b) {
			  return a-b;
		  }
		  public int multiplicationService(int a,int b) {
			  return a*b;
		  }
		  public int divisionService(int a,int b) {
			  return a/b;
		  }
		  public int squreService(int a)
		  {
			  return a*a;
		  }
		}


