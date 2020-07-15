package adrianromanski.head_first.command.remote.light;

import adrianromanski.head_first.command.remote.Command;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
       this.light.off();
    }
}
