package com.eprogrammerz.examples.gof.patterns.composite.bookinventory;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class ComputerBookCategory implements Catalog {
    private Book computerBook;

    public ComputerBookCategory(Book computerBook) {
        this.computerBook = computerBook;
    }

    @Override
    public void print() {
        System.out.println(" --- Drama");
        System.out.println(" ---- Title: " + computerBook.getTitle());
        System.out.println(" ---- ISBN : " + computerBook.getIsbn());
    }
}
