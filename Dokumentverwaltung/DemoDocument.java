import java.util.ArrayList;

public class DemoDocument {

	public static void main(String[] args) {
		TextDocument td = new TextDocument("test.txt", "Nur ein Test");
		ImageDocument id = new ImageDocument("img.jpg", 10, 5, "brown");
		CsvDocument cd = new CsvDocument("demo.csv", new ArrayList<String>());
		cd.addLine("Erste Zeile");
		cd.addLine("Zweite Zeile");
		cd.addLine("Dritte Zeile");
		cd.addLine("Vierte Zeile");
		
		//td.printDocument();
		//id.printDocument();
		//cd.printDocument();
		
		ArrayList<String> csv = new ArrayList<>();
		csv.add("line1");
		csv.add("line2");
		Document doc = new CsvDocument("demo", csv);
		//doc.printDocument();
		
		PrintManager pm = new PrintManager();
		pm.addDocument(td);
		pm.addDocument(id);
		pm.addDocument(cd);
		pm.printAll();
		
		if(pm.findDocument("test.txt") != null)
			System.out.println("test.txt gefunden");
		if(pm.findDocument("img.jpg") != null)
			System.out.println("img.jpg gefunden");
		else
		{
			System.out.println("Dokument nicht gefunden");
		}
		
		

	}

}
