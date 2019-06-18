package tw.idv.cwchen.patterns.mediator;

public class Colleague1 extends Colleague {

	public Colleague1(Mediator mediator) {
			super(mediator);
	}

	@Override
	public void action() {
			System.out.println("This is an action from Colleague 1");
	}

}
