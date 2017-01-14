import java.util.ArrayList;

public class DemoHase {

	public static void main(String[] args) {
		Hase hase = new Hase("Hopsi");
		Weihnachtshase wh = new Weihnachtshase("Flappsi");
		Osterhase oh = new Osterhase("Moppel");
		
		wh.fressen();
		oh.ostereier_verstecken();
		hase.hoppeln();
		
		Hase h = oh;
		oh.schlafen();
		
		ArrayList<Hase> hasen = new ArrayList<Hase>();
		ArrayList<Weihnachtshase> whasen = new ArrayList<Weihnachtshase>();
		ArrayList<Osterhase> ohasen = new ArrayList<Osterhase>();
		
		// Ohne Vererbungswissen
		hasen.add(hase);
		whasen.add(wh);
		ohasen.add(oh);
		
		// Mit Vererbung
		hasen.add(hase);
		hasen.add(wh);
		hasen.add(oh);
		
		System.out.println("-------------------");
		for(Hase list : hasen)
		{
			hase.fressen();
		}

	}

}
