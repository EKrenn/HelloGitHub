package Figure;

public class Demo {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(5, 30);
		Rectangle r4 = new Rectangle(5, 30);
		Rectangle r5 = new Rectangle(5, 30);
		Rectangle r2 = new Rectangle(500, 30);
		Rectangle r3 = new Rectangle(50, 30);
		
		FigureManager fm = new FigureManager();
		fm.add(r);
		fm.add(r2);
		fm.add(r3);
		fm.add(r4);
		fm.add(r5);
		System.out.println(r.getArea());
		System.out.println(r2.getArea());
		System.out.println(r3.getArea());
		//System.out.println(fm.getAverageAreaSize());
		System.out.println(fm.getAreaBySizeCategories());

	}

}
