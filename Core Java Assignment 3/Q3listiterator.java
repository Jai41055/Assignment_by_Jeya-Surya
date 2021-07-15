import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Q2listiterator {
	
	 public static void main(String[] args)
	    {
	          // list of names
	        List<String> names = new LinkedList<>();
	        names.add("surya");
	        names.add("prasath");
	        names.add("anitha");
	  
	        // Getting ListIterator
	        ListIterator<String> ite
	            = names.listIterator();
	        
	        //forward direction print
	        System.out.println("Forward Direction Iteration:");
	        while (ite.hasNext()) {
	            System.out.println(ite.next());}
	        
	        
	        //backward direction print
	        System.out.println("Backward Direction Iteration:");
	        while (ite.hasPrevious()) {
	            System.out.println(ite.previous());
	        }

}}
