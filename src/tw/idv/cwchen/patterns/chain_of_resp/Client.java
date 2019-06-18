package tw.idv.cwchen.patterns.chain_of_resp;

public class Client {
	
	private static Handler handler1, handler2;

	public static void main(String[] args) {
			handler1 = new ConcreteHandler();
			handler2 = new ConcreteHandler();
			handler1.setSuccessor(handler2);
			handler1.handleRequest();
	}

}
