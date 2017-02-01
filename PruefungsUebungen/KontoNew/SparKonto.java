package KontoNew;

public class SparKonto extends Konto {

	public SparKonto(String inhaber) {
		super(inhaber);
	}
	
	@Override
	public void auszahlen(double wert)
	{
		if(kontostand - wert  < 0)
		{
			System.out.println("Kontostand darf nicht < 0 sein");
		}
		else
		{
			super.auszahlen(wert);
		}
	}
	
	

}
