package oop;

public class Kuenstler extends Einwohner{

	private int einmalerloese;
	
	public Kuenstler(int einkommen, String bundesland, int einmalerloese) {
		super(einkommen, bundesland);
		this.einmalerloese = einmalerloese;
	}

	@Override
	public double steuer() {
		double steuer = (einmalerloese*0.02) + (getEinkommen() * 0.25);
		return steuer;
	}
	
	
}
