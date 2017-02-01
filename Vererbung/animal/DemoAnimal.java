package animal;

public class DemoAnimal {

	public static void main(String[] args) {


		Frog quaxi = new Frog("green", 2);
		Frog quaxi1 = new Frog("green", 2);
		Frog quaxi2 = new Frog("brown", 2);
		Frog quaxi3 = new Frog("blue", 2);
		
		Animal quaxiAsAnimal = quaxi;
		Frog quaxiNew = (Frog)quaxiAsAnimal;
		
		Nature n = new Nature();
		n.addAnimal(quaxi);
		n.addAnimal(quaxi1);
		n.addAnimal(quaxi2);
		n.addAnimal(quaxi3);
		System.out.println(n.countColor("yellow"));
		
		System.out.println(n.countColor("brown"));
		System.out.println(n.countColor("green"));
		System.out.println(n.countColor("blue"));
		
		System.out.println(n.getCountByColour());
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		
		
		Dog dog = new Dog("brown", 2);
		dog.walk();
		dog.makeNoise();
		System.out.println("-------------------------");
		Animal dogAsAnimal = dog;
		dogAsAnimal.walk();
		dogAsAnimal.makeNoise();

	}

}
