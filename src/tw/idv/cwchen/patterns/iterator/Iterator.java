package tw.idv.cwchen.patterns.iterator;

public interface Iterator {
	
	public void first();
	
	public void next();
	
	public boolean isDone();
	
	public Object currentItem();
}
