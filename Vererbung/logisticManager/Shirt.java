package logisticManager;

public class Shirt extends Product implements Moveable{
	private String brand;
	private String size;
	private String color;

	public Shirt(String productCode, String brand, String size, String color) {
		super(productCode);
		this.brand = brand;
		this.size = size;
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	

	public String getBrand() {
		return brand;
	}

	public String getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}
	
	@Override
	public void move(String destination) {
		System.out.println(brand + " " + color + " will be moved to " + destination);
		
	}
	

}
