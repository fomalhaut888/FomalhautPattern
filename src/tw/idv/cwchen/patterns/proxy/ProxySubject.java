package tw.idv.cwchen.patterns.proxy;

public class ProxySubject extends Subject {
	
	private RealSubject realSubject;
	
	public ProxySubject() {
		
	}

	@Override
	public void request() {
			preRequest();
			
			if(realSubject == null) {
					realSubject = new RealSubject();
			}
			realSubject.request();
			
			postRequest();
	}
	
	private void preRequest() {
			System.out.println("preRequest");
	}

	private void postRequest() {
			System.out.println("postRequest");
	}
}
