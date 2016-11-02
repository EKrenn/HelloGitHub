
public class TurmRechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eingabe = 6;
		
		
			for(int zahl = 2;zahl <= 9; zahl ++)
			{
				System.out.println(eingabe + " x " + zahl);
				eingabe = eingabe * zahl; 
				if (zahl == 9)
				{
					zahl = 2;
					do
					{
						System.out.println(eingabe + " / " + zahl);
						eingabe = eingabe / zahl;
						zahl++;
					}
					while (zahl <= 9);
					System.out.println(eingabe);
					
				}
			}
		

	}

}
