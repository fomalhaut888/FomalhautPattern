package tw.idv.cwchen.patterns.command.ex1;

import tw.idv.cwchen.patterns.command.Command;

public class Julia {
	
	private static Keypad keypad;
	
	private static AudioPlayer myAudio = new AudioPlayer();
	
	public static void test1() {
			Command play = new PlayCommand(myAudio);
			Command stop = new StopCommand(myAudio);
			Command rewind = new RewindCommand(myAudio);
			keypad = new Keypad(play, stop, rewind);
			keypad.play();
			keypad.stop();
			keypad.rewind();
			keypad.stop();
			keypad.play();
			keypad.stop();
	}
	
	public static void test2() {
			Command play = new PlayCommand(myAudio);
			Command stop = new StopCommand(myAudio);
			Command rewind = new RewindCommand(myAudio);
			MacroCommand macro = new MacroAudioCommand();
			macro.add(play);
			macro.add(stop);
			macro.add(rewind);
			macro.add(stop);
			macro.add(play);
			macro.add(stop);
			macro.execute();
	}
	
	public static void main(String args[]) {
			test1();
			test2();
	}
}
