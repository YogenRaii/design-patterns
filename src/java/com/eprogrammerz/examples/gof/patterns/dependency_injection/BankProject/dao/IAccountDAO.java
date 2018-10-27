package com.eprogrammerz.examples.gof.patterns.dependency_injection.BankProject.dao;

import com.eprogrammerz.examples.gof.patterns.dependency_injection.BankProject.domain.Account;

import java.util.Collection;

public interface IAccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(long accountnumber);
	Collection<Account> getAccounts();
}
