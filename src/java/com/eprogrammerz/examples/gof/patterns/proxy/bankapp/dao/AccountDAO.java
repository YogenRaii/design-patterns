package com.eprogrammerz.examples.gof.patterns.proxy.bankapp.dao;

import com.eprogrammerz.examples.gof.patterns.proxy.bankapp.domain.Account;

import java.util.ArrayList;
import java.util.Collection;

public class AccountDAO implements IAccountDAO {
    Collection<Account> accountList = new ArrayList<Account>();

    public void saveAccount(Account account) {
        accountList.add(account); // add the new
    }

    public void updateAccount(Account account) {
        Account accountExist = loadAccount(account.getAccountNumber());
        if (accountExist != null) {
            accountList.remove(accountExist); // remove the old
            accountList.add(account); // add the new
        }

    }

    public Account loadAccount(long accountnumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber() == accountnumber) {
                return account;
            }
        }
        return null;
    }

    public Collection<Account> getAccounts() {
        return accountList;
    }

}
