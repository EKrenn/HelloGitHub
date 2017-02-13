package oop;

import java.util.ArrayList;
import java.util.HashMap;

public class Bundesstaat {
	private ArrayList<Einwohner> einwohner = new ArrayList<Einwohner>();
	
	public void add(Einwohner e)
	{
		einwohner.add(e);
	}
	
	public double gesamtSteuer()
	{
		double steuer = 0; 
		for (Einwohner e : einwohner) 
		{
			steuer = steuer + e.steuer();			
		}
		return steuer;
	}
	
	public HashMap<String, Double> steuerNachBundesland()
	{
		HashMap<String, Double> map = new HashMap<>();
		
		for (Einwohner e : einwohner) 
		{
			if(map.containsKey(e.getBundesland()))
			{
				double steuer = map.get(e.getBundesland());
				steuer = steuer + e.steuer();
				map.put(e.getBundesland(), steuer);
			}	
			else
				map.put(e.getBundesland(), e.steuer());
			
		}
		
		return map;
	}

}
