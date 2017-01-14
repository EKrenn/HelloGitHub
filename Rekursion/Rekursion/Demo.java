package Rekursion;

public class Demo {
	
	public static void main(String[] args)
	{
		int sum = recursiveSum(5);
		int mul = recursiveMul(9);
		int fib = fibonacci(8);
		System.out.println(fib);
		System.out.println(mul);
	}
	
	public static int recursiveSum(int n)
	{
		if (n== 0)
		{
			return 0;
		}
		return recursiveSum(n-1) + n;
	}
	
	public static int recursiveMul(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		return recursiveMul(n-1) * n;
	}
	
	public static int fibonacci(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else if(n < 2)
		{
			return 1;
		}
		else return fibonacci(n-1) + fibonacci(n-2);
		
		/* macht das gleiche wie oben
		if(n < 2 && != 0)
		{
			return 1;
		}
		else if (n == 0)
		{
			return 0;
		}
		else return fibonacci(n-1) + fibonacci(n-2);
		*/
	}
}
