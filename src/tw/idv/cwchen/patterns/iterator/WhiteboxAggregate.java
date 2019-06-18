package tw.idv.cwchen.patterns.iterator;

public class WhiteboxAggregate extends Aggregate {

	private Object objs[] = {"Monk Tang", "Monkey", "Pigsy", "Sandy", "Horse"};
	
	public Iterator createIterator() {
			return new ExtrinsicIterator(this);
	}
	
	public Object getElement(int index) {
			if(index < objs.length) {
					return objs[index];
			}else {
					return null;
			}
	}
	
	public int size() {
			return objs.length;
	}
}
