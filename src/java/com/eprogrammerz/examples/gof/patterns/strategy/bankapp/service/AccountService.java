package com.eprogrammerz.examples.gof.patterns.strategy.bankapp.service;


import com.eprogrammerz.examples.gof.patterns.strategy.bankapp.dao.AccountDAO;
import com.eprogrammerz.examples.gof.patterns.strategy.bankapp.dao.IAccountDAO;
import com.eprogrammerz.examples.gof.patterns.strategy.bankapp.domain.*;

import java.util.Collection;

public class AccountService implements IAccountService {
    private IAccountDAO accountDAO;


    public AccountService() {
        accountDAO = new AccountDAO();
    }

    public Account createAccount(long accountNumber, String customerName, String typeName) {
        Account account = new Account(accountNumber);
        Customer customer = new Customer(customerName);

        AccountType accountType;
        accountType = typeName.equals("saving") ? new SavingAccount() : new CheckingAccount();

        account.setAccountType(accountType);
        account.setCustomer(customer);
        accountDAO.saveAccount(account);
        return account;
    }

    @Override
    public void addInterest(long accountNumber) {
        Account account = accountDAO.loadAccount(accountNumber);
        double interest = account.getAccountType().calculateInterest(account.getBalance());
        account.setInterest(interest);
        accountDAO.updateAccount(account);
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
