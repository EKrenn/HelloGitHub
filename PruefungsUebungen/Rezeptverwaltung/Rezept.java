package Rezeptverwaltung;

public class Rezept {
	private String name;
	private byte personen;
	private Zutat[] zutaten;
	
	public Rezept(String name, byte personen, Zutat[] zutaten)
	{
		this.name = name;
		this.personen = personen;
		this.zutaten = zutaten;
	}
	
	public void printRezept()
	{
		System.out.println(name);
		
		for (int i = 0; i < zutaten.length; i++) 
		{
			System.out.println(zutaten[i].getName() + " " + zutaten[i].getMenge());			
		}
	}
	public Rezept umrechnen(int personen)
	{
		Rezept r = null;
		int faktor = personen / this.personen;
		Zutat[] z = new Zutat[zutaten.length];
		for (int i = 0; i < zutaten.length; i++) 
		{
			//z[i].getMenge() = 4;
			z[i] = new Zutat(zutaten[i].getName(), zutaten[i].getMenge() * faktor);
			
		}
		r = new Rezept(name, (byte)personen, z);
		return r;
	}
	
}
