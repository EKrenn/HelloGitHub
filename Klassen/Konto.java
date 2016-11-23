
public class Konto {

	private String kontoinhaber;
	private double kontostand;
	public Konto (String inhaber)
	{
		this.kontoinhaber = inhaber;
		kontostand = 75;
	}
	
	public void setInhaber(String inhaber)
	{
		/*
		 * Meine Variante
		 * Konto konto = new Konto();
		konto.kontoinhaber = inhaber;
		konto.konstostand = 0.0;*/
		this.kontoinhaber = inhaber;
		kontostand = 0.0;
	}
	public void aufbuchen(double bebuchterWert)
	{
		/*
		 * Meine Variante
		Konto konto = new Konto();
		double neuerWert = konto.konstostand + bebuchterWert;
		System.out.println(neuerWert);
		*/
		
		/*
		if(kontoinhaber == null || kontoinhaber.isEmpty())
		{
			System.out.println("Kontoinhaber muss gesetzt sein");
			return;
		}
		if(bebuchterWert > 0)
		{
			this.kontostand = kontostand + bebuchterWert;
		}
		else
		{
			System.out.println("Negativer Wert kann nicht bebucht werden");
		}
		*/
		if(!pruefen(bebuchterWert))
		{
			return;
		}
		else
		{
			this.kontostand = kontostand + bebuchterWert;
		}
		
		//System.out.println("bebucht: " + this.kontostand);
	}
	public boolean abbuchen(double abgebuchterWert)
	{
		/*
		 * Meine Variante
		 * Konto konto = new Konto();
		
		double neuerWert = konto.konstostand - abgebuchterWert;
		System.out.println(neuerWert);
		if (neuerWert < 0)
		{
			System.out.println("Kontostand unterschritten - Geht leider nicht!");
		}
		 */
		
		/*if(kontoinhaber == null || kontoinhaber.isEmpty())
		{
			System.out.println("Kontoinhaber muss gesetzt sein");
			return false;
		}
		this.kontostand = kontostand - abgebuchterWert;
		if (kontostand >= 0)
		{
			System.out.println("Verfügbarer Kontostand: " + kontostand);
		}
		else if (kontostand < 0)
		{
			System.out.println("Kontostand unterschritten - Geht leider nicht!");
			return false;
		}
		*/
		
		// nach erstellen der Methode pruefen
		if(!pruefen(abgebuchterWert))
		{
			return false;
		}
		return true;
	}
	public void print()
	{
		System.out.println("Inhaber: " + kontoinhaber + " | " + "Kontostand: " + this.kontostand);
	}
	private boolean pruefen(double wert)
	{
		if(kontoinhaber == null || kontoinhaber.isEmpty())
		{
			System.out.println("Kontoinhaber muss gesetzt sein");
			return false;
		}
		if(wert < 0)
		{
			System.out.println("Negativer Wert kann nicht bebucht werden");
			return false;
		}
		return true;
	}
}
