package com.eprogrammerz.examples.gof.patterns.singleton.naive;

/**
 * @author Yogen Rai
 */
public class Application {
    public static void main(String[] args) {
        MessagePrinter printer = MessagePrinter.getMessagePrinter();
        printer.printMessage("This is antipattern, and I know you won't use it!");
    }
}
