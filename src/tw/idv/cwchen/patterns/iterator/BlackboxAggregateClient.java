package tw.idv.cwchen.patterns.iterator;

public class BlackboxAggregateClient {
	
	private Iterator it;
	
	private Aggregate agg = new BlackboxAggregate();
	
	public void operation() {
			it = agg.createIterator();
			while(!it.isDone()) {
					System.out.println(it.currentItem().toString());
					it.next();
			}
	}

	public static void main(String[] args) {
			BlackboxAggregateClient client = new BlackboxAggregateClient();
			client.operation();
	}

}
