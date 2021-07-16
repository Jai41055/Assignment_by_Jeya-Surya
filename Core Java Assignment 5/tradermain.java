package core_Java_Assignment_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;


public class tradermain {

	public static void main(String[] args) {


		List<Transaction> mytransaction = Arrays.asList(
                new Transaction(new Trader("surya","Chennai"),2013,100000),
                new Transaction(new Trader("anitha","Bangalore"),2011,2500000),
                new Transaction(new Trader("kalai","Mumbai"),2013,300000),
                new Transaction(new Trader("pandi","Kerala"),2011,500000),
                new Transaction(new Trader("mohan","Delhi"),2018,60000)
        );
		
		System.out.println("Find  all  transactions  in  the  "
				+ "year  2011  and  sort  them  by  value  (small  to high)");
		
		 List<Transaction> result = mytransaction.stream()
	                .filter(c -> (c.getYear())==2011)
	                .sorted(new Comparator<Transaction>() {
	                        @Override
	                        public int compare(Transaction o1, Transaction o2) {
	                            if(o2.getValue() >o1.getValue()) return 1;
	                            else return -1; }
	                        })
	                .collect(Collectors.toList());
		 System.out.println(result);
		 
		 System.out.println("All the transaction from the people who living in delhi");
		 
		 List<Transaction> result2 = mytransaction.stream()
	                .filter(c->c.getTrader().getCity().equals("Delhi"))
	                .collect(Collectors.toList());
	        System.out.println("All transactions values from the traders  lives in delhi : "+result2);
	        
	        System.out.println("Highest transaction value");
	        
	        Integer result3 = mytransaction.stream().collect(Collectors.groupingBy(value->value.getValue(),Collectors.counting()))
	                .entrySet()
	                .stream()
	                .max(Map.Entry.comparingByKey()).get().getKey();;
	                
	                System.out.println("Highest value of the transaction: "+result3);
	                
	                
	        System.out.println("find the smallest value in transaction");
	        
	        List<Transaction> result4 = mytransaction.stream().
	                min(Comparator.comparing(Transaction::getValue))
	                .stream()
	                .collect(Collectors.toList());
	        System.out.println(result4);
		 
		 

	}

}























