package com.eprogrammerz.examples.gof.patterns.proxy_pattern.lab;

import com.eprogrammerz.examples.gof.patterns.proxy_pattern.lab.domain.Account;
import com.eprogrammerz.examples.gof.patterns.proxy_pattern.lab.domain.AccountEntry;
import com.eprogrammerz.examples.gof.patterns.proxy_pattern.lab.domain.Customer;
import com.eprogrammerz.examples.gof.patterns.proxy_pattern.lab.proxies.Timer;
import com.eprogrammerz.examples.gof.patterns.proxy_pattern.lab.service.AccountService;
import com.eprogrammerz.examples.gof.patterns.proxy_pattern.lab.service.IAccountService;

import java.lang.reflect.Proxy;
import java.util.Collection;


public class Application {
	public static void main(String[] args) {
		IAccountService theAccountService = new AccountService();
//		IAccountService accountService = new AccountService();
		ClassLoader cl = IAccountService.class.getClassLoader();

		IAccountService accountService = (IAccountService) Proxy.newProxyInstance(cl, new Class[]{IAccountService.class}, new Timer(theAccountService));
//		IAccountService accountService = (IAccountService) ProxyAccountService.newInstance(new AccountService());
		// create 2 accounts;
		accountService.createAccount(1263862, "Frank Brown");
		accountService.createAccount(4253892, "John Doe");
		//use account 1;
		accountService.deposit(1263862, 240);
		accountService.deposit(1263862, 529);
		accountService.withdraw(1263862, 230);
		//use account 2;
		accountService.deposit(4253892, 12450);
		accountService.transferFunds(4253892, 1263862, 100, "payment of invoice 10232");
		// show balances
		
		Collection<Account> accountlist = accountService.getAllAccounts();
		Customer customer = null;
		for (Account account : accountlist) {
			customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountNumber());
			System.out.println("Account Holder: " + customer.getName());
			System.out.println("-Date-------------------------"
							+ "-Description------------------"
							+ "-Amount-------------");
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", entry.getDate()
						.toString(), entry.getDescription(), entry.getAmount());
			}
			System.out.println("----------------------------------------"
					+ "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:",
					account.getBalance());
		}
	}

}


