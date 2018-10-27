package com.eprogrammerz.examples.gof.patterns.command.bankapp.commands;

/**
 * Created by ${YogenRai} on 4/17/2016.
 */
public interface Command {
    void execute();
    void undo();
    void redo();
}
