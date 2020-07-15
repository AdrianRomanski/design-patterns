package adrianromanski.head_first.command.remote;

public class NoCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Nothing here");
    }
}
