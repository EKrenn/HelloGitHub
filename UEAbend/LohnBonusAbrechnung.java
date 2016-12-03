
public class LohnBonusAbrechnung {
	private String vorname;
	private String nachname;
	private int mitarbeiternummer;
	private double gehalt;
	private int alter;
	private double gehaltProJahr;
	
	public LohnBonusAbrechnung(String vorname, String nachname, double gehalt)
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.gehalt = gehalt;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	public String getVorname() {
		return vorname;
	}

	public int getMitarbeiternummer() {
		return mitarbeiternummer;
	}

	public int getAlter() {
		return alter;
	}
	
	public double monatsAbrechnung()
	{
		double zwischenvariable = 0.0;
		double gehaltOhneSteuern = 0.0;
		
		// Gehalt auf das Jahr gerechnet
		double jahresgehalt = gehalt * 12;
		System.out.println("Jahresgehalt vor Berechnung: " + jahresgehalt);
		
		// 20 % Sozialversicherung vom Jahresgehalt abziehen
		double gehaltOhneSozial = jahresgehalt * 0.8;
		System.out.println("Gehalt ohne 20% SoZi: " + gehaltOhneSozial);
		
		// Berechnung Einkommenssteuer
		if(gehaltOhneSozial > 50_001)
		{
			zwischenvariable = gehaltOhneSozial - 50_000;
			gehaltOhneSteuern = gehaltOhneSozial - ((zwischenvariable / 100) * 60) - 13500 - 6400 - 2000 - 1000;
			
			System.out.println("1 Gehalt ohne Steuern: " + gehaltOhneSteuern);
		}
		else if(gehaltOhneSozial < 50_000 && gehaltOhneSozial > 30_000)
		{
			zwischenvariable = gehaltOhneSozial - 30_000;
			gehaltOhneSteuern = gehaltOhneSozial - ((zwischenvariable / 100) * 45) - 6400 - 2000 - 1000;
			
			System.out.println("2 Gehalt ohne Steuern: " + gehaltOhneSteuern);
		}
		else if(gehaltOhneSozial < 30_000 && gehaltOhneSozial > 20_000)
		{
			zwischenvariable = gehaltOhneSozial - 20_000;
			gehaltOhneSteuern = gehaltOhneSozial - ((zwischenvariable / 100) * 32) - 2000 - 1000;
			
			System.out.println("3 Gehalt ohne Steuern: " + gehaltOhneSteuern);
		}
		else if(gehaltOhneSozial < 20_000 && gehaltOhneSozial > 10_000)
		{
			zwischenvariable = gehaltOhneSozial - 10_000;
			gehaltOhneSteuern = gehaltOhneSozial - ((zwischenvariable / 100) * 20) - 1000;
			
			System.out.println("4 Gehalt ohne Steuern: " + gehaltOhneSteuern);
		}
		else if(gehaltOhneSozial < 10_000)
		{
			gehaltOhneSteuern = gehaltOhneSozial - ((gehaltOhneSozial / 100) * 10);
			
			System.out.println("5 Gehalt ohne Steuern: " + gehaltOhneSteuern);
		}
		
		gehaltProJahr = gehaltOhneSteuern;
		
		gehalt = (gehaltOhneSteuern / 12);
		System.out.println("Monatsgehalt nach Berechnung: " + Math.round(gehalt));
		
		return gehalt;
	}
	public double jahresAbrechnung()
	{
		System.out.println("Jahresabrechnung: " + gehaltProJahr);
		return gehaltProJahr;
	}
	public double jahresAbrechnung(int monate)
	{
		System.out.println("Jahresabrechnung mit x Monaten: " + (gehalt * monate));
		return gehalt * monate;
	}
	
	

}
