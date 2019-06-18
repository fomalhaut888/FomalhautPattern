package tw.idv.cwchen.patterns.observer2;

import java.util.Enumeration;
import java.util.Vector;

public abstract class Subject {
	
	private Vector<Observer> observersVector = new Vector<>();
	
	public void attach(Observer observer) {
			observersVector.addElement(observer);
			System.out.println("Attached an observer.");
	}
	
	public void detach(Observer observer) {
			observersVector.removeElement(observer);
	}
	
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
