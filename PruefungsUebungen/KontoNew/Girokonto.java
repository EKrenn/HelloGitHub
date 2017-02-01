package KontoNew;

public class Girokonto extends Konto {
	
	protected double limit;
	
	public Girokonto(String inhaber, double limit)
	{
		super(inhaber);
		this.limit = limit;
	}
	
	
	@Override
	public void auszahlen(double wert)
	{
		if(kontostand - wert < limit)
		{
			System.out.println("Limit überschritten");
		}
		else
		{
			super.auszahlen(wert);
		}
	}

}
