package tw.idv.cwchen.patterns.interpreter;

import java.util.HashMap;

public class Context {
	
	private HashMap<Variable, Boolean> map = new HashMap<>();
	
	public void assign(Variable variable, boolean value) {
			map.put(variable, new Boolean(value));
	}

	public boolean lookup(Variable variable) throws IllegalArgumentException{
			Boolean value = map.get(variable);
			if(value == null) {
					throw new IllegalArgumentException();
			}
			return value.booleanValue();
	}

}
