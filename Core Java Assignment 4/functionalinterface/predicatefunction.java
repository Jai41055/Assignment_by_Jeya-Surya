package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicatefunction {

	public static void main(String[] args) {


		Predicate<Integer> predicate= (num) -> num%2==0;
		
		System.out.println(predicate.test(10));
		
        List<Integer> list1=Arrays.asList(1,2,3,4,5);
		
		list1.stream().filter(predicate).forEach((num)-> System.out.println("Print Even "+ num));

	}

}
