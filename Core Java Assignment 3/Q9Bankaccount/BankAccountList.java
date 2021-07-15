package Q9Bankaccount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class BankAccountList {
	
private TreeSet<SavingAccount> savingAccounts = new TreeSet<>(Comparator.comparing(SavingAccount::getAcc_ID));
    
    public BankAccountList() {super();}

    public BankAccountList(TreeSet<SavingAccount> savingAccounts) {
        super();
        this.savingAccounts = savingAccounts;
    }
    
    int  a= savingAccounts.size();

    public boolean addSavingAccount(SavingAccount savingAccount) {
        savingAccounts.add(savingAccount);
        int b= savingAccounts.size();
        if (b==a) {return false;}
        return true;
    }

    public List<Integer> displaySavingAccountIds() {
        List<Integer> l = new ArrayList<>(); 
        savingAccounts.stream().forEach(e -> l.add(e.getAcc_ID()));
        return l;
    }

}
