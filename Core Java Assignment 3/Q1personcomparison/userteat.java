
package personcomparison;

import java.util.Set;
import java.util.TreeSet;

public class userteat {

	
	public static void main(String[] args) {


		Set<person> one=new TreeSet<person>();
		
		person p1= new person(60,165,"JeyaSurya");
		person p2= new person(55,180,"Vasanth");
		person p3= new person(60,169,"vinith");
		person p4= new person(80,170,"vinoth");
		
		one.add(p1);
		one.add(p2);
		one.add(p3);
		one.add(p4);
		
		for (person mine: one)
		{
			mine.display();
		}
		
		

	}

}
