package tw.idv.cwchen.patterns.observer;

import java.util.Enumeration;
import java.util.Vector;

public class ConcreteSubject implements Subject {
	
	private Vector<Observer> observersVector = new Vector<>();

	@Override
	public void attach(Observer observer) {
			observersVector.addElement(observer);
	}

	@Override
	public void detach(Observer observer) {
			observersVector.removeElement(observer);
	}

	@Override
	public void notifyObservers() {
			Enumeration<Observer> enumeration = observers();
			while(enumeration.hasMoreElements()) {
					enumeration.nextElement().update();
			}
	}
	
	@SuppressWarnings("unchecked")
	public Enumeration<Observer> observers() {
			return ((Vector<Observer>)observersVector.clone()).elements();
	}

}
