package core_Java_Assignment_5;

import java.util.stream.Collectors;
import java.util.*;

import java.util.Arrays;
import java.util.List;

public class newsmain {

	public static void main(String[] args) {


		List<News> mylist = Arrays.asList(
                new News(111,"Surya","Viji","good budget news"),
                new News(546,"anand","priya","bad budgetnews"),
                new News(123,"Anitha","Prasath","good  news"),
                new News(789,"anand","priya","bad news"),
                new News(111,"priya","thala","good budget news")
        );
		
		System.out.println("Find out the news ID which has maximum comments");
		Integer result = mylist
                .stream()
                //creating a stream of news
                .collect(Collectors.groupingBy(News::getNewsId,Collectors.counting()))
                //repackaging elements by news ID as key  and counting as value)
                .entrySet()
                //making a map to set
                .stream()
                /// creating a stream
                .max(Map.Entry.comparingByValue())
                //getting maximum value map.stream
                .get().getKey(); // geting the key of the maximum value

       

        System.out.println("News id with maximum comments : "+result);
        
        
        System.out.println("Find out how many times the word budget arrived in comments");
        
        long result1 = mylist.stream().filter(s->s.getComment().contains("budget")).count();
        System.out.println("the word 'budget' arrived in user comments all news:"+result1);

        System.out.println("Which user has posted maximum comments");
        
        String result2 = mylist.stream()
                .collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();
        System.out.println("User has posted maximum comments: "+result2);
        
        System.out.println("Display commentbyUser wise number of comments");

        Map result3= mylist.stream().collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));
        System.out.println(result3);
        

	}

}
