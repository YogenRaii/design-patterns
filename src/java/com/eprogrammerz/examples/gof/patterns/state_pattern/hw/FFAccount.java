package com.eprogrammerz.examples.gof.patterns.state_pattern.hw;

/**
 * Created by ${YogenRai} on 4/23/2016.
 */
public class FFAccount {
    private String accountNumber;
    private int numberOfMiles;
    private int numberOfFlights;

    private AccountState accountState;

    public FFAccount(String aNumber) {
        accountNumber = aNumber;
        setAccountState(new Silver());
    }

    public void addFlight(int newMiles) {
        accountState.computePoints(this,newMiles);
    }

    public int getNumberOfMiles() {
        return numberOfMiles;
    }

    public int getNumberOfFlights() {
        return numberOfFlights;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setNumberOfMiles(int numberOfMiles) {
        this.numberOfMiles = numberOfMiles;
    }

    public void setNumberOfFlights(int numberOfFlights) {
        this.numberOfFlights = numberOfFlights;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public AccountState getAccountState() {
        return accountState;
    }
}
