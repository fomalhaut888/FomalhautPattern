package tw.idv.cwchen.patterns.visitor;

public interface Visitor {
	
	public void visit(NodeA node);
	
	public void visit(NodeB node);
}
