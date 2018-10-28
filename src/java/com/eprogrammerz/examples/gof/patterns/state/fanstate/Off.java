package com.eprogrammerz.examples.gof.patterns.state.fanstate;

/**
 * concrete state
 */
public class Off implements FanState {
    @Override
    public void printState() {
        System.out.println(" fan is off ");
    }

    @Override
    public FanState nextState() {
        return new LowSpeed();
    }

    @Override
    public FanState previousState() {
        return new HighSpeed();
    }
}
