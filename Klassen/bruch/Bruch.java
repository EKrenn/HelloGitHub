package bruch;

public class Bruch {
	
	int nenner;
	int zaehler; 
	public static int anzahlObjekte;
	
	public Bruch(int zaehler, int nenner)
	{
		this.nenner = nenner;
		this.zaehler = zaehler; 
		anzahlObjekte++;
	}
	
	public int getNenner()
	{
		return nenner; 
	}
	public int getZaehler()
	{
		return zaehler;
	}
	
	public double toDecimal()
	{
		//konvertiert den Zähler in einen Double --> (double)
		double wert = (double)zaehler / nenner; 
		// Oder double wert = zaehler * 1.0 / nenner; 
		//System.out.println("toDecimal: " + wert);
		return wert;
	}
	public void print()
	{
		System.out.println("Methode print() " + zaehler + " / " + nenner);
	}
	
	public Bruch multiplicate(Bruch b2)
	{
		//Berechnung OK, lange Methode
		int nenner = this.nenner * b2.nenner;
		int zaehler = this.zaehler * b2.zaehler;		
		b2 = new Bruch(zaehler, nenner);
		return b2;
		
		// Kurze Form
		//return new Bruch(b2.nenner * b2.nenner, b2.zaehler * b2.zaehler);
	}
	public Bruch multiplicate(Bruch b2, Bruch b3)
	{
		//Berechnung OK, lange Methode
		int nenner = this.nenner * b2.nenner * b3.nenner;
		int zaehler = this.zaehler * b2.zaehler * b3.zaehler;		
		return new Bruch(zaehler, nenner);
				
				// Kurze Form
		//return new Bruch(this.nenner * b2.nenner * b3.nenner, this.zaehler * b2.zaehler * b3.zaehler);
	}
	public static void printOutNice()
	{
		System.out.println();
	}
	

}
