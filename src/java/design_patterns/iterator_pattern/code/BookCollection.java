package design_patterns.iterator_pattern.code;

/**
 * concrete aggregate
 */
public class BookCollection implements Container {
    private String[] book = {"Programming C++" , "Learn Java" ,"ANSI C" , "AngularJS"};
    @Override
    public Iterator getIterator() {
        return new BookIterator();
    }

    public String[] getBooks(){
        return book;
    }
}
