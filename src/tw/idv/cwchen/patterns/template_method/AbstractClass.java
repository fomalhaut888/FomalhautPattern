package tw.idv.cwchen.patterns.template_method;

public abstract class AbstractClass {
	
	public void templateMethod() {
			doOperation1();
			doOperation2();
			doOperation3();
	}
	
	protected abstract void doOperation1();
	
	protected abstract void doOperation2();
	
	private final void doOperation3() {
			System.out.println("doOperation3");
	}
}
