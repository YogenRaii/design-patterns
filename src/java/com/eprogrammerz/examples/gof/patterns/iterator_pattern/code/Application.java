package com.eprogrammerz.examples.gof.patterns.iterator_pattern.code;

/**
 * client
 */
public class Application {
    public static void main(String[] args) {
        Container collection = new BookCollection();

        for (Iterator i = collection.getIterator();i.hasNext();){
            String book = (String)i.next();
            System.out.println(book);
        }
    }
}
