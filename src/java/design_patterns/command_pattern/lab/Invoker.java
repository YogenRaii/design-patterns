package design_patterns.command_pattern.lab;

import design_patterns.command_pattern.lab.commands.Command;

/**
 * Created by ${YogenRai} on 4/17/2016.
 */
public class Invoker {
    private Command previousCommand;

    public void execute(Command command){
        previousCommand = command;
        command.execute();
    }

    public void undo(){
        previousCommand.undo();
    }

    public void redo(){
        previousCommand.redo();
    }
}
