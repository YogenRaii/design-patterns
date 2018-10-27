package com.eprogrammerz.examples.gof.patterns.strategy_pattern.strategy_pattern_lab.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


public class Account {
    long accountnumber;
    Collection<AccountEntry> entryList = new ArrayList<AccountEntry>();
    Customer customer;
    double interest;

    AccountType accountType;

    public Account(long accountnr) {
        this.accountnumber = accountnr;
    }

    public long getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(long accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        double balance = 0;
        for (AccountEntry entry : entryList) {
            balance += entry.getAmount();
        }
        return balance;
    }

    public void deposit(double amount) {
        AccountEntry entry = new AccountEntry(new Date(), amount, "deposit", "", "");
        entryList.add(entry);
    }

    public void withdraw(double amount) {
        AccountEntry entry = new AccountEntry(new Date(), -amount, "withdraw", "", "");
        entryList.add(entry);
    }

    private void addEntry(AccountEntry entry) {
        entryList.add(entry);
    }

    public void transferFunds(Account toAccount, double amount, String description) {
        AccountEntry fromEntry = new AccountEntry(new Date(), -amount, description, "" + toAccount.getAccountnumber(), toAccount.getCustomer().getName());
        AccountEntry toEntry = new AccountEntry(new Date(), amount, description, "" + toAccount.getAccountnumber(), toAccount.getCustomer().getName());
        entryList.add(fromEntry);
        toAccount.addEntry(toEntry);
        toAccount.deposit(amount);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Collection<AccountEntry> getEntryList() {
        return entryList;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
