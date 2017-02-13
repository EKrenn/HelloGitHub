package oop;

public abstract class  Einwohner {
	private int einkommen;
	private String bundesland;
	
	public Einwohner(int einkommen, String bundesland)
	{
		this.einkommen = einkommen;
		this.bundesland = bundesland;
	}

	public int getEinkommen() {
		return einkommen;
	}

	public void setEinkommen(int einkommen) {
		this.einkommen = einkommen;
	}

	public String getBundesland() {
		return bundesland;
	}

	public void setBundesland(String bundesland) {
		this.bundesland = bundesland;
	}
	
	public abstract double steuer();

}
