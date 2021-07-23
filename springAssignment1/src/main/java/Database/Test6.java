package Database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring6.xml");
        DbConfiguration dbConfiguration = (DbConfiguration)context.getBean("dbConfiguration");
        dbConfiguration.display();
    }

}