package design_patterns.command_pattern.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker class
 */
public class PowerButton {
    private List<Command> commands = new ArrayList<Command>();

    public void pressButton(Command command){
        commands.add(command);  //for undoing capability; optional in this case
        command.execute();
    }
}
