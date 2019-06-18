package tw.idv.cwchen.patterns.memento;

public class WhiteboxCaretaker {
	
	private WhiteboxMemento memento;
	
	public WhiteboxMemento retrieveMemento() {
			return memento;
	}
	
	public void saveMemento(WhiteboxMemento memento) {
			this.memento = memento;
	}
}
