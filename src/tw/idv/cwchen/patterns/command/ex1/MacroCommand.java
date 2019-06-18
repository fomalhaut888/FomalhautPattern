package tw.idv.cwchen.patterns.command.ex1;

import tw.idv.cwchen.patterns.command.Command;

public interface MacroCommand extends Command {
	
	public void remove(Command toRemove);
	
	public void add(Command toAdd);
}
