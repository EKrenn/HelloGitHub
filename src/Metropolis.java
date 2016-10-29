
public class Metropolis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = isMetropolis(true, 1_000, 100);
		
		if (result) // da boolscher Wert, braucht man == true nicht anhängen
		{
			System.out.println("Coole Stadt");
		}
		else
		{
			System.out.println("Vorstadtprovinz");
		}

	}
	
	public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth)
	{
		double taxes = inhabitants * taxPerPersonAndMonth * 12;
		//		 Variante 1:
		 if(inhabitants > 100000  && isCapital == true || inhabitants > 200000 && taxes > 720000000)
		{
			return true;
		}
		else 
		{
			return false; 
		}
		
		/* Variante 2:
		boolean resultA = isCapital && inhabitants > 100000;
		boolean resultB = taxes > 720000000 && inhabitants > 200_000;
		
		return resultA || resultB;
		*/
	}

}
