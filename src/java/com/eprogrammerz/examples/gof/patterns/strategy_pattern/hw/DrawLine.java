package com.eprogrammerz.examples.gof.patterns.strategy_pattern.hw;

/**
 * It is implementation of abstract Strategy
 * i.e. it is concrete strategy
 */
public class DrawLine implements DrawingStrategy {
    public void draw() {
        System.out.println("Line Drawn.");
    }

}