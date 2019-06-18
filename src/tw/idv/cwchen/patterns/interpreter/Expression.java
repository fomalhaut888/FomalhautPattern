package tw.idv.cwchen.patterns.interpreter;

public abstract class Expression {

	public abstract boolean interpret(Context ctx);
	
	@Override
	public abstract boolean equals(Object o);
	
	@Override
	public abstract int hashCode();
	
	@Override
	public abstract String toString();
}
