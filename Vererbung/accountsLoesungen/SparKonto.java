package accountsLoesungen;

public class SparKonto extends Konto{

	public SparKonto(String inhaber) {
		super(inhaber);
	}

	public void auszahlen (double wert)
	{
		if ( kontostand -wert <0 )
		{
			System.out.println("Nicht genügend Guthaben");
		}
		else 
		{
			kontostand-= wert;
		}
	}
}
