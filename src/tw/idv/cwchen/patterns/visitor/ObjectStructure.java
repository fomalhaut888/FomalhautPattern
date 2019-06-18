package tw.idv.cwchen.patterns.visitor;

import java.util.Enumeration;
import java.util.Vector;

public class ObjectStructure {
	
	private Vector<Object> nodes;
	private Node node;
	
	public ObjectStructure() {
			nodes = new Vector<>();
	}
	
	public void action(Visitor visitor) {
			for(Enumeration<Object> e = nodes.elements(); e.hasMoreElements();) {
					node = (Node)e.nextElement();
					node.accept(visitor);
			}
	}
	
	public void add(Node node) {
			nodes.addElement(node);
	}
}
