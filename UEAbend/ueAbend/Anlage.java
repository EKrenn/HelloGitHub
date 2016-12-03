package ueAbend;

public class Anlage {
	
	private String bezeichnung;
	private double initialWert;
	private int nutzungsdauer;
	private double restWert;
	private int alter;
	
	public Anlage(String bezeichnung, double initialWert, int nutzungsdauer)
	{
		this.bezeichnung = bezeichnung;
		this.initialWert = initialWert;
		this.nutzungsdauer = nutzungsdauer;
	}
	
	public String getBezeichung()
	{
		return bezeichnung;
	}

	public double getInitialWert() {
		return initialWert;
	}

	public int getNutzungsdauer() {
		return nutzungsdauer;
	}
	
	public void abschreiben()
	{
		alter++;
		if(alter <= nutzungsdauer)
		{
			restWert = Math.floor(initialWert / nutzungsdauer * (nutzungsdauer - alter));
		}
		System.out.println("Der Restwert von " + this.getBezeichung() + " beträgt: " + restWert);
	}
	public void simulate(int maxJahre, int minWert)
	{
		for(int i = 0; i <= maxJahre; i ++)
		{
			abschreiben();
			if(restWert == 0 )
			{
				System.out.println("Restwert gleich 0 (" + restWert + ")" );
				break;
			}
			else if(restWert > minWert)
			{
				System.out.println("Restwert ist größer als der minimale Wert (" + restWert + ")");
				break;
			}
		}	
	}
	public Anlage renew(int zusatzWert, int zusatzJahre)
	{
		int neuerInitialWert = (int)getInitialWert() + zusatzWert;
		int neueNutzungsdauer = (getNutzungsdauer() - this.alter) + zusatzJahre;
		
		Anlage anlage = new Anlage(bezeichnung, neuerInitialWert, neueNutzungsdauer);
		System.out.println("Bezeichnung: " + anlage.getBezeichung() + " | Neuer Initialwert: " + neuerInitialWert + " | Neue Nutzungsdauer: " + neueNutzungsdauer);
		return anlage;
	}
	

	
	

}
