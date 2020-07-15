package adrianromanski.head_first.command.remote;

// This is the invoker
public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
 
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
 
		for (int i = 0; i < 7; i++) {
			onCommands[i] = NoCommand::new;
			offCommands[i] = NoCommand::new;
		}
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
 
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
  
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			sb.append("[slot ")
					.append(i)
					.append("] ")
					.append(onCommands[i].getClass().getName())
					.append("    ")
					.append(offCommands[i].getClass().getName()).append("\n");
		}
		return sb.toString();
	}

}
