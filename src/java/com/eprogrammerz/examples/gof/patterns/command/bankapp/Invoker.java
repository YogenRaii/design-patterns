package com.eprogrammerz.examples.gof.patterns.command.bankapp;

import com.eprogrammerz.examples.gof.patterns.command.bankapp.commands.Command;

/**
 * Created by ${YogenRai} on 4/17/2016.
 */
public class Invoker {
    private Command previousCommand;

    public void execute(Command command) {
        previousCommand = command;
        command.execute();
    }

    public void undo() {
        previousCommand.undo();
    }

    public void redo() {
        previousCommand.redo();
    }
}
