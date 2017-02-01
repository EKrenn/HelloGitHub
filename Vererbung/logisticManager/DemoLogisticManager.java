package logisticManager;

public class DemoLogisticManager {

	public static void main(String[] args) {
		Car car = new Car("12435", "VW Golf", "Blue", 3879);
		Shirt shirt = new Shirt("kkljnöa222", "H&M", "L", "white");
		LogisticManager lm = new LogisticManager();
		lm.addMoveable(car);
		lm.addMoveable(shirt);
		lm.moveAll("Graz");

	}

}
