import java.util.HashMap;
import java.util.Map;

public class HashDemo {

	public static void main(String[] args) {
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		
		//f�gt dem Bezirk (Key) die Einwohneranzahl (Value) hinzu
		myMap.put("Voitsberg", 5000);
		myMap.put("Graz", 658739);
		myMap.put("Leibnitz", 34278);
		
		//liefert den Value f�r den Key retour
		Integer ew = myMap.get("Graz");
		System.out.println(ew);
		
		// Werte werden �berschrieben mittels put
		myMap.put("Graz", 300_000);
		System.out.println(myMap);
		
		// Werte zusammenz�hlen
		Integer aktMap = myMap.get("Voitsberg");
		if(aktMap != null)
		{
			Integer newMap = aktMap + 500;
			myMap.put("Voitsberg", newMap);
			System.out.println(myMap);
		}
		

	}

}
