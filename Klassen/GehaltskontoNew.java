
public class GehaltskontoNew {

	public static void main(String[] args) {
		Gehaltskonto[] konten = new Gehaltskonto[3];
		Gehaltskonto kunde = new Gehaltskonto("Maxi", "1234567123", "ABC1234567");
		Gehaltskonto kunde1 = new Gehaltskonto("Susi", "111111", "A1234567");
		Gehaltskonto kunde2 = new Gehaltskonto("Hansi", "1111111111", "ABCDD34567");
		
		kunde.aufbuchen(100);
		kunde1.aufbuchen(20);
		kunde2.aufbuchen(30);
		
		kunde.abbuchen(90);
		kunde1.abbuchen(30);
		kunde2.abbuchen(12);
		konten[0] = kunde;
		konten[1] = kunde1;
		konten[2] = kunde2;
		
		

	}

}
