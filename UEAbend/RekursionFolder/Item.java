package RekursionFolder;

public abstract class Item {
	private String name;
	
	public Item(String name) {
		super();
		this.name = name;
	}
	
	/* Wenn jedes File und jeder Folder eine Grundgröße von 2 haben soll
	 * Eine abstrakte Klasse muss keine abstrakte Methoden haben
	public int getSize(int currentDeep)
	{
		return 2;
	}
	*/
	public abstract int getSize(int currentDeep);

}
