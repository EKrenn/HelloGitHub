package Event;

import java.util.ArrayList;

public class EventKalender {

	private ArrayList<Event> events = new ArrayList<Event>();
	public void add(Event e)
	{
		events.add(e);
	}
	
	public Event getByTitle(String title)
	{
		for (Event event : events) 
		{
			if(event.getTitle().equals(title))
					return event;
		}
		return null;
	}
	
	public ArrayList<Event> getByOrt(String ort)
	{
		ArrayList<Event> gefunden = new ArrayList<Event>();
		for (Event event : events) 
		{
			if(event.getOrt().equals(ort))
				gefunden.add(event);
		}
		return gefunden;
	}
	
	public ArrayList<Event> getByEintrittsPreis(double min, double max)
	{
		ArrayList<Event> enthalten = new ArrayList<Event>();
		for (Event event : events) 
		{
			if(event.getEintrittspreis() >= min && event.getEintrittspreis() <= max)
			{
				enthalten.add(event);
			}
		}
		return enthalten;
	}
	
	public Event getMostExpensiveByOrt(String ort)
	{
		double preis = 0;
		Event found = null;
		for (Event event : events) 
		{
			if(event.getEintrittspreis() > preis)
				found = event;
				preis = event.getEintrittspreis();
		}
		return found;
	}
	
	public double getAvgPreisByOrt(String ort)
	{
		double sum = 0;
		int count = 0;
		for (Event event : events) 
		{
			if(event.getOrt().equals(ort))
				count++;
				sum = sum + event.getEintrittspreis();
			
		}
		if(count > 0)
			return (sum / count);
		else
			return -1;
	}
}
