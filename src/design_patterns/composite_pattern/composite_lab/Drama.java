package design_patterns.composite_pattern.composite_lab;

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
        System.out.println(" ---- "+dramaDVD.getTitle());
    }
}
