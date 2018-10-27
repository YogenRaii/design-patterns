package com.eprogrammerz.examples.gof.patterns.observer_pattern.observer_pattern_lab;

import java.util.List;

/**
 * Created by ${YogenRai} on 3/26/2016.
 */
public class Account {
    private long accountNumber;

    private Customer customer;

    private List<AccountEntry> accountEntries;

    private long balance;

    public Account(long accountNumber, Customer customer, List<AccountEntry> accountEntries, long balance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.accountEntries = accountEntries;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<AccountEntry> getAccountEntries() {
        return accountEntries;
    }

    public void setAccountEntries(List<AccountEntry> accountEntries) {
        this.accountEntries = accountEntries;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString(){
        return "["+accountNumber+", "+customer+", "+accountEntries+", "+balance+"]";
    }
}
