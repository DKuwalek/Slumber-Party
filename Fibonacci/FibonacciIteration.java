public class FibonacciIteration{

	public static void main(String bongo[])
	{
		System.out.println(fibonacciIteration(19));
	}
	
	public static int fibonacciIteration(int element)
	{	
		int total = 0;
		int nMinus1 = 0;
		int nMinus2 = 1;
		
		if(element == 0)
			return 0;
		else if(element == 1)
			return 1;
		else if(element > 1)
		{
			for (int i = 2; i <= element; i++)
			{
				total = nMinus1 + nMinus2;
				
				nMinus1 = nMinus2;
				nMinus2 = total;
			}
			
			if(total < 0)
			{	
				System.out.print("Beep bop beep OUT OF INT RANGE ");
				return -1;
			}	
			else
				return total;
		}
		else
		{
			 System.out.print("Beep boop bap PASSED ARGUMENT ERROR ");	
			 return -1;
		}
				
	}

}