package com.eprogrammerz.examples.gof.patterns.command.bankapp;

import com.eprogrammerz.examples.gof.patterns.command.bankapp.commands.Command;
import com.eprogrammerz.examples.gof.patterns.command.bankapp.commands.DepositCommand;
import com.eprogrammerz.examples.gof.patterns.command.bankapp.commands.TransferCommand;
import com.eprogrammerz.examples.gof.patterns.command.bankapp.commands.WithdrawCommand;
import com.eprogrammerz.examples.gof.patterns.command.bankapp.domain.Account;
import com.eprogrammerz.examples.gof.patterns.command.bankapp.domain.AccountEntry;
import com.eprogrammerz.examples.gof.patterns.command.bankapp.domain.Customer;
import com.eprogrammerz.examples.gof.patterns.command.bankapp.service.AccountService;
import com.eprogrammerz.examples.gof.patterns.command.bankapp.service.IAccountService;

import java.util.Collection;


public class Application {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();

		IAccountService accountService = new AccountService();
		// create 2 accounts;
		accountService.createAccount(1263862, "Frank Brown");
		accountService.createAccount(4253892, "John Doe");

		//use account 1;
		Command depositCommand1 = new DepositCommand(accountService,1263862, 240);
		Command depositCommand2 = new DepositCommand(accountService,1263862, 529);

		invoker.execute(depositCommand1);
		invoker.execute(depositCommand2);

		Command withdrawCommand = new WithdrawCommand(accountService,1263862, 230);
		invoker.execute(withdrawCommand);
		invoker.undo();
		invoker.redo();

		//use account 2;
		Command depositCommand = new DepositCommand(accountService,4253892, 12450);
		invoker.execute(depositCommand);

		Command transferCommand = new TransferCommand(4253892, 1263862, 100, "payment of invoice 10232",accountService);
		invoker.execute(transferCommand);
		invoker.undo();

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


