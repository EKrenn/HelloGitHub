package animalsLoesung;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("pauli", "braun", 2);
		
		Animal a = dog;
		
		Dog dog1 = (Dog) a;
		
		
		Bird b = new Bird("zwitschi", "gelb", 2);
		b.walk();
		

	}

}
