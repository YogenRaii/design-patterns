package com.eprogrammerz.examples.gof.patterns.strategy.drawer;

/**
 * It is implementation of abstract Strategy
 * i.e. it is concrete strategy
 */
public class DrawRectangle implements DrawingStrategy {
    public void draw() {
        System.out.println("Rectangle drawn");
    }
}