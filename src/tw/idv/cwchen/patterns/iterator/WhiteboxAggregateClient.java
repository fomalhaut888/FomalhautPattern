package tw.idv.cwchen.patterns.iterator;

public class WhiteboxAggregateClient {
	
	private Iterator it;
	
	private Aggregate agg = new WhiteboxAggregate();
	
	public void operation() {
			it = agg.createIterator();
			while(!it.isDone()) {
					System.out.println(it.currentItem().toString());
					it.next();
			}
	}

	public static void main(String[] args) {
			WhiteboxAggregateClient client = new WhiteboxAggregateClient();
			client.operation();
	}

}
