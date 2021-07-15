
interface addable{
	int add(int a,int b);
}
interface subtraction{
	int sub(int a,int b);
}
interface multiplication{
	int mul(int a,int b);
}
interface division{
	int div(int a,int b);
}

public class Q1arithmetic {

	public static void main(String[] args) {
		
	addable ad1=(a,b)-> a+b;
	
	System.out.println("Addition of two number is "+ ad1.add(10, 20));
	
	subtraction sub1=(a,b)-> a-b;
	
	System.out.println("Subtraction of two number is "+ sub1.sub(10, 25));
	
    multiplication mul1=(a,b)-> a*b;
	
	System.out.println("Multiplication of two number is "+ mul1.mul(10, 2));
	
	division div1=(a,b)-> {
		
		if (b==0) return 0;
		else
			return a/b;};
			
	System.out.println("Division of two number is "+ div1.div(10, 2));		
	
    }}


