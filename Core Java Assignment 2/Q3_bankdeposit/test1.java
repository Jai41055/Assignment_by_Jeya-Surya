/**
 * 
 */
package Q3_bankdeposit;

/**
 * @author Surya
 *
 */
public class test1 {

	public static void main(String[] args) {

      saving fixed_deposit=new saving("surya",1234,"savings",250000);
      currunt cash_credit =new currunt("anand",5678,"currunt",450000);
      
      
      System.out.println("The amount paid as a fixed deposit in "+fixed_deposit.Account_type +" account is "+fixed_deposit.deposit_money);
      
      System.out.println("The amount paid as a cash credit in "+cash_credit.Account_type +" account is "+cash_credit.deposit_money);
      
      System.out.println("The total amount in the bank is "+ (fixed_deposit.deposit_money + cash_credit.deposit_money));
	}

}
 