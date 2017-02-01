package logisticManager;

import java.util.ArrayList;

public class LogisticManager {
	
	private ArrayList<Moveable> moveables = new ArrayList<>();
	public void addMoveable(Moveable m)
	{
		moveables.add(m);
	}
	
	public void moveAll(String destination)
	{
		for (Moveable m : moveables) 
		{
			m.move(destination);
		}
	}

}
