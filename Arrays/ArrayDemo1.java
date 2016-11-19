
public class ArrayDemo1 {

	public static void main(String[] args) {
		int [] array1  = new int[3];
		array1 [0] = 3;
		array1 [1] = 4;
		array1 [2] = 5;
		
		int [] array2 = {7,1,3};
		
		/* Variante 1:
		System.out.println(" + " + (array1[0] + array2[0]) + ", " + (array1[1] + array2[1]) + ", " + (array1[2] + array2[2]));
		System.out.println(" * " + (array1[0] * array2[0]) + ", " + (array1[1] * array2[1]) + ", " + (array1[2] * array2[2]));
		*/
		// Variante 2:
		for(int i =0; i <= 2; i++)
		{
			
			int plus = array1[i] + array2[i];
			System.out.print(" + " + plus + ",");
		}
		System.out.println();
		for(int i =0; i <= 2; i++)
		{
			int mal = array1[i] * array2[i];
			System.out.print(" * " + mal + ",");
		}
		//*/
		
		/* Variante 3 - Ausgabe noch nicht optimal
		int resultPlus = 0;
		int resultMal= 0;
		int[] plus = new int [3];
		int[] mal = new int[3];
		for(int i = 0; i <= 2; i++)
		{
			plus[i] = array1[i] + array2[i];
			resultPlus = plus[i];
			mal[i] = array1[i] * array2[i];
			resultMal = mal[i];
			System.out.print(" + " +plus[i] + ",");
			System.out.println();
			System.out.print(mal[i] + ",");
			
		}
		//System.out.print(plus[0] + ",");
		//System.out.print(resultMal + ",");
		 */

	}

}
