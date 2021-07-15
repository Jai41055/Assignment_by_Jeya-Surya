/**
 * 
 */
package hashtable;

import java.util.Hashtable;
import java.util.Map;

public class userteat {

	
	public static void main(String[] args) {


    Map<Employee,String> ht= new Hashtable<>();
        
        Employee e1=new Employee("Jeyasurya",123);
        Employee e2=new Employee("Vinith",456);
        Employee e3=new Employee("Vinoth",789);
        
        ht.put(e1,"Jeyasurya");
        ht.put(e2,"vinoth");
        ht.put(e3,"vinith");
        
        System.out.println("hashtable : "+ht);
        
        System.out.println(ht.get(e2));
    }

	}


