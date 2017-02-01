package animal;

public abstract class Animal {
	private String color;
	private int countEyes;
	
	
	
	public Animal(String color, int countEyes) {
		super();
		this.color = color;
		this.countEyes = countEyes;
	}
	
	public abstract void walk();
	
	public abstract void makeNoise();
	
	
	public String getColor()
	{
		return color;
	}

}
