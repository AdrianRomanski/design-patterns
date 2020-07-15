package adrianromanski.head_first.command.remote.tv;

import adrianromanski.head_first.command.remote.Command;

public class TVOnCommand implements Command {

    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
