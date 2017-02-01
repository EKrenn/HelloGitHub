package RekursionOrte;

import java.util.ArrayList;

public class Ort {
	private String name;
	ArrayList<Ort> verbundeneOrte = new ArrayList<Ort>();
	
	
	public Ort(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	public ArrayList<Ort> getNachbarn()
	{
		return verbundeneOrte;
	}
	
	public void addNachbar(Ort o)
	{
		verbundeneOrte.add(o);
	}
	
	public boolean hasCircle()
	{
		return hasCircle("", name);
	}
	
	private boolean hasCircle(String ueber, String ziel)
	{
		for (Ort ort : verbundeneOrte) 
		{
			//Abbruchbedingung 1
			//Wenn der Startort gleich dem uebergeordneten Knoten
			if(ort.name.equals(ueber))
				//bricht ab und geht mit nächstem Schritt weiter
				continue;
			//Abbruchbedingung 2
			//Wenn Startort gleich dem Ziel
			if(ort.name.equals(ziel))
				return true;
			
			//Zwischenvariable
			boolean erg = ort.hasCircle(name, ziel);
			
			//Abbruchbedingung 3
			if(erg)
				return true;		
		}
		
		return false;
	}
	/*
	public int countHops(Ort o, Ort d)
	{
		for (Ort ort : verbundeneOrte) 
		{
			ort.name.equals(o);
			return 1;
		}
	}
	*/
	public static void main(String[] args) 
	{
		Ort graz = new Ort("graz");
		Ort wien = new Ort("wien");
		Ort marburg = new Ort("marburg");
		Ort linz = new Ort("linz");
		
		graz.addNachbar(marburg);
		graz.addNachbar(wien);
		
		wien.addNachbar(linz);
		
		linz.addNachbar(graz);
		marburg.addNachbar(graz);
		wien.addNachbar(graz);
		
		linz.addNachbar(wien);
		
		System.out.println(graz.hasCircle());
		System.out.println(marburg.hasCircle());
	}
}
