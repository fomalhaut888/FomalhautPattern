package tw.idv.cwchen.patterns.memento;

public class WhiteboxClient {
	
	private static WhiteboxOriginator originator = new WhiteboxOriginator();
	private static WhiteboxCaretaker caretaker = new WhiteboxCaretaker();
	public static void main(String args[]) {
			originator.setState("On");
			caretaker.saveMemento(originator.createMemento());
			originator.setState("Off");
			originator.restoreMemento(caretaker.retrieveMemento());
	}
}
