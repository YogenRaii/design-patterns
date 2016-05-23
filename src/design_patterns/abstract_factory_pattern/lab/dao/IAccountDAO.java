package design_patterns.abstract_factory_pattern.lab.dao;

import design_patterns.abstract_factory_pattern.lab.domain.Account;

import java.util.Collection;

public interface IAccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(long accountnumber);
	Collection<Account> getAccounts();
}
