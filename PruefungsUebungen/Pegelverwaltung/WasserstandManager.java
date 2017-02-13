package Pegelverwaltung;

import java.util.ArrayList;

public class WasserstandManager {

	private ArrayList<Wasserstand> wasser = new ArrayList<Wasserstand>();
	
	public void add(Wasserstand w)
	{
		wasser.add(w);
	}
	public Wasserstand findById(int id)
	{
		for (Wasserstand wasserstand : wasser) 
		{
			if(wasserstand.getId() == id)
				return wasserstand;
		}
		return null;
	}
	public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName)
	{
		ArrayList<Wasserstand> found = new ArrayList<Wasserstand>();
		for (Wasserstand wasserstand : wasser) 
		{
			if(wasserstand.getGewaesserName().equals(gewaesserName))
				found.add(wasserstand);
		}
		return found;
	}
	public Wasserstand findNewestWasserstandForGewaesser (String gewaesserName)
	{
		int zeit = 0;
		Wasserstand w = null;//new Wasserstand(0, gewaesserName, 0, 0, 0);
		for (Wasserstand wasserstand : wasser) 
		{
			if(wasserstand.getGewaesserName().equals(gewaesserName))
				if(wasserstand.getTime() > zeit)
				{
					zeit = wasserstand.getTime();
					w = wasserstand;
				}
				/*if(zeit < wasserstand.getTime())
				{
					zeit = wasserstand.getTime();
					w.setId(wasserstand.getId());
					w.setMessWert(wasserstand.getMessWert());
					w.setMessWertFuerAlarmierung(wasserstand.getMessWertFuerAlarmierung());
				}*/
		}
		return w;
	}
	public Wasserstand findOldestWasserstandForGewaesser (String gewaesserName)
	{
		int zeit = 0;
		Wasserstand w = null;//new Wasserstand(0, gewaesserName, 0, 0, 0);
		for (Wasserstand wasserstand : wasser) 
		{
			if(wasserstand.getGewaesserName().equals(gewaesserName))
				if(wasserstand.getTime() < zeit)
				{
					wasserstand = w;
					zeit = wasserstand.getTime();
				}
				
				/*if(zeit > wasserstand.getTime())
				{
					zeit = wasserstand.getTime();
					w.setId(wasserstand.getId());
					w.setMessWert(wasserstand.getMessWert());
					w.setMessWertFuerAlarmierung(wasserstand.getMessWertFuerAlarmierung());
				}
				else if(zeit == 0)
				{
					zeit = wasserstand.getTime();
					w.setId(wasserstand.getId());
					w.setMessWert(wasserstand.getMessWert());
					w.setMessWertFuerAlarmierung(wasserstand.getMessWertFuerAlarmierung());
				}*/
				
		}
		return w;
	}
	public ArrayList<Wasserstand> findForAlarmierung()
	{
		ArrayList<Wasserstand> found = new ArrayList<Wasserstand>();
		for (Wasserstand wasserstand : wasser) 
		{
			if(wasserstand.getMessWert() >= wasserstand.getMessWertFuerAlarmierung())
				found.add(wasserstand);
			
		}
		return found;
	}
	public ArrayList<Wasserstand> findByZeitspanne(int von, int bis, String gewaesserName)
	{
		ArrayList<Wasserstand> found = new ArrayList<Wasserstand>();
		for (Wasserstand wasserstand : wasser) 
		{
			if(wasserstand.getTime() >= von && wasserstand.getTime() <= bis && wasserstand.getGewaesserName().equals(gewaesserName))
			found.add(wasserstand);
		}
		return found;
	}
	
}
