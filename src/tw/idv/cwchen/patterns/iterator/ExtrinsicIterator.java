package tw.idv.cwchen.patterns.iterator;

public class ExtrinsicIterator implements Iterator {
	
	private WhiteboxAggregate agg;
	
	private int index = 0;
	
	private int size = 0;
	
	public ExtrinsicIterator(WhiteboxAggregate agg) {
			this.agg = agg;
			size = agg.size();
			index = 0;
	}

	@Override
	public void first() {
			index = 0;
	}

	@Override
	public void next() {
			if(index < size) {
					index++;
			}
	}

	@Override
	public boolean isDone() {
			return (index >= size);
	}

	@Override
	public Object currentItem() {
			return agg.getElement(index);
	}

}
