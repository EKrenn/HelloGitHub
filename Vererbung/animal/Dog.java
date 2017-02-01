package animal;

public class Dog extends Animal{
	private String name;
	
	
	public Dog(String color, int countEyes) {
		super(color, countEyes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk()
	{
		System.out.println("running");
	}
	
	@Override
	public void makeNoise()
	{
		System.out.println("wuff");
	}

}
