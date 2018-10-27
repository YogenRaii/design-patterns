package com.eprogrammerz.examples.gof.patterns.observer_pattern.observer_pattern_lab;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ${YogenRai} on 3/26/2016.
 */
public class AccountService {

    private AccountDAO accountDAO = new AccountDAO();

    private List<SystemService> services = new ArrayList<SystemService>();

    public void addService(SystemService service){
        services.add(service);
    }

    public void createAccount(Account account){
        accountDAO.saveAccount(account);

        SystemService emailService = new EmailSender();
        emailService.provideService();
    }
    public void deposit(long amount,long accNum){
        Account account = accountDAO.loadAccount(accNum);

        long newBalance = account.getBalance() + amount;
        account.setBalance(newBalance);

        AccountEntry entry = new AccountEntry(new Date());
        account.getAccountEntries().add(entry);

        accountDAO.updateAccount(account);

        provideSystemServices();
    }
    public Long withdraw(){
        provideSystemServices();
        return  null;
    }
    public void transferFunds(Long amount){

        provideSystemServices();
    }
    public List<Account> getAllAccount(){
        return accountDAO.getAccounts();
    }

    public void provideSystemServices(){
        for(SystemService service:services){
            service.provideService();
        }
    }
}
