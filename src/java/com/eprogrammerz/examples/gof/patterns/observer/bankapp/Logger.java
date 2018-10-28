package com.eprogrammerz.examples.gof.patterns.observer.bankapp;

/**
 * Created by ${YogenRai} on 3/26/2016.
 */
public class Logger implements SystemService {
    public void provideService() {
        System.out.println("Account change is logged.");
    }
}
