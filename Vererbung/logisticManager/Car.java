package logisticManager;

public class Car extends Product implements Moveable{
	private String type;
	private String color;
	private int weight;

	public Car(String productCode, String type, String color, int weight) {
		super(productCode);
		this.type = type;
		this.color = color;
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}

	
	public String getType() {
		return type;
	}


	public String getColor() {
		return color;
	}


	public int getWeight() {
		return weight;
	}


	@Override
	public void move(String destination) {
		System.out.println(color + " " + type + " will be moved to " + destination);
		
	}
	
	
	
	

}
