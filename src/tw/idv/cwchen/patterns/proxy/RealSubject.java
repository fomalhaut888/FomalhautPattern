package tw.idv.cwchen.patterns.proxy;

public class RealSubject extends Subject {

	@Override
	public void request() {
			System.out.println("From real subject.");
	}

}
