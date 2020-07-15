package adrianromanski.head_first.command.remote.macro;

import adrianromanski.head_first.command.remote.Command;

import java.util.List;

public class MacroCommand implements Command {

    List<Command> commands;

    public MacroCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command: commands) {
            command.execute();
        }
    }
}
