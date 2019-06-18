package tw.idv.cwchen.patterns.memento;

public class BlackboxCaretaker {
	
	private BlackboxMementoIF memento;
	
	public BlackboxMementoIF retrieveMemento() {
			return memento;
	}
	
	public void saveMemento(BlackboxMementoIF memento) {
			this.memento = memento;
	}
}
