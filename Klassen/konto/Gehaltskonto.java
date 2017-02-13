package konto;

public class Gehaltskonto {
	
	private String inhaber;
	private String iban;
	private String bic; 
	private double kontostand;
	
	public Gehaltskonto(String inhaber, String iban, String bic)
	{
		if(pruefeEingabe(inhaber, iban, bic))
		{
			this.inhaber = inhaber;
			this.iban = iban;
			this.bic = bic;
			this.kontostand = 0.0;
		}
	}
	public boolean pruefeEingabe(String inhaber, String iban, String bic)
	{
		if(inhaber == null || inhaber.isEmpty())
		{
			return false;
		}
		if(iban == null || iban.isEmpty() || iban.length() < 10)
		{
			return false;
		}
		if(bic == null || bic.isEmpty() || bic.length() < 10)
		{
			return false;
		}
		return true;	
	}
	
	public void aufbuchen(double bebuchterWert)
	{

		if(bebuchterWert > 0)
		{
			this.kontostand = kontostand + bebuchterWert;
		}
		else
		{
			System.out.println("Wert <= 0 kann nicht bebucht werden.");
		}
		//getKontostand();
		//System.out.println(bebuchterWert);
	}
	public void abbuchen(double abgebuchterWert)
	{
		if(kontostand - abgebuchterWert < 0)
		{
			System.out.println(inhaber + " kann den Wert " + abgebuchterWert + " nicht abbuchen, da Kontostand  nach Abbuchung < 0");
		}
		else
		{
			kontostand = kontostand - abgebuchterWert;
		}
		
		/*
		double neuerWert = this.kontostand - abgebuchterWert;
		if (neuerWert < 0)
		{
			System.out.println(inhaber + " Kontostand <= 0 --> Abhebung nicht möglich.");
		}
		else
		{
			neuerWert = neuerWert - this.kontostand;
		}*/
		//getKontostand();
	}
	public void getKontostand()
	{
		System.out.println("Kontoinhaber: " + this.inhaber + " | aktueller Kontostand: " + kontostand);
	}

}
