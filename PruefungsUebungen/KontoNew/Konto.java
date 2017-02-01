package KontoNew;

public class Konto {
	
	protected String inhaber;
	protected double kontostand;
	
	public Konto(String inhaber)
	{
		this.inhaber = inhaber;
		kontostand = 0;
	}
	
	public void einzahlen(double wert)
	{
		kontostand = kontostand + wert;
		System.out.println(inhaber + " hat " + kontostand + " zur Verfügung");
	}
	
	public void auszahlen(double wert)
	{
		kontostand = kontostand - wert;
		System.out.println("Bei " + inhaber + " ist nun der Kontostand: " + kontostand);
	}
	
}
