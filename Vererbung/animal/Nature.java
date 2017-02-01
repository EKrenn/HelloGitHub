package animal;

import java.util.ArrayList;
import java.util.HashMap;

public class Nature {
	
	private ArrayList<Animal> list = new ArrayList<Animal>();
	
	public void addAnimal(Animal a)
	{
		list.add(a);
	}
	public int countColor(String color)
	{
		int i = 0;
		for(Animal a : list)
		{
			if(a.getColor().equals(color))
			{
				i++;
			}
		}
		return i;
	}
	
	public HashMap<String, Integer> getCountByColour()
	{
		HashMap<String, Integer> map = new HashMap<>();
		
		
		for (Animal animal : list) 
		{
			if(map.containsKey(animal.getColor()))
			{
				int i = map.get(animal.getColor());
				i++;
				map.put(animal.getColor(), i);
			}
			else
			{
				map.put(animal.getColor(), 1);
			}
		}		
		return map;
	}

}
