package com.eprogrammerz.examples.gof.patterns.singleton.locking;

/**
 * @author Yogen Rai
 *
 * Double locking implementation
 */
public class MessagePrinter {
    private static final Object LOCK = new Object();
    private static volatile MessagePrinter messagePrinter;

    private MessagePrinter() {
    }

    public static MessagePrinter getMessagePrinter() {
        if (messagePrinter == null) {
            synchronized (LOCK) {
                // need to make sure if other thread has already instantiated the object
                if (messagePrinter == null) {
                    messagePrinter = new MessagePrinter();
                }
            }
        }
        return messagePrinter;
    }

    public void printMessage(String message) {
        System.out.println("Double Locked Singleton MessagePrinter : " + message);
    }
}
