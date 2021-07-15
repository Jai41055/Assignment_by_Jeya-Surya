import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Question5 {

	 List<String> list1 = Arrays.asList("surya", "anitha", "anand", "mahesh", "prasath");

	    public static void main(String[] args) {
	    	
	    	Consumer<String> con = a -> System.out.println(a);
	    	con.accept(processWords(new Question5().list1));
	    }

	    public static String processWords(List<String> list) {
	    	
	    	StringBuffer sb = new StringBuffer("");
	    	list.forEach(n -> sb.append(n.charAt(0)));
	    	return sb.toString();
	    }

}
