package design_patterns.state_pattern.lab;

/**
 * State
 */
public interface FanState {
    void printState();
    FanState nextState();
    FanState previousState();
}
