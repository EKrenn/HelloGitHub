
public class ArrayDemoUEAbend2 {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,99,87,90};
		int n = 80;
		
		System.out.println(containsNumber(numbers, n));
		

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
