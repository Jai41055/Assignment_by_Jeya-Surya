package injectlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Test1 {

	public static void main(String[] args) {
	
	    AbstractApplicationContext context=new ClassPathXmlApplicationContext("friend.xml");
		
		Question friends=(Question)context.getBean("friend");
		
		friends.listofmyfriends();
	}

}
