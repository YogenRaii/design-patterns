package design_patterns.state_pattern.lab;

/**
 * Created by ${YogenRai} on 4/24/2016.
 */
public class MediumSpeed implements FanState {
    @Override
    public void printState() {
        System.out.println(" medium speed ");
    }

    @Override
    public FanState nextState() {
        return new HighSpeed();
    }

    @Override
    public FanState previousState() {
        return new LowSpeed();
    }
}
