package bank.dao;

import bank.domain.Account;

import java.util.Collection;

/**
 * Created by rajkumar on 6/3/2016.
 */
public class TestAccountDAO implements IAccountDAO {
    @Override
    public void saveAccount(Account account) {
        System.out.println("saveAccount()");
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println("updateAccount()");
    }

    @Override
    public Account loadAccount(long accountnumber) {
        System.out.println("loadAccount()");
        return null;
    }

    @Override
    public Collection<Account> getAccounts() {
        System.out.println("getAccount()");
        return null;
    }
}
