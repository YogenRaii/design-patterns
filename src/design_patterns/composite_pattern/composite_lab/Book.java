package design_patterns.composite_pattern.composite_lab;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class Book {
    private String isbn;
    private String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
}
