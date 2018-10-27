package com.eprogrammerz.examples.gof.patterns.command.bankapp.dao;

import com.eprogrammerz.examples.gof.patterns.command.bankapp.domain.Account;

import java.util.ArrayList;
import java.util.Collection;

public class AccountDAO implements IAccountDAO {
	Collection<Account> accountlist = new ArrayList<Account>();

	public void saveAccount(Account account) {
		accountlist.add(account); // add the new
	}

	public void updateAccount(Account account) {
		Account accountexist = loadAccount(account.getAccountNumber());
		if (accountexist != null) {
			accountlist.remove(accountexist); // remove the old
			accountlist.add(account); // add the new
		}

	}

	public Account loadAccount(long accountnumber) {
		for (Account account : accountlist) {
			if (account.getAccountNumber() == accountnumber) {
				return account;
			}
		}
		return null;
	}

	public Collection<Account> getAccounts() {
		return accountlist;
	}

}
