package core_Java_Assignment_5;
import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mainclass {

	public static void main(String[] args) {


		List<Fruit> mylist=Arrays.asList(
				
				 new Fruit("Apple",150,40,"Red"),
				 
				 new Fruit("Banana",50,20,"Yellow"),
				 
				 new Fruit("Orange",170,80,"Yellow"),
				 
				 new Fruit("Binapple",70,70,"Sandle"),
				 
				 new Fruit("Watermelon",90,80,"Red"));
		
		
		// Quetion 1 display the fruits of low calories
		
		System.out.println("Display the fruit names of low colories fruits that is lessthan 100 sorted "
				+ "in decending order of colries");
		
		List<Fruit> calorylist= mylist.stream().filter(s -> s.getCalories()<100).
				sorted(new Comparator<Fruit>(){
					
					@Override
			            public int compare(Fruit o1, Fruit o2) {
			                if(o2.getCalories()> o1.getCalories()) return 1;
			                else return -1;
				}}).collect(Collectors.toList());
		
		calorylist.forEach(System.out ::println);
		
		//Question 2
		
		System.out.println("Display colorwise list of fruit names");
		
		List<Fruit> colorwise = mylist.stream().sorted(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                if(o1.getColor().equals(o2.getColor())) return -1;
                else return 1;
            }
        }).collect(Collectors.toList());
        colorwise.forEach(System.out::println);
        
        //Question3
        
        System.out.println("Display only red color friuts sorted as per thire price in decending order");
        
        
        List<Fruit> redcolor=mylist.stream().filter(s->s.getColor().equals("Red")).
        		sorted(new Comparator<Fruit>() {
                    @Override
                    public int compare(Fruit o1, Fruit o2) {
                        if(o1.getPrice()> o2.getPrice()) return 1;
                        else return -1;
                    }
                }).collect(Collectors.toList());
                redcolor.forEach(System.out::println);
				
				
				

	}

}


















