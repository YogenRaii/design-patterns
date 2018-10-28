package com.eprogrammerz.examples.gof.patterns.state.fanstate;

/**
 * State
 */
public interface FanState {
    void printState();

    FanState nextState();

    FanState previousState();
}
