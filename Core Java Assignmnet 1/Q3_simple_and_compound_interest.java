import java.util.Scanner;
public class Q3_simple_and_compound_interest {

	public static void main(String[] args) {
		float principal,rate,time,number_of_time;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the principal ampount");
		principal=input.nextFloat();
		System.out.println("Enter the rate Percent");
		rate=input.nextFloat();
		System.out.println("Enter the time period");
		time=input.nextFloat();
		System.out.print("Number of times interest applied per time period: ");
        number_of_time = input.nextFloat();
        input.close();

       float SI = ((principal*rate/100*time));

        double CI = principal*Math.pow((1+(rate/100)/number_of_time),number_of_time*time);
        System.out.println(" Simple Interest: "+SI);
        System.out.println(" Compound Interest: "+CI);
		

	}

}
