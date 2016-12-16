package zinsen;

public class Zinsberechnung {
	
	private double kapital; 
	
	
	public Zinsberechnung(double kapital)
	{
		this.kapital = kapital;
		
	}
	
	public double berechnung(int tage, double zinssatz)
	{
		double zinsen = (this.kapital * tage / 36000  * zinssatz);
		System.out.println("Zinsen: " + zinsen);
		return zinsen; 
	}
	
	
	

}
