package com.eprogrammerz.examples.gof.patterns.strategy_pattern.hw;

/**
 * Context
 */
public class DrawingCanvas {
    private DrawingStrategy strategy;
    public void drawGeometricShape(){
        strategy.draw();
    }
    public void setStrategy(DrawingStrategy strategy){
        this.strategy = strategy;
    }
}
