package com.eprogrammerz.examples.gof.patterns.composite_pattern.composite_lab;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class DVDCategory implements Catalog{
    private Collection<Catalog> dvdCategories = new ArrayList<Catalog>();

    public void add(Catalog dvdCategory){
        dvdCategories.add(dvdCategory);
    }
    @Override
    public void print() {
        System.out.println(" -- DVD Category");

        for (Catalog catalog: dvdCategories){
            catalog.print();
        }
    }
}
