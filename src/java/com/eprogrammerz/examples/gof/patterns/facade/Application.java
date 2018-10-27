package com.eprogrammerz.examples.gof.patterns.facade;

/**
 * Created by ${YogenRai} on 4/3/2016.
 */
public class Application {
    public static void main(String[] args) {
        CarFacade facade = new CarFacade();
        facade.createCar();
    }
}
