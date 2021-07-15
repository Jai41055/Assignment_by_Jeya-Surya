package replacefunction;

import java.util.ArrayList;
import java.util.Arrays;

public class usingreplaceall {

	public static void main(String[] args)throws CloneNotSupportedException {


		ArrayList<String> names = new ArrayList<>(Arrays.asList("surya", "anitha", "anand", "mahesh", "vasanth"));
        
        System.out.println(names);
         
        names.replaceAll( name -> name.toUpperCase() );  
         
        System.out.println(names);
		

	}

}
