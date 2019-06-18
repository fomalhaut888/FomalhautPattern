package tw.idv.cwchen.patterns.template_method;

public class ConcreteClass extends AbstractClass {

	@Override
	protected void doOperation1() {
			System.out.println("doOperation1");
	}

	@Override
	protected void doOperation2() {
			//避免呼叫抽象操作或頂層具體方法
			//doOperation3();
			System.out.println("doOperation2");
	}

}
