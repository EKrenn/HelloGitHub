package animalsLoesung;

public class  Dog extends Animal {

	public Dog(String name, String color, int countEyes) {
		super(name, color, countEyes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("wie ein dog eben geht");
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("wuff wuff");
	}
	
	
	
	

}