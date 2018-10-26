package design_patterns.composite_pattern.composite_lab;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class Action implements Catalog {
    private DVD actionDVD;

    public Action(DVD actionDVD) {
        this.actionDVD = actionDVD;
    }

    @Override
    public void print() {
        System.out.println(" --- Drama");
        System.out.println(" ---- "+actionDVD.getTitle());
    }
}
