package tw.idv.cwchen.patterns.command.ex1;

import tw.idv.cwchen.patterns.command.Command;

public class PlayCommand implements Command {
	
	private AudioPlayer myAudio;
	
	public PlayCommand(AudioPlayer a) {
			this.myAudio = a;
	}

	@Override
	public void execute() {
			myAudio.play();
	}

}
