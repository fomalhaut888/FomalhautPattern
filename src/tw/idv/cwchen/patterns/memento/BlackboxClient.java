package tw.idv.cwchen.patterns.memento;

public class BlackboxClient {
	
	private static BlackboxOriginator originator = new BlackboxOriginator();
	private static BlackboxCaretaker caretaker = new BlackboxCaretaker();
	public static void main(String args[]) {
			originator.setState("On");
			caretaker.saveMemento(originator.createMemento());
			originator.setState("Off");
			originator.restoreMemento(caretaker.retrieveMemento());
	}
}
