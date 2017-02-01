package animal;

public class Cat extends Animal{

	private String name; 
	public Cat(String color, int countEyes) {
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
		System.out.println("miau");
	}
	
	

}
