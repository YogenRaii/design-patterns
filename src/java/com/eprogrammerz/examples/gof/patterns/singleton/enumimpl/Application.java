package com.eprogrammerz.examples.gof.patterns.singleton.enumimpl;


/**
 * @author Yogen Rai
 */
public class Application {
    public static void main(String[] args) {
        MessagePrinter printer = MessagePrinter.PRINTER;
        printer.printMessage("This is antipattern, and I know you won't use it!");
    }
}
