package core_Java_Assignment_5;
import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class maintrader {

	public static void main(String[] args) {


		List<Trader> mylistoftraders = Arrays.asList(
                new Trader("surya", "Pondicherry"),
                new Trader("vinoth", "Chennai"),
                new Trader("vijay", "Pondicherry"),
                new Trader("ajith", "Pune"),
                new Trader("kabil", "Pune"),
                new Trader("natpu", "Bangalore"),
                new Trader("viji","Indore"));
		
		System.out.println("Cities where the traders work");
		
		Set result = mylistoftraders.stream().
				collect(Collectors.groupingBy(Trader::getCity, Collectors.counting())).keySet();
        System.out.println("Cities where the traders work: "+result);
        
        
        
        System.out.println("all workers from pune");
        
        
        
        List result1 = mylistoftraders.stream()
                .filter(s->s.city.equals("Pune"))
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Traders from Pune and sort them by name: "+result1);
        
        
        System.out.println("Return the strings of all the names");
        
        mylistoftraders.stream()
        .map(Trader::getName)
        .sorted()
        .collect(Collectors.toList())
        .forEach(System.out::println);
        
        System.out.println("Traders from indore");
        
        Optional<Trader> result3 = mylistoftraders.stream().filter(s->s.city.equals("Indore")).findAny();
        System.out.println(result3);

	}

}












