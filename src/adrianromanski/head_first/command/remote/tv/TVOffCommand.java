package adrianromanski.head_first.command.remote.tv;

import adrianromanski.head_first.command.remote.Command;

public class TVOffCommand implements Command {

    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
