
public class Matrix {

	public static void main(String[] args) {
		//System.out.println(generateIdentityMatrix(4));
		generateIdentityMatrix(4);
		
		
	}
	/*
	public static double [][] generateIdentityMatrix(int size)
	{
		double[][] result = new double[size][size];
		int zeile;
		int spalte;
		for (zeile = 0; zeile < size; zeile++)
		{
			
			// Abfrage wenn zeile gleich 0
			if (zeile == 0)
			{
				// Zeilen-Ausgabe, wenn Array hat [0][0], dann Wert 1 setzen
				result[zeile][zeile] = 1;
				System.out.print(result[zeile][zeile] + " ");
				
			}
			else
			{
				// Zeilen-Ausgabe, wenn Array hat [0][1], [0][2], ..., dann Wert 0 setzen
				result[zeile][zeile] = 0;
				System.out.print(result[zeile][zeile] + " ");
			}
			System.out.println();
			for (spalte = 0; spalte < size; spalte++)
			{
							
				// Abfrage wenn zeile gleich 0
				if (spalte == 0)
				{
					// Zeilen-Ausgabe, wenn Array hat [0][0], dann Wert 1 setzen
					result[zeile][spalte] = 1;
					System.out.print(result[zeile][spalte] + " ");
					
				}
				else
				{
					// Zeilen-Ausgabe, wenn Array hat [0][1], [0][2], ..., dann Wert 0 setzen
					result[zeile][spalte] = 0;
					System.out.print(result[zeile][spalte] + " ");
				}	
			}
		}
		return result;
	}

	*/
	
	//Lösung
	
	public static double [][] generateIdentityMatrix(int size)
	{
		double[][] result = new double[size][size];
		int zeile;
		int spalte;
		for (zeile = 0; zeile < size; zeile++)
		{
			result[zeile][zeile] = 1.0;
			for(spalte = 0; spalte < size; spalte ++)
			{
				System.out.print(result[zeile][spalte] + "\t");
			}
			System.out.println();
			
		}
		return result;
	}
	
}
