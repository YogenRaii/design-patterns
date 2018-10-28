package com.eprogrammerz.examples.gof.patterns.state.accountstate;

/**
 * Created by ${YogenRai} on 4/23/2016.
 */
public class Gold extends AccountState {
    @Override
    void computePoints(FFAccount account, int newMiles) {

        int numberOfFlights = account.getNumberOfFlights();
        account.setNumberOfFlights(++numberOfFlights);
        int numberOfMiles = 2 * newMiles + account.getNumberOfMiles();//
        account.setNumberOfMiles(numberOfMiles);

        if ((numberOfMiles > 150000) || (numberOfFlights > 145)) {
            account.setAccountState(new Platinum());// = "gold";
        }
    }

    @Override
    public String toString() {
        return "Gold";
    }
}
