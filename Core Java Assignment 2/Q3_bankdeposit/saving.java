/**
 * 
 */
package Q3_bankdeposit;


public class saving extends bank {

	public saving(String account_holder_name, int account_number, String account_type, int deposit_money) {
		super(account_holder_name, account_number, account_type, deposit_money);
		
	}
	public void setBank_total() {
		bank_total=(getCurrunttotal()+getSavingstotal());
	}
    
		
	}
	

	
	
