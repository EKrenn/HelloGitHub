package Land;

public class Bundesland implements Land {

	private double bruttoSozialProdukt;
	
	public Bundesland(double bruttoSozialProdukt)
	{
		this.bruttoSozialProdukt = bruttoSozialProdukt;
	}
	
	@Override
	public double getBruttoSozialProdukt() {
		// TODO Auto-generated method stub
		return bruttoSozialProdukt;
	}
	

}
