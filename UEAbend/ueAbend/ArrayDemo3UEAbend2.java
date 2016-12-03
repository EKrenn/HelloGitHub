package ueAbend;

public class ArrayDemo3UEAbend2 {

	public static void main(String[] args) {
		int[] numbers = {5,6,3,8,2};
		printArray(numbers);
		

	}
	public static void printArray(int[] numbers)
	{
		for(int search = 0; search < numbers.length; search++)
		{
			System.out.print(numbers[search] + ", ");
			/*
			if(search < numbers.length)
			{	
				System.out.print(numbers[search] + ", ");
				search++;
			}
			
			else if(search == numbers.length)
			{
				System.out.print(numbers[search]);
			}
			*/
			
			
		}
	}

}
