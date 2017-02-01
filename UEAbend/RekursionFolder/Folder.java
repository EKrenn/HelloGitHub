package RekursionFolder;

import java.util.ArrayList;

public class Folder extends Item {

	private ArrayList<Item> items = new ArrayList<>();
	public Folder(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void add(Item i)
	{
		items.add(i);
	}
	
	@Override
	public int getSize(int currentDeep) 
	{
		if(currentDeep > 5)
			return 555; // Wenn man nur bis max. 5 Ebenen eine Ausgabe hat, wird der Initialwert 555 zurückgeliefert
		//Vor dieser Erweiterung war die Methode getSize() ohne Parameter
		
		
		
		int size = 0;
		//bei Variante 2
		//int size = super.getSize(currentDeep);
		
		//mit einer For-Schleife ginge es nicht, da man so das Ergebnis 5x ausgibt, aber nicht 5 Ebenen
		// --> geht nicht: for(int i = 0; i < 5; i++)
			
		for (Item item : items) 
		{
			size = size + item.getSize(currentDeep + 1);
		}
		return size;
	}

}
