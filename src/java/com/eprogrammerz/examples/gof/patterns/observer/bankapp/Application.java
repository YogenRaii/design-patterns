package com.eprogrammerz.examples.gof.patterns.observer.bankapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ${YogenRai} on 3/26/2016.
 */
public class Application {
    public static AccountService accountService = new AccountService();

    public static void main(String[] args) {
        SystemService smsService = new SMSSender();
        SystemService logger = new Logger();

        accountService.addService(smsService);
        accountService.addService(logger);

        printAccounts();
        accountService.deposit(100, 984187);
        printAccounts();

        List<AccountEntry> entries = new ArrayList<AccountEntry>();
        entries.add(new AccountEntry(new Date()));
        entries.add(new AccountEntry(new Date(3000000L)));

        accountService.createAccount(new Account(984187, new Customer("Yogen"), entries, 700));

        printAccounts();
    }

    public static void printAccounts() {
        for (Account account : accountService.getAllAccount()) {
            System.out.println(account);
        }
    }
}
