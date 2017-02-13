package Bestellverwaltung;

public class Bestellung {

	private Bestellzeile[] zeilen;
	private String nummer;
	public Bestellung(Bestellzeile[] zeilen, String nummer) {
		super();
		this.zeilen = zeilen;
		this.nummer = nummer;
	}
	public Bestellzeile[] getZeilen() {
		return zeilen;
	}
	public String getNummer() {
		return nummer;
	}
	
	public void printBestellung()
	{
		for (int i = 0; i < zeilen.length; i++) 
		{
			Bestellzeile row = zeilen[i];
			
			System.out.println("Zeile " + i + row.getName() +  " - Kosten: " + row.getKosten());
		}
	}
	public double getKosten(int personen)
	{
		double kosten = 0;
		
		for (int i = 0; i < zeilen.length; i++) 
		{
			Bestellzeile row = zeilen[i];
			kosten = kosten + row.getKosten();
			
		}
		
		return kosten;
	}
	
}
