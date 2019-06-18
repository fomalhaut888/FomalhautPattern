package tw.idv.cwchen.patterns.builder;

public abstract class Builder {
	
	public abstract void buildPart1();
	
	public abstract void buildPart2();
	
	public abstract Product retrieveResult();
}
