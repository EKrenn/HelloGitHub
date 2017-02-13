package Pruefungsbeispiel;

public class ArrayHelper {

	public static void main(String[] args) {
		int[] n = {8,59,91,90,40,4};
		arrangeOrder(n);
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + "\t");
		}
	}
	
	public static void arrangeOrder(int[] numbers)
	{
		/* Variante 1 
		for(int i = 0; i < numbers.length -1; i ++)
		{
			int aktuell = numbers[i];
			int nachbar = numbers[i+1];
			
			if(aktuell > nachbar)
			{
				numbers[i] = nachbar;
				numbers[i+1] = aktuell;
				arrangeOrder(numbers);
			}
		}
		*/
		
		// Variante 2
		boolean b = true;
		while(b)
		{
			b = false;
			for(int i = 0; i < numbers.length -1; i ++)
			{
				int aktuell = numbers[i];
				int nachbar = numbers[i+1];
				
				if(aktuell > nachbar)
				{
					numbers[i] = nachbar;
					numbers[i+1] = aktuell;
					b = true;
				}
			}
		}
		
	}

}
