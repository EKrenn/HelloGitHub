
public class ArrayDemo2UEAbend2 {

	public static void main(String[] args) {
		int[] numbers = {1,3,1,3};
		System.out.println(calculateSum(numbers));

	}
	public static int calculateSum(int[] numbers)
	{
		int summe =0;
		for(int suchVar = 0; suchVar < numbers.length; suchVar++)
		{
			summe = summe + numbers[suchVar];
		}
		return summe;
		
	}

}
