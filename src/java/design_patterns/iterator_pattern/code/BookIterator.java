package design_patterns.iterator_pattern.code;

/**
 * Concrete iterator
 */
public class BookIterator implements Iterator {
    private BookCollection collection = new BookCollection();
    private String[] books = collection.getBooks();
    private int index =0 ;

    @Override
    public boolean hasNext() {
        return index < books.length;
    }

    @Override
    public Object next() {
        return this.hasNext() ? books[index++]:null;
    }
}
