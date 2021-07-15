package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumerinterface {

	public static void main(String[] args) {


		Consumer<Integer> consumer=(number)-> System.out.println("The Number is "+ number);
		
		consumer.accept(25);
		
		
		
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		
		list1.stream().forEach(consumer);

	}

}
