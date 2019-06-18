package tw.idv.cwchen.patterns.strategy;

public class Context {
	
	private Strategy strategy;
	
	public void doWithStrategyYouSelected() {//do with a strategy you selected
			strategy.doWithStrategy();
	}

	public void setStrategy(Strategy strategy) {//set your strategy
			this.strategy = strategy;
	}
}
