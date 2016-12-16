import java.util.HashSet;

public class SetDemoLV {

	public static void main(String[] args) {
		// set A = 3 Namen (String)
		HashSet<String> setA = new HashSet<String>();
		setA.add("Max");
		setA.add("Peter");
		setA.add("Tim");
		
		// set B = 5 Namen (String)
		HashSet<String> setB = new HashSet<String>();
		setB.add("Susi");
		setB.add("Max");
		setB.add("Maria");
		setB.add("Peter");
		setB.add("Hans");
		
		// 2 Namen sollen sich überlappen
		
		
		// intersection -> retainAll
		// temporäres HashSet, um das ursprüngliche Set nicht zu verändern ---> kopiert
		HashSet<String> tmpInt = new HashSet<String>(setA);
		System.out.println(tmpInt.retainAll(setB));
		System.out.println(tmpInt);
		
		// alle in B ohne A
		// difference = removeAll
		HashSet<String> tmpDiff = new HashSet<String>(setB);
		tmpDiff.removeAll(setA);
		System.out.println(tmpDiff);
		
		// Alle von A in B hinzufügen, ohne doppelte Werte
		HashSet<String> tmpAdd = new HashSet<String>(setA);
		tmpAdd.addAll(setB);
		System.out.println(tmpAdd);
		
		/* Ausgabe in einer Zeile funktioniert, weil HashSet selbst eine toString Methode hat und diese gleich anwendet */
		
		
		// Wenn in Klasse Person die Methode toString nicht vorhanden ist, wird ein kryptischer Wert ausgegeben
		// Wenn toString in der Klasse Person vorhanden ist, dann ist die Ausgabe korrekt
		Person p1 = new Person("Elisabeth", "Krenn");
		System.out.println(p1);
	}

}
