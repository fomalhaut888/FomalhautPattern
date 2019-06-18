package tw.idv.cwchen.patterns.builder;

public class ConcreteBuilder extends Builder {
	
	private Product product = new Product();

	@Override
	public void buildPart1() {
			// TODO Auto-generated method stub
	}

	@Override
	public void buildPart2() {
			// TODO Auto-generated method stub
	}

	@Override
	public Product retrieveResult() {
			// TODO Auto-generated method stub
			return product;
	}

}
