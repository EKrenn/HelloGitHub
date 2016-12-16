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
		return 0;
	}

	@Override
	public String toString() {
		//return players + " Kartenwert: " + getValue(players);
		return "";
	}
	
	
	

}
