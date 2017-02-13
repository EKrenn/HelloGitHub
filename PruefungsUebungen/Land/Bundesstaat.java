package Land;

import java.util.ArrayList;

public class Bundesstaat implements Land {
	private ArrayList<Land> laender = new ArrayList<Land>();

	public Bundesstaat()
	{
		
	}
	public void addLand(Land l)
	{
		laender.add(l);
	}
	@Override
	public double getBruttoSozialProdukt() {
		
		double summe = 0;
		for (Land land : laender) 
		{
			summe = summe + land.getBruttoSozialProdukt();
		}
		return summe;
	}
	

}
