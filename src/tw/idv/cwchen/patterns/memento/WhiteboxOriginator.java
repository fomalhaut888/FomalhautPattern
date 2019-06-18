package tw.idv.cwchen.patterns.memento;

public class WhiteboxOriginator {
	
	private String state;
	
	public WhiteboxMemento createMemento() {
			return new WhiteboxMemento(state);
	}
	
	public void restoreMemento(WhiteboxMemento memento) {
			this.state = memento.getState();
	}

	public String getState() {
			return state;
	}

	public void setState(String state) {
			this.state = state;
			System.out.println("Current state = " + this.state);
	}
	
	
}
