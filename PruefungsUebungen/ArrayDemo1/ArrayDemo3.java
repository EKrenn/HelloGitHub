package ArrayDemo1;

public class ArrayDemo3 {
	public static void main(String[] args) {
		int[] array = {2,3,4,5,6,2,3,4,5,6};
		bildeSumme(array);
		System.out.println(containsNumber(array, 3));
	}
	
	
	
	public static int bildeSumme(int[] array)
	{
		int ausgabe = 0;
		for(int i = 0; i < array.length; i++)
		{
			ausgabe = ausgabe + array[i];
		}
		System.out.println(ausgabe);
		return ausgabe;
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
	

}
