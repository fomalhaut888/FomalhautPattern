package tw.idv.cwchen.patterns.command.ex1;

import tw.idv.cwchen.patterns.command.Command;

public class StopCommand implements Command {
	
	private AudioPlayer myAudio;
	
	public StopCommand(AudioPlayer a) {
			this.myAudio = a;
	}

	@Override
	public void execute() {
			myAudio.stop();
	}

}
