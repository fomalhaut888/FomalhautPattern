package tw.idv.cwchen.patterns.command.ex1;

import tw.idv.cwchen.patterns.command.Command;

public class RewindCommand implements Command {
	
	private AudioPlayer myAudio;
	
	public RewindCommand(AudioPlayer a) {
			this.myAudio = a;
	}

	@Override
	public void execute() {
			myAudio.rewind();
	}

}
