import java.util.Collection;
import java.util.HashMap;

public class BlackJack {
	
	private HashMap<Player, Integer> players = new HashMap<Player, Integer>();
	
	public boolean add(Player player)
	{
		if (players.containsKey(player))
		{
			players.put(player, 0);
			return true;
		}
		return false;
	}
	
	public boolean addCard(Player player, Integer cardValue)
	{
		Integer newValue = players.get(player);
		if(players.equals(player))
		{
			newValue = newValue + cardValue;
			return true;
		}
		return false;
	}
	
	public Integer getValue(Player player)
	{
		if(players.equals(player))
		{
			System.out.println("getValue of player: " + players.get(player));
			return players.get(player);
		}
		return null;
	}

	@Override
	public String toString() {
		/*
		// neue Variable der Klasse Player erzeugen, und null setzen
		Player found = null; 
		for(Player p : players.)
		{
			found = p; 
		}*/
		return "Spieler: " + players.toString() + " Kartenwert: "; // + getValue(players);
		//return "";
		/*
		Employee found = null;
		// Durchlaufe die Liste
		for(Employee e : employee)
		{
			// Wenn das aktuelle Gehalt größer als Max?
			if(e.getSalary() > max)
			{
				// Wenn ja: Max = das neue größere Gehalt
				max = e.getSalary();
				// und der Employee (found) = der aktuelle Mitarbeiter
				found = e;
			}
		}
		// liefert den Mitarbeiter zurück
		return found; */
	}
	
	
	

}
