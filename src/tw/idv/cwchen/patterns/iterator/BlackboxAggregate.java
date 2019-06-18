package tw.idv.cwchen.patterns.iterator;

public class BlackboxAggregate extends Aggregate {
	
	private Object objs[] = {"Monk Tang", "Monkey", "Pigsy", "Sandy", "Horse"};

	@Override
	public Iterator createIterator() {
			return new IntrinsicIterator();
	}

	private class IntrinsicIterator implements Iterator{
		
		private int currentIndex = 0;

		@Override
		public void first() {
				currentIndex = 0;
		}

		@Override
		public void next() {
				if(currentIndex < objs.length) {
						currentIndex++;
				}
		}

		@Override
		public boolean isDone() {
				return (currentIndex == objs.length);
		}

		@Override
		public Object currentItem() {
				return objs[currentIndex];
		}
			
	}
}
