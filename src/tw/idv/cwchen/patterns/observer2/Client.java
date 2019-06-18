package tw.idv.cwchen.patterns.observer2;

public class Client {
	
	private static ConcreteSubject subject;
	private static Observer observer;
	public static void main(String args[]) {
			subject = new ConcreteSubject();
			observer = new ConcreteObserver();
			subject.attach(observer);
			subject.change("new state");
	}
}
