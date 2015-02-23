package Rozdzia³1;

public class Vector 
{

	//	Fields

	//		int dimension;
	double[] vectorValues = new double[5];

	//	Constructors

	Vector(double[] doubleArr)
	{
		this.vectorValues = doubleArr;
	}

	public Vector(int newDimension) 
	{
		this.vectorValues = new double[newDimension];
	}

	public Vector() {
	}

	//	Methods


	//	4. method get returning the i-th element of the vector,
	double get(int i)
	{
		System.out.println("returning " + i + "th element:" + this.vectorValues[i]);
		return this.vectorValues[i];
	}

	//	5. a method set setting the i-th element of the vector to the given value,
	void set(int i, double newValue)
	{
		//		System.out.println("setting the "+ i + "th element to: " + newValue);
		this.vectorValues[i] = newValue;
	}

	//	6. a method max returning the maximal element of the vector,
	double max()
	{
		//		System.out.println("Returning a maximal element of the vector");

		double max = this.vectorValues[0];

		for (int i = 0; i < vectorValues.length; i++) 
		{
			if(max < this.vectorValues[i])
				max = this.vectorValues[i];
		}

		return max;
	}
	//	7. a method min returning the minimal element of the vector,
	double min()
	{
		double min = this.vectorValues[0];

		for (int i = 0; i < vectorValues.length; i++) {
			if(min > this.vectorValues[i])
				min = this.vectorValues[i];
		}
		//		System.out.println("returning minimal element of the method");

		return min;
	}

	//	8. a method size returning the number of elements of the vector,

	int size()
	{
		System.out.println("Returning number of elements of the vector");
		return this.vectorValues.length;
	}


	//	9.  method add returning the vector being the sum of two vectors
	public Vector add(Vector added)
	{
		Vector resultVector = new Vector();

		for (int i = 0; i < vectorValues.length; i++) 
		{
			resultVector.vectorValues[i] = this.vectorValues[i] + added.vectorValues[i];
		}

		return resultVector;
	}
	//	10. method toString returning the string describing elements of the vector
	public String toString()
	{
		String vectorString = "";

		for (int i = 0; i < this.vectorValues.length; i++) 
		{
			vectorString += this.vectorValues[i] + " ";
		}

		return vectorString;
	}
	//	11. static method show(double[]) printing elements of the array passed as the argument in one line at the command prompt 
	static void show(double[] array)
	{
		//  String showResult = "";

		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	//	12. method sort returning the vector sorted in ascending or descending order (depending on an argument)

	void sort(String s)
	{

		//case when compareIgnore case is true
		//it resut in an int and gives 0 if all good
		if(s.compareToIgnoreCase("asc") == 0)
		{
			System.out.println("ascending sortin, boom!");
			this.insertionSortAsc();
		}
		else if(s.compareToIgnoreCase("desc") == 0)
		{
			System.out.println("descendn sortin, ayo!");
			this.insertionSortDesc();
		}
		else
			System.out.println("Something wrong in sort method");

	}

	// The method increase called below 
	// increases the value of each element of the given vector (here v1)
	// by the given value (here 1)
	// until their sum exceeds specified value (here 5)

	static void increase(Vector increased, int increaseStep, int increaseLimit)
	{
		int startingSum = 0;

		for (int i = 0; i < increased.vectorValues.length; i++)
		{
			startingSum += increased.vectorValues[i];
		}
		//	got the starting sum

		int index = 0;
		while(startingSum <= increaseLimit)
		{
			increased.vectorValues[index] += increaseStep;
			index = (index+1)%6;
			startingSum++;
		}
	}

	void moduloTest()
	{
		//		this loop gets values from 0 to 5
		for (int i = 0; i < 20; i++)
		{
			System.out.println(i%6);
		}
	}

	void insertionSortAsc()
	{
		double x;
		
		int j;
		
		for (int i = 0; i < vectorValues.length; i++)
		{
			x = this.vectorValues[i];
			
			j = i;
			while(j > 0 && this.vectorValues[j-1] > x)
			{
				this.vectorValues[j] = this.vectorValues[j-1];
				j = j - 1;
			}
			this.vectorValues[j] = x;			
		}		
	}
	
	void insertionSortDesc()
	{
		double x;
		
		int j;
		
		for (int i = 0; i < vectorValues.length; i++)
		{
			x = this.vectorValues[i];
			
			j = i;
			while(j > 0 && this.vectorValues[j-1] <= x)
			{
				this.vectorValues[j] = this.vectorValues[j-1];
				j = j - 1;
			}
			this.vectorValues[j] = x;			
		}
		
		
	}
}
