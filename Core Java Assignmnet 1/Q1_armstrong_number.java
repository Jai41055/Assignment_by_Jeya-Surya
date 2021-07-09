import java.util.Scanner;

public class Q1_armstrong_number {

    static int num;
	public static void main(String[] args) {
		int sum=0,count=0,rem;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		num=s.nextInt();
		s.close();
		int temp=num;
		int power=num;
		while(power>0)
		{
			power=power/10;
			count++;
		}
		while(num>0)
		{
			rem=num%10;
			sum=(int)(sum+Math.pow(rem,count));
			num=num/10;
			
		}
		if(temp==sum)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");
		

	}

}
