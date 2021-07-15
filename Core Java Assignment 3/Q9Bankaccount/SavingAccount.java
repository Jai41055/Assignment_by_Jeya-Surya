package Q9Bankaccount;

public class SavingAccount {
	
	 private double acc_balance;
	    private int acc_ID;
	    private String accountHolderName;
	    private boolean isSalaryAccount;
	    
	    
	    public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
	        super();
	        this.acc_balance = acc_balance;
	        this.acc_ID = acc_ID;
	        this.accountHolderName = accountHolderName;
	        this.isSalaryAccount = isSalaryAccount;
	    }
	    
	    
	    public double getAcc_balance() {return acc_balance;}
	    public int getAcc_ID() {return acc_ID;}
	    public String getAccountHolderName() {return accountHolderName;}
	    public boolean getisSalaryAccount() {return isSalaryAccount;}
	    
	    
	    public void setAcc_balance(double acc_balance) {this.acc_balance = acc_balance;}
	    public void setAcc_ID(int acc_ID) {this.acc_ID = acc_ID;}
	    public void setAccountHolderName(String accountHolderName) {this.accountHolderName = accountHolderName;}
	    public void setSalaryAccount(boolean isSalaryAccount) {this.isSalaryAccount = isSalaryAccount;}
	    

}
