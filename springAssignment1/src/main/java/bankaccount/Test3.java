package bankaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Test3 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("account.xml");
        Controller b = (Controller)context.getBean("controller");
        b.deposit(375345,10000);
        b.withdraw(375345, 500);
        b.getBalance(375345);
	}

}
