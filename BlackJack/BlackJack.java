import java.util.Collection;
import java.util.HashMap;

public class BlackJack {
	
	private HashMap<Player, Integer> players = new HashMap<Player, Integer>();
	
	public boolean add(Player player)
	{
		// Map Player mit dem übergebenen player vergleichen --> wenn ein Player hinzugefügt wurde
		// dann false, weil der Spieler dann schon existiert, sonst noch nicht
		// equals vergleich Map mit Map
		// containsKey vergleicht Keys miteinander
		if (players.containsKey(player))
		{
			return false;
		}
		players.put(player, 0);
		return true;
	}
	
	public boolean addCard(Player player, Integer cardValue)
	{
		Integer newValue = players.get(player);
		if(players.containsKey(player))
		{
			players.put(player, newValue + cardValue);
			return true;
		}
		return false;
		
	}
	
	public Integer getValue(Player player)
	{
		if(players.containsKey(player))
		{
			return players.get(player);
		}
		return null;
	}

	@Override
	public String toString() {
		String text = "";
		// Schleife über die Klasse Player und alle KeySet retour erhalten
		for(Player p : players.keySet())
		{
			text = text + p.getName() + ", Kartenwert: " + players.get(p) + "\n";
		}
		return text;
	}
	
	
	

}
