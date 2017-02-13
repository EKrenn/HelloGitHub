package EventKalender;

import java.util.ArrayList;

public class EventKalender {
	
	ArrayList<Event> liste = new ArrayList<Event>();
	
	public void add(Event event)
	{
		liste.add(event);
	}
	
	public Event getByTitle(String title)
	{
		for(Event e : liste)
		{
			if(e.getTitel().equals(title))
			{
				return e;
			}
		}
		return null;
	}
	
	public ArrayList<Event> getByOrt(String ort)
	{
		ArrayList<Event> found = new ArrayList<Event>();
		// Variable "e" ist irrelevant, ist für die weitere Nutzung im Block wichtig
		for(Event e : liste)
		{
			if(e.getOrt().equals(ort))
			{
				found.add(e);		
			}	
		}
		return found;
	}
	
	public ArrayList<Event> getByEintrittspreis(double min, double max)
	{
		ArrayList<Event> found = new ArrayList<Event>();
		for(Event e : liste)
		{
			if (e.getEintrittspreis() >= min && e.getEintrittspreis() <= max)
			{
				found.add(e);
			}
		}
		return found;
	}
	
	public Event getMostExpensiveByOrt(String ort)
	{
		// sollte ein Event gratis sein, ist es 0, somit größer als -1
		double preis = -1.0;
		Event found = null;
		for(Event e : liste)
		{
			if(e.getEintrittspreis() > preis && e.getOrt().equals(ort))
			{
				found = e;
				// e.get... oder found.get... == gleiches Ergebnis
				preis = e.getEintrittspreis();
			}
		}
		return found;
	}
	
	public double getAvgPreisByOrt(String ort)
	{
		double sum = 0.0;
		int found = 0;
		
		for(Event e : liste)
		{
			if(e.getOrt().equals(ort))
			{
				found++;
				sum = sum + e.getEintrittspreis();
			}
		}
		// Sollte es keinen geben, dann liefert er -1 zurück
		if (found > 0)
		{
			return sum/found;
		}
		return -1.0;
	}
	

}
