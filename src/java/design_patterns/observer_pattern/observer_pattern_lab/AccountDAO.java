package design_patterns.observer_pattern.observer_pattern_lab;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ${YogenRai} on 3/26/2016.
 */
public class AccountDAO {
    List<Account> accounts;

    public AccountDAO(){
        final List<AccountEntry> entries = new ArrayList<AccountEntry>();
        entries.add(new AccountEntry(new Date()));
        entries.add(new AccountEntry(new Date(1000000L)));

        accounts = new ArrayList<Account>(){
            {
                add(new Account(984187,new Customer("Yogen"),entries,100));
                add(new Account(984598,new Customer("Rai"),entries,1000));
            }
        };
    }

    public void saveAccount(Account account){
        accounts.add(account);
    }
    public void updateAccount(Account account){
        for (int i = 0; i < accounts.size(); i++) {
            if(account.getAccountNumber() == accounts.get(i).getAccountNumber()){
                accounts.remove(i);
                break;
            }
        }
        accounts.add(account);
    }
    public Account loadAccount(Long accountNumber){
        for(Account account: accounts){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        return null;
    }
    public List<Account> getAccounts(){
        return accounts;
    }
}
