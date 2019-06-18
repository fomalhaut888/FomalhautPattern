package tw.idv.cwchen.patterns.memento;

public class BlackboxOriginator {
	
	private String state;
	
	public BlackboxMementoIF createMemento() {
			return new BlackboxMemento(this.state);
	}
	
	public void restoreMemento(BlackboxMementoIF memento) {
			BlackboxMemento aMemento = (BlackboxMemento)memento;
			this.setState(aMemento.getState());
	}

	public String getState() {
			return state;
	}

	public void setState(String state) {
			this.state = state;
			System.out.println("state = " + state);
	}
	
	protected class BlackboxMemento implements BlackboxMementoIF{
			
			private String savedState;
			
			private BlackboxMemento(String someState) {
					savedState = someState;
			}

			public String getState() {
					return savedState;
			}

			public void setSavedState(String someState) {
					savedState = someState;
			}
	}
}
