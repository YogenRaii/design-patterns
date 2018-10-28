package com.eprogrammerz.examples.gof.patterns.composite.drawio;

/**
 * Client
 */
public class Application {
    public static void main(String[] args) {
        //creates leaf objects
        Graphic circle = new Circle();
        Graphic rectangleA = new Rectangle();
        Graphic rectangleB = new Rectangle();

        //Initialize composite graphic i.e. picture
        Picture picture = new Picture();
        picture.add(circle);
        picture.add(rectangleA);
        picture.add(rectangleB);
        //prints complete picture
        picture.draw();

        System.out.println("Remove one leaf --> Rectangle object");
        //removes a graphic from picture
        picture.remove(rectangleA);
        //prints new picture
        picture.draw();
    }
}
