package KontoNew;

public class JugendGiroKonto extends Girokonto {
	private double buchungslimit;

	public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
		super(inhaber, limit);
		this.buchungslimit = buchungslimit;
	}
	
	@Override
	public void auszahlen(double wert)
	{
		if(limit < wert)
		{
			if(buchungslimit < wert)
			{
				super.auszahlen(wert);
			}
			else 
			{
				System.out.println("Buchungslimit überschritten");
			}
		}
	}
	
	

}
