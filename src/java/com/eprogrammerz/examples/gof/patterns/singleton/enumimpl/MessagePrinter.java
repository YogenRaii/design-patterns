package com.eprogrammerz.examples.gof.patterns.singleton.enumimpl;

/**
 * @author Yogen Rai
 *
 * Implementation with Enum; which is safer and better
 */
public enum MessagePrinter {
    PRINTER;

    public void printMessage(String message) {
        System.out.println("Enum Singleton MessagePrinter : " + message);
    }
}
