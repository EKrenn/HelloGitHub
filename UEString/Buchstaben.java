
public class Buchstaben {

	public static void main(String[] args) {
		String eingabe = "Wörter starten mit Großbuchstaben";
		int pos;
		String result = "";
		
		for(int i = 0; i < eingabe.length(); i++)
		{
			char c = eingabe.charAt(i);
			
			if(eingabe.charAt(i -1) == ' ')
			{
				c = Character.toUpperCase(c);
				//System.out.println("Eingabe an Pos: " + eingabe.toUpperCase(i + 1));
				//pos = Character.toUpperCase(i + 1);
				//eingabe.charAt(pos);
			}
			result += c;
			
			
			//System.out.println(eingabe);
		}

	}

}
