package design_patterns.composite_pattern.composite_lab;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class BookCategory implements Catalog{
    private Collection<Catalog> bookCategories = new ArrayList();

    public void add(Catalog bookCategory){
        bookCategories.add(bookCategory);
    }
    @Override
    public void print() {
        System.out.println(" -- Book Category");

        for (Catalog bookCategory:bookCategories){
            bookCategory.print();
        }
    }
}
