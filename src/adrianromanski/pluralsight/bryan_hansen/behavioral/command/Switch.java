package adrianromanski.pluralsight.bryan_hansen.behavioral.command;

//invoker
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
