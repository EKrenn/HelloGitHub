package ArrayDemo1;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] array = {2,3,4,5};
		//System.out.println(containsNumber(array, 4));
		//System.out.println(calculateSum(array));
		//printArray(array);
		System.out.println(reverse(array));
		

	}
	public static boolean containsNumber(int[] numbers, int n)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] == n)
			{
				return true;
			}
		}
		return false;
	}
	
	public static int calculateSum(int[] numbers)
	{
		int ausgabe = 0;
		for(int i = 0; i < numbers.length; i ++)
		{
			ausgabe = ausgabe + numbers[i];
		}
		return ausgabe;
	}
	
	public static void printArray(int[] numbers)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			if(i != numbers.length-1)
				System.out.print(numbers[i] + ", ");
			else
				System.out.println(numbers[i]);
		}
	}
	
	public static int[] reverse(int[] original)
	{
		int[] ausgabe = new int[original.length];
		for(int i = 0; i < original.length; i ++)
		{
			System.out.print("Original: " + original[i] + "\t");
			//System.out.println();
			ausgabe[ausgabe.length - i -1] = original[i];
			System.out.print("Ausgabe: " + ausgabe[ausgabe.length -i -1] + "\t");
			
			
		}
		return ausgabe;
			
		
	}
			

}
