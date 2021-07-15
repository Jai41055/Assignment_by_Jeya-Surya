package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class supplierfunction {

	public static void main(String[] args) {

        Supplier<String> suplier =() -> "Hello Jeyasurya";
        
        //System.out.println(suplier.get());
        
        List<String> list1=Arrays.asList();
        
        System.out.println(list1.stream().findAny().orElseGet(suplier));
        
	}

}
