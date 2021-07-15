package Q9Bankaccount;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Assignment3Q9 {
	
	 public static void main(String[] args) {
	        
	        TreeSet<SavingAccount> ts = new TreeSet<>(Comparator.comparing(SavingAccount::getAcc_ID));
	        Scanner ss= new Scanner(System.in);
	        
	        ts.add(new SavingAccount(30.0,3,"h1",true));
	        ts.add(new SavingAccount(25.0,2,"h2",false));
	        
	        BankAccountList b =new BankAccountList(ts);
	        
	        System.out.print("enter the nmber of savings accounts : ");
	        int ne=ss.nextInt();

	        for (int i=0;i<ne;i++){

	            System.out.print("enter the account ID              : ");
	            int m=ss.nextInt();
	            
	            System.out.print("enter the account balance         : ");
	            double d=ss.nextDouble();

	            System.out.print("enter the account holder name     : ");
	            String y=ss.next();

	            System.out.print("enter is it salary account or not : ");
	            boolean n=ss.nextBoolean();

	            b.addSavingAccount(new SavingAccount(d,m,y,n));
	        }
	        
	        b.displaySavingAccountIds().forEach(f -> System.out.println(f));

	    }

}
