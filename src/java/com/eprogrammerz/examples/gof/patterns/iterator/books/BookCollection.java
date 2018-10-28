package com.eprogrammerz.examples.gof.patterns.iterator.books;

/**
 * concrete aggregate
 */
public class BookCollection implements Container {
    private String[] book = {"Programming C++", "Learn Java", "ANSI C", "AngularJS"};

    @Override
    public Iterator getIterator() {
        return new BookIterator();
    }

    public String[] getBooks() {
        return book;
    }
}
