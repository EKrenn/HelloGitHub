import java.util.HashMap;
import java.util.Map;

public class BlackJack {
	
	private Map<Player, Integer> players = new HashMap<Player, Integer>();
	
	public boolean add(Player player)
	{
		if (players.equals(player))
		{
			players.put(player, 0);
			return true;
		}
		return false;
	}
	
	public boolean addCard(Player player, Integer cardValue)
	{
		if(players.equals(player))
		{
			//players.
		}
		return false;
	}
	
	public Integer getValue(Player player)
	{
		return 0;
	}

	@Override
	public String toString() {
		return "BlackJack [players=" + players + "]";
	}
	
	
	

}
