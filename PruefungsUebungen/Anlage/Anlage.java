package Anlage;

public class Anlage {
	private String bezeichung;
	private double initialWert;
	private int nutzungsdauer;
	private double restWert;
	private int alter;
	
	public Anlage(String bezeichnung, double initialWert, int nutzungsdauer)
	{
		this.bezeichung = bezeichnung;
		this.initialWert = initialWert;
		this.nutzungsdauer = nutzungsdauer;
	}

	public String getBezeichung() {
		return bezeichung;
	}

	public double getInitialWert() {
		return initialWert;
	}

	public int getNutzungsdauer() {
		return nutzungsdauer;
	}

	public double getRestWert() {
		return restWert;
	}

	public int getAlter() {
		return alter;
	}
	
	public void abschreiben()
	{
		alter++;
		if(alter <= nutzungsdauer)
		{ 
			restWert = Math.floor(initialWert / nutzungsdauer  * (nutzungsdauer - alter));
		}
	}
	public void simulate(int maxJahre, int minWert)
	{
		System.out.println("Restwert vor: " + restWert);
		for (int i = 0; i <= maxJahre; i++) 
		{
			if(restWert != 0 || restWert >= minWert)
			{
				abschreiben();
				System.out.println("Jahre: " + i);
				System.out.println("Restwert nach: " + restWert);
			}
			
		}
	}
	public Anlage renew(int zusatzWert, int zusatzJahre)
	{
		
		initialWert = restWert + zusatzWert;
		nutzungsdauer = (nutzungsdauer - alter) + zusatzJahre;
		return new Anlage(getBezeichung(), initialWert, nutzungsdauer);
	}
	
	

}
