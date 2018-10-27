package com.eprogrammerz.examples.gof.patterns.command_pattern.example;

/**
 * ConcreteCommand - The Command for locking the phone
 */
public class LockPhoneCommand implements Command {
    private MobilePhone control;

    public LockPhoneCommand(MobilePhone control) {
        this.control = control;
    }

    @Override
    public void execute() {
        control.lockPhone();
    }
}
