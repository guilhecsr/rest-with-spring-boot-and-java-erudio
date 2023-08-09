package br.com.erudio;

public class Greeting {
	
	private final long id;
	private final String cont;
	
	public Greeting(long id, String cont) {
		super();
		this.id = id;
		this.cont = cont;
	}

	public long getId() {
		return id;
	}

	public String getCont() {
		return cont;
	}
}
