package ueAbend;

public class Verwaltungsstrafe {
	
	private String vorname;
	private String nachname;
	private String kennzeichen;
	private int strafnummer;
	private double strafe = 0.0;
	private byte anzahl;
	
	public Verwaltungsstrafe(String vorname, String nachname, String kennzeichen)
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.kennzeichen = kennzeichen;
	}
	public String getVorname()
	{
		return vorname; 
	}
	public String getNachname()
	{
		return nachname; 
	}
	public String getKennzeichen()
	{
		return kennzeichen; 
	}
	public int getStrafnummer()
	{
		return strafnummer; 
	}
	public byte getAnzahl()
	{
		return anzahl; 
	}
	public double getStrafe()
	{
		System.out.println("Strafe: " + strafe);
		if(anzahl == 1)
		{
			strafe = (strafe * 0.7);
		}
		else if(anzahl == 2)
		{
			strafe = (strafe * 0.8);
		}
		else if(anzahl == 3)
		{
			strafe = (strafe * 0.9);
		}
		else 
		{
			return strafe;
		}
		return strafe;
	}
	
	public void strafe(int geschwindigkeitsueberschreitung)
	{
		//strafe = 0.0;
		if(geschwindigkeitsueberschreitung <= 20)
		{
			strafe = strafe + 30;
			
			System.out.println("Übertretung <=20: " + strafe);
		}
		else if(geschwindigkeitsueberschreitung <= 30)
		{
			strafe = strafe + 50;
			
			System.out.println("Übertretung <=30: " + strafe);
		}
		else if(geschwindigkeitsueberschreitung <= 50)
		{
			strafe = strafe + 100;
			
			System.out.println("Übertretung <=50: " + strafe);
		}
		else if(geschwindigkeitsueberschreitung <= 100)
		{
			strafe = strafe + 500;
			
			System.out.println("Übertretung <=100: " + strafe);
		}
		else if(geschwindigkeitsueberschreitung > 100)
		{
			strafe = strafe + 1500;
			
			System.out.println("Übertretung > 100: " + strafe);
		}
		anzahl ++;
	}
	public void verbandspaket()
	{
		strafe = strafe + 25;
		anzahl++;
	}
	public void alkohol(double promille)
	{
		if(promille < 0.5)
		{ 
			return;
		}
		else if(promille >= 0.5 && promille <= 1.0)
		{
			strafe = strafe + 100;
			
		}
		else if(promille <= 2.0)
		{
			strafe = strafe + 400;
			
		}
		else if (promille <= 3.0)
		{
			strafe = strafe + 1000;
			
		}
		else if (promille > 3.0)
		{
			strafe = strafe + 5000;
			
		}
		anzahl += 2;
	}
	public void sonstiges (double wert)
	{
		strafe = strafe + wert;
		anzahl++;
	}
	

}
