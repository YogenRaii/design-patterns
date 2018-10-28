package com.eprogrammerz.examples.gof.patterns.state.accountstate;

/**
 * Created by ${YogenRai} on 4/23/2016.
 */
public abstract class AccountState {
    abstract void computePoints(FFAccount account, int newMiles);
}
