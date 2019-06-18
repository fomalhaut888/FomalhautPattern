package tw.idv.cwchen.patterns.observer2;

public class ConcreteObserver implements Observer {

	@Override
	public void update() {
			System.out.println("I am notified!");
	}

}
