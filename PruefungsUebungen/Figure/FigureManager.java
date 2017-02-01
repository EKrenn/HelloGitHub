package Figure;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
	
	ArrayList<Figure> figures = new ArrayList<Figure>();
	
	public void add(Figure f)
	{
		figures.add(f);
	}
	public double getMaxPerimeter()
	{
		double all = 0;
		for (Figure figure : figures) 
		{
			if(all < figure.getPerimeter())
			{
				all = figure.getPerimeter();
			}
		}
		return all;
	}
	
	public double getAverageAreaSize()
	{
		double avAreas = 0;
		int count = 0;
		for (Figure figure : figures) 
		{
			avAreas = avAreas + figure.getArea(); 
			count++;
		}
		return avAreas / count;
	}
	
	public HashMap<String, Double> getAreaBySizeCategories()
	{
		HashMap<String, Double> map = new HashMap<String, Double>();
		for (Figure figure : figures) 
		{
			if(map.containsKey(figure.getCategorie()))
			{
				double currentArea = map.get(figure.getCategorie());
				currentArea = currentArea + figure.getArea();
				
				map.put(figure.getCategorie(), currentArea);
			}
			else map.put(figure.getCategorie(), figure.getArea());
			
		}
		return map;
	}

}
