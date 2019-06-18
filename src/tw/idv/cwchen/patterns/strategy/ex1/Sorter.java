package tw.idv.cwchen.patterns.strategy.ex1;

public class Sorter {
	
	private SortStrategy sortStrategy;
	
	public void sort() {
			sortStrategy.sort();
	}

	public void setSortStrategy(SortStrategy sortStrategy) {
			this.sortStrategy = sortStrategy;
	}
}
