package design_patterns.command_pattern.example;

/**
 * ConcreteCommand - The Command for unlocking the phone
 */
public class UnlockPhoneCommand implements Command {
    private MobilePhone control;

    public UnlockPhoneCommand(MobilePhone control) {
        this.control = control;
    }

    @Override
    public void execute() {
        control.unlockPhone();
    }
}
