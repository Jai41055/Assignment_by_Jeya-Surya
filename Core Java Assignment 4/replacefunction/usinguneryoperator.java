package replacefunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;


class MyOperator implements UnaryOperator<String> 
{
    @Override
    public String apply(String name) {
        return name.toUpperCase();
    }
}

public class usinguneryoperator {

	public static void main(String[] args) {
	

		ArrayList<String> names = new ArrayList<>(Arrays.asList("surya", "anitha", "anand", "mahesh", "prasath"));
        
        System.out.println(names);
         
        names.replaceAll( new MyOperator() );  
         
        System.out.println(names);
	}

}
