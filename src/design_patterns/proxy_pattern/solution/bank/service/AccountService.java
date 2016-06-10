package design_patterns.proxy_pattern.solution.bank.service;

import design_patterns.proxy_pattern.solution.bank.dao.AccountDAO;
import design_patterns.proxy_pattern.solution.bank.dao.IAccountDAO;
import design_patterns.proxy_pattern.solution.bank.domain.Account;
import design_patterns.proxy_pattern.solution.bank.domain.Customer;
import design_patterns.proxy_pattern.solution.proxies.Logger;
import design_patterns.proxy_pattern.solution.proxies.Timer;

import java.lang.reflect.Proxy;
import java.util.Collection;



public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;

	
	public AccountService(){
		IAccountDAO theaccountDAO=new AccountDAO();
		ClassLoader cl = IAccountDAO.class.getClassLoader();
		IAccountDAO theloggeraccountDAO = (IAccountDAO) Proxy.newProxyInstance(cl, new Class[] { IAccountDAO.class }, new Logger(theaccountDAO));

		accountDAO = (IAccountDAO) Proxy.newProxyInstance(cl, new Class[] { IAccountDAO.class }, new Timer(theloggeraccountDAO));

	}

	public Account createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		accountDAO.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		accountDAO.updateAccount(account);
	}

	public Account getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}
}
