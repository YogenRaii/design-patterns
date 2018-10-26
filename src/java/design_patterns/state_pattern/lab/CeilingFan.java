package design_patterns.state_pattern.lab;

/**
 * context
 */
public class CeilingFan {
    private FanState currentState;

    public CeilingFan() {
        currentState = new Off();
    }

    public void pullGreen() {
        setCurrentState(currentState.nextState());
        currentState.printState();

    }

    public void pullRed() {
        setCurrentState(currentState.previousState());
        currentState.printState();
    }

    public void setCurrentState(FanState currentState) {
        this.currentState = currentState;
    }
}
