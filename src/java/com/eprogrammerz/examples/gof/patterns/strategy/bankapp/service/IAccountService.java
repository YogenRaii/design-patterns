package com.eprogrammerz.examples.gof.patterns.strategy.bankapp.service;

import com.eprogrammerz.examples.gof.patterns.strategy.bankapp.domain.Account;

import java.util.Collection;

public interface IAccountService {
    //    Account createAccount(long accountNumber, String customerName);
    Account createAccount(long accountNumber, String customerName, String typeName);

    void addInterest(long accountNumber);

    Account getAccount(long accountNumber);

    Collection<Account> getAllAccounts();

    void deposit(long accountNumber, double amount);

    void withdraw(long accountNumber, double amount);

    void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description);
}
