package com.eprogrammerz.examples.gof.patterns.strategy_pattern.strategy_pattern_lab;

import com.eprogrammerz.examples.gof.patterns.strategy_pattern.strategy_pattern_lab.domain.Account;
import com.eprogrammerz.examples.gof.patterns.strategy_pattern.strategy_pattern_lab.domain.AccountEntry;
import com.eprogrammerz.examples.gof.patterns.strategy_pattern.strategy_pattern_lab.domain.Customer;
import com.eprogrammerz.examples.gof.patterns.strategy_pattern.strategy_pattern_lab.service.AccountService;
import com.eprogrammerz.examples.gof.patterns.strategy_pattern.strategy_pattern_lab.service.IAccountService;

import java.util.Collection;


public class Application {
	public static void main(String[] args) {
		IAccountService accountService = new AccountService();
		// create 2 accounts;
		accountService.createAccount(1263862, "Frank Brown","saving");
		accountService.createAccount(4253892, "John Doe", "checking");
		//use account 1;
		accountService.deposit(1263862, 240);
		accountService.deposit(1263862, 529);
		accountService.withdraw(1263862, 230);
		accountService.addInterest(1263862);
		//use account 2;
		accountService.deposit(4253892, 12450);
		accountService.transferFunds(4253892, 1263862, 100, "payment of invoice 10232");
		accountService.addInterest(4253892);
		// show balances
		
		Collection<Account> accountlist = accountService.getAllAccounts();
		Customer customer = null;
		for (Account account : accountlist) {
			customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountnumber());
			System.out.println("Account Type: "+account.getAccountType());
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
			System.out.printf("%30s%30s%20.2f\n", "", "Current Balance:",
					account.getBalance());
			System.out.printf("%30s%30s%20.2f\n\n", "", "Interest amount:",
					account.getInterest());
		}
	}

}


