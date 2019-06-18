package tw.idv.cwchen.patterns.visitor;

public class VisitorA implements Visitor {

	@Override
	public void visit(NodeA nodeA) {
			System.out.println(nodeA.operationA());
	}

	@Override
	public void visit(NodeB nodeB) {
			System.out.println(nodeB.operationB());
	}

}
