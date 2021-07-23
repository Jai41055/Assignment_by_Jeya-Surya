package question9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test9
{
    public static void main( String[] args )
    {

        ApplicationContext cap = new ClassPathXmlApplicationContext("spring9.xml"); 
             
			Hello hw= (Hello)cap.getBean("helloworld");
             System.out.println(hw.hashCode());
             
         ((ConfigurableApplicationContext) cap).close();
 
    }
}