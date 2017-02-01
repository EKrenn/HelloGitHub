package bestellungLoesung;

public class Bestellung {

	private String nummer;
	private Bestellzeile[] bestellzeilen;
	
	public Bestellung(String nummer, Bestellzeile[] bestellzeilen) {
		this.nummer = nummer;
		this.bestellzeilen = bestellzeilen;
	}
	
	public void printBestellung()
	{
		System.out.println("Bestellnummer: " + nummer);
		
		for (int i = 0; i < bestellzeilen.length; i++) {
			Bestellzeile oneRow = bestellzeilen[i];
			
			System.out.println("Zeile " + i +
					oneRow.getName() + " - Kosten: " +
					oneRow.getKosten()
						);
		}
	}
	
	public double getKosten()
	{
		double kosten = 0;
		for (int i = 0; i < bestellzeilen.length; i++) {
			Bestellzeile oneRow = bestellzeilen[i];
			
			kosten += oneRow.getKosten();
		}
		
		return kosten;
	}
	
	
}
