package com.springboor.question2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	List<User> users;

	public UserServiceImpl() {
		users = new ArrayList<>();
		users.add(new User("surya", "suryasurya"));
		users.add(new User("viji", "vijiviji"));
		users.add(new User("vinoth", "vinothvinoth"));
		users.add(new User("mari", "marimari"));
		
	
	}

	@Override
	public String checkuser(User u1) {
		for (User u : users)
			{
		  if(u.getUsername().matches(u1.getUsername()))
		  {
			  if(u.getPassword().matches(u1.getPassword())) 
					return  "Valid User"; 
		  }
			}
		return "Invalid User";
	}
	

}

















