public class FibonacciRecursion
{
	public static int fibonacciRecursion(int element)
	{
		int total = 0;
		
		if(element == 0)
			return 0;
		else if(element == 1)
			return 1;
		else if(element > 1 && element <= 45)
		{
			total = fibonacciRecursion(element - 1) + fibonacciRecursion(element - 2);	
			if(total < 0)
				return -1;
			else
				return total;
		}
		else
			return -1;
	}

}