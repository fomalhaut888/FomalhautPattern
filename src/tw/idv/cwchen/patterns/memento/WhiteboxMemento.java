package tw.idv.cwchen.patterns.memento;

public class WhiteboxMemento {
	
	private String state;
	
	public WhiteboxMemento(String state) {
			this.state = state;
	}

	public String getState() {
			return state;
	}

	public void setState(String state) {
			this.state = state;
	}
}
