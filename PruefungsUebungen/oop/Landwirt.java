package oop;

public class Landwirt extends Einwohner {

	private int grundflaeche;
	public Landwirt(int grundflaeche, String bundesland) {
		super(grundflaeche*100, bundesland);
		this.grundflaeche = grundflaeche;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double steuer() {
		double steuer = getEinkommen() * 0.225;
		return steuer;
	}

}
