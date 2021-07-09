/**
 * 
 */
package Q3_bankdeposit;

public class bank {

	public String Account_holder_name;
	public int Account_number;
	public String Account_type;
	public int deposit_money;
	public int fd_amount;
	public int cc_amount;
	public int bank_total;
	public bank(String account_holder_name, int account_number, String account_type, int deposit_money) {
		super();
		Account_holder_name = account_holder_name;
		Account_number = account_number;
		Account_type = account_type;
		this.deposit_money = deposit_money;
	}
	public int getSavingstotal() {
		return fd_amount;
	}
	public void setSavingstotal(int deposit_money) {
		fd_amount=fd_amount+deposit_money;
	}
	public int getCurrunttotal() {
		return cc_amount;
	}
	public void setCurrunttotal(int deposit_money) {
		cc_amount=cc_amount+deposit_money;
	}
	public int getBank_total() {
		return bank_total;
	}
	public void setBank_total() {
		
	}
	public String getAccount_holder_name() {
		return Account_holder_name;
	}
	public int getAccount_number() {
		return Account_number;
	}
	public String getAccount_type() {
		return Account_type;
	}
	public int getDeposit_money() {
		return deposit_money;
	}
	
	
		
	}

    
