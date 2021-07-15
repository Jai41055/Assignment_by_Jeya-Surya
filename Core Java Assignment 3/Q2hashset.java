import java.util.HashSet;
import java.util.LinkedHashSet;

public class Q2hashset {

	public static void main(String[] args) {

    //In HashSet class Insertion of the object is not preserved , so output will come randomly
		
		HashSet unorder =new HashSet ();
		
		unorder.add(166);
		unorder.add(125.35);
		unorder.add("Surya");
		unorder.add('A');
		unorder.add(true);
		unorder.add(null);
		
		System.out.println("The Unorder list is "+unorder);
		
		//output [Surya, null, A, 166, 125.35, true]
		
		//In LinkedHashSet the element insertion is preserved so output will be in order
		
		LinkedHashSet order =new LinkedHashSet ();
		
		order.add(166);
		order.add(125.35);
	    order.add("Surya");
		order.add('A');
		order.add(true);
		order.add(null);
		
		System.out.println("The order list is "+order);
		
		//output [166, 125.35, Surya, A, true, null]

	}

}
