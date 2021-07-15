/**
 * 
 */
package Q4dateofbirth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q4user {

	public String getEmployee(HashMap<DateClass, String> hm,String employeeName){
	       
    	String s="get method fails";
      
        for (Map.Entry<DateClass, String> entry : hm.entrySet()) {
        
            if(entry.getValue().equals(employeeName)){ s=entry.getValue();break;}
            
        }
    return s;
    }
	public static void main(String[] args) {

		 Scanner ss= new Scanner(System.in);

	        HashMap<DateClass,String> hm= new HashMap<>();

			
	        DateClass d1=new DateClass(4,7,95);
	        hm.put(d1,"a1"); 
	        DateClass d2=new DateClass(4,3,97);
	        hm.put(d2,"a2"); 
	        DateClass d3=new DateClass(4,7,95);
	        hm.put(d3,"a"); 
	        DateClass d4=new DateClass(4,3,95);
	        hm.put(d4,"a3"); 

	        System.out.println("hashmap : "+hm);
	        
	        System.out.print("enter the name of employee you want to check : ");
	        String nae=ss.next();
	        
	        Q4user o=new Q4user();
	        System.out.println("          "+o.getEmployee(hm,nae));
	        

	    }


	}


