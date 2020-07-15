package adrianromanski.head_first.command.remote.light;

import adrianromanski.head_first.command.remote.Command;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }
}
