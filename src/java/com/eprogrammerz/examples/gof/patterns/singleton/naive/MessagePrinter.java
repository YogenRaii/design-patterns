package com.eprogrammerz.examples.gof.patterns.singleton.naive;

/**
 * @author Yogen Rai
 *
 * Naive Implementation
 */
public class MessagePrinter {
    private static MessagePrinter messagePrinter;

    private MessagePrinter() {
    }

    public static MessagePrinter getMessagePrinter() {
        if (messagePrinter == null) {
            messagePrinter = new MessagePrinter();
        }
        return messagePrinter;
    }

    public void printMessage(String message) {
        System.out.println("Naive Singleton MessagePrinter : " + message);
    }
}
