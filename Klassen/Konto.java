
public class Konto {
	private String kontoinhaber;
	private double konstostand;
	
	public void setInhaber(String inhaber)
	{
		Konto konto = new Konto();
		konto.kontoinhaber = inhaber;
		konto.konstostand = 0.0;
	}
	public void aufbuchen(double bebuchterWert)
	{
		Konto konto = new Konto();
		double neuerWert = konto.konstostand + bebuchterWert;
		System.out.println(neuerWert);
	}
	public void abbuchen(double abgebuchterWert)
	{
		Konto konto = new Konto();
		double neuerWert = konto.konstostand - abgebuchterWert;
		System.out.println(neuerWert);
		if (neuerWert < 0)
		{
			System.out.println("Kontostand unterschritten - Geht leider nicht!");
		}
		
		
	}
}



