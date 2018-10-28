package com.eprogrammerz.examples.gof.patterns.composite.bookinventory;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class Drama implements Catalog {
    private DVD dramaDVD;

    public Drama(DVD dramaDVD) {
        this.dramaDVD = dramaDVD;
    }

    @Override
    public void print() {
        System.out.println(" --- Drama");
        System.out.println(" ---- " + dramaDVD.getTitle());
    }
}
