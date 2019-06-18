package tw.idv.cwchen.patterns.command.ex1;

import java.util.Vector;

import tw.idv.cwchen.patterns.command.Command;

public class MacroAudioCommand implements MacroCommand {
	
	private Vector<Command> commandList = new Vector<>();

	@Override
	public void execute() {
			Command nextCommand;
			System.out.println("Automated playback of stored commands...");
			for(int i = 0; i < commandList.size(); i++) {
					nextCommand = commandList.elementAt(i);
					nextCommand.execute();
			}
			System.out.println("Finished automated playback of stored commands.");
	}

	@Override
	public void remove(Command toRemove) {
			commandList.removeElement(toRemove);
	}
	
	public void remove(int index) {
			commandList.remove(index);
	}

	@Override
	public void add(Command toAdd) {
			commandList.addElement(toAdd);
	}

}
