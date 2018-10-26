package design_patterns.chain_of_responsibility.example;

/**
 * Handler
 */
public abstract class OrderReceiver {
    protected OrderReceiver successor;
    protected Order order;

    public void setSuccessor(OrderReceiver successor) {
        this.successor = successor;
    }

    abstract public void handleOrder(Order request);
}
