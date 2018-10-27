package com.eprogrammerz.examples.gof.patterns.strategy_pattern.hw;

/**
 * it represents a client for this example.
 */
public class Application {

    public static void main(String[] args) {
        DrawingCanvas canvas = new DrawingCanvas();
        //drawing a line
        canvas.setStrategy(new DrawLine());
        canvas.drawGeometricShape();
        //drawing a circle
        canvas.setStrategy(new DrawCircle());
        canvas.drawGeometricShape();
        //drawing a rectangle
        canvas.setStrategy(new DrawRectangle());
        canvas.drawGeometricShape();
    }
}