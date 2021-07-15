package functionalinterface;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

public class removeifemethod {

	public static void main(String[] args) {

		Collection<Integer> mycollection = new ConcurrentLinkedQueue<Integer>();  
		
        for (int i=1;i<100;i++)
        {  
            mycollection.add(i);
            }  
        System.out.println("Total no : "+ mycollection);  
        
        Predicate<Integer> pr= a->(a%4!=0);  
       
        
        mycollection.removeIf(pr );  
        
        System.out.println(" Table of 4 = "+mycollection);  

	}

}
