package design_patterns.composite_pattern.composite_pattern_hw;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class Link implements FileSystem {
    private String name;
    private String link;
    public Link(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void print(){
        System.out.println("--- link "+name+" to "+getLink());
    }

    @Override
    public int getSizeInBytes() {
        return 0;
    }
}
