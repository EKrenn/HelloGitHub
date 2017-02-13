package oop;

public class Angestellter extends Einwohner{

	private int kinder;
	public Angestellter(int einkommen, String bundesland, int kinder) {
		super(einkommen, bundesland);
		this.kinder = kinder;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double steuer() {
		double steuer = 0;
		switch (kinder) {
		case 0:
			steuer = getEinkommen()*0.5;
			break;
		case 1:
			steuer = getEinkommen()*0.4;
			break;
		case 2:
			steuer = getEinkommen()*0.3;
			break;
		case 3:
			steuer = getEinkommen()*0.15;
			break;
		default:
			steuer = getEinkommen()*0.05;
			break;
		}
		return steuer;
	}
	

}
