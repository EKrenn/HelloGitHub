package animal;

public class Lion extends Animal {

	public Lion(String color, int countEyes) {
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
		System.out.println("roar");
	}
	
	public void roar()
	{
		System.out.println("do something");
	}

}
