package com.eprogrammerz.examples.gof.patterns.state.accountstate;

/**
 * Created by ${YogenRai} on 4/23/2016.
 */
public class Platinum extends AccountState {
    @Override
    void computePoints(FFAccount account, int newMiles) {

        int numberOfFlights = account.getNumberOfFlights();
        account.setNumberOfFlights(2 * numberOfFlights);
        int numberOfMiles = 3 * newMiles + account.getNumberOfMiles();//
        account.setNumberOfMiles(numberOfMiles);
    }

    @Override
    public String toString() {
        return "Platinum";
    }
}