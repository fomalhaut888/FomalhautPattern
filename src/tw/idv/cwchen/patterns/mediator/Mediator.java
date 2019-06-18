package tw.idv.cwchen.patterns.mediator;

public abstract class Mediator {

	public abstract void colleagueChanged(Colleague colleague);

	public static void main(String args[]) {
			ConcreteMediator mediator = new ConcreteMediator();
			mediator.createConcreteMediator();
			Colleague c1 = new Colleague1(mediator);
			Colleague c2 = new Colleague2(mediator);
			mediator.colleagueChanged(c1);
	}
}
