package com.eprogrammerz.examples.gof.patterns.state.accountstate;

/**
 * Created by ${YogenRai} on 4/23/2016.
 */
public class Silver extends AccountState {
    @Override
    void computePoints(FFAccount account, int newMiles) {

        int numberOfFlights = account.getNumberOfFlights();
        account.setNumberOfFlights(++numberOfFlights);
        int numberOfMiles = newMiles + account.getNumberOfMiles();//
        account.setNumberOfMiles(numberOfMiles);

        if ((numberOfMiles > 75000) || (numberOfFlights > 75)) {
            account.setAccountState(new Gold());// = "gold";
        }
    }

    @Override
    public String toString() {
        return "Silver";
    }
}
