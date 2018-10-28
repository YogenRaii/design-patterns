package com.eprogrammerz.examples.gof.patterns.composite.bookinventory;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class ProductCatalog implements Catalog {
    private Collection<Catalog> catalogs = new ArrayList<Catalog>();

    public void addCatalog(Catalog catalog) {
        catalogs.add(catalog);
    }

    @Override
    public void print() {
        System.out.println(" - Product Catalog");
        for (Catalog catalog : catalogs) {
            catalog.print();
        }
    }
}
