package Figure;

public class Circle extends Figure {
	private double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		double perimeter = 2 * radius * Math.PI;
		return perimeter;
	}

	@Override
	public double getArea() {
		double area = Math.PI * radius *radius;
		return area;
	}

	@Override
	public String getCategorie() {
		if(getArea() < 1000)
		{
			return "Klein";
		}
		else if(getArea() < 4999)
		{
			return "Mittel";
		}
		else
			return "Groß";
	}

}
