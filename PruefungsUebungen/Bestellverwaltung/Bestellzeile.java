package Bestellverwaltung;

public class Bestellzeile {
	private String name;
	private int menge;
	private int preis;
	public String getName() {
		return name;
	}
	public int getMenge() {
		return menge;
	}
	public int getPreis() {
		return preis;
	}
	public Bestellzeile(String name, int menge, int preis) {
		super();
		this.name = name;
		this.menge = menge;
		this.preis = preis;
	}
	
	public double getKosten()
	{
		double kosten = menge * preis; 
		return kosten;
	}
}
