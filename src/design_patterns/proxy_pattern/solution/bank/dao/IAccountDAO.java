package design_patterns.proxy_pattern.solution.bank.dao;

import design_patterns.proxy_pattern.solution.bank.domain.Account;

import java.util.Collection;

public interface IAccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(long accountnumber);
	Collection<Account> getAccounts();
}
