
public class Hase {
	// braucht nur hier verwendet werden
	protected String name;
	
	public String getName()
	{
		return name;
	}
	
	public void schlafen()
	{
		System.out.println("Hase " + name + " schläft");
	}
	public void hoppeln()
	{
		System.out.println("Hase " + name + " hoppelt");
	}
	public void fressen()
	{
		System.out.println("Hase " + name + " frisst");
	}
	
	public Hase(String name)
	{
		this.name = name;
		
	}

}
