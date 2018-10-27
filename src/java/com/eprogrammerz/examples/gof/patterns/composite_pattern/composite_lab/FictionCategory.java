package com.eprogrammerz.examples.gof.patterns.composite_pattern.composite_lab;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class FictionCategory implements Catalog {
    private Book fictionBook;

    public FictionCategory(Book fictionBook) {
        this.fictionBook = fictionBook;
    }

    @Override
    public void print() {
        System.out.println(" --- Drama");
        System.out.println(" ---- Title: "+fictionBook.getTitle());
        System.out.println(" ---- ISBN : "+fictionBook.getIsbn());
    }
}
