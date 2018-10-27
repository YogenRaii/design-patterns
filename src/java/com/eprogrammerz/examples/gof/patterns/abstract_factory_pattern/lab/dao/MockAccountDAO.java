package com.eprogrammerz.examples.gof.patterns.abstract_factory_pattern.lab.dao;

import com.eprogrammerz.examples.gof.patterns.abstract_factory_pattern.lab.domain.Account;

import java.util.ArrayList;
import java.util.Collection;

public class MockAccountDAO implements IAccountDAO {
	Collection<Account> accountList = new ArrayList<Account>();

	public void saveAccount(Account account) {
		System.out.println("saveAccount(): Mock");
		accountList.add(account); // add the new
	}

	public void updateAccount(Account account) {
		System.out.println("updateAccount(): Mock");
		Account accountexist = loadAccount(account.getAccountnumber());
		if (accountexist != null) {
			accountList.remove(accountexist); // remove the old
			accountList.add(account); // add the new
		}

	}

	public Account loadAccount(long accountnumber) {
		System.out.println("loadAccount() : Mock");
		for (Account account : accountList) {
			if (account.getAccountnumber() == accountnumber) {
				return account;
			}
		}
		return null;
	}

	public Collection<Account> getAccounts() {
		return accountList;
	}

}
