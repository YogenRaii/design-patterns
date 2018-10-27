package com.eprogrammerz.examples.gof.patterns.state_pattern.lab;

/**
 * Created by ${YogenRai} on 4/24/2016.
 */
public class HighSpeed implements FanState {
    @Override
    public FanState nextState() {
        return new Off();
    }

    @Override
    public FanState previousState() {
        return new MediumSpeed();
    }

    @Override
    public void printState(){
        System.out.println(" high speed ");
    }
}
