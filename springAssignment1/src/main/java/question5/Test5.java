package question5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Test5 {

	public static void main(String[] args) {
	
		 ApplicationContext ac = new ClassPathXmlApplicationContext("spring5.xml");
		 
	        Employee emp = ac.getBean("myemployee", Employee.class);
	        System.out.println(emp.toString());
	}

}
