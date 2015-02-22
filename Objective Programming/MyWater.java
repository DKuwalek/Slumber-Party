package Rozdzia³1;

public class MyWater
{
	//	Exercise 1. Water 

	//	Let us assume we collect mineral water.
	//	There are three types of bottles:
	//		with the capacity of 2 l (big ones),
	//		1 l (medium)
	//		and 0.5 l (small ones). 
	//	Create a class MyWater supplying the following methods:


	//	fields
	static double 	big = 2.0,
			medium = 1.0,
			small = 0.5;

	static String[] capacitiesNames = {"big", "medium", "small"};
	static double[] capacitiesValues = {big, medium, small};

	//	capacities fields
	private int	bigCount,
	mediumCount,
	smallCount;

	//	counter fields
	private static int 	modificationCount;
	private int	numberOfModification = ++modificationCount;


	//	total water gathered fields
	private double 	waterInStock; 
	/*
	//this doesnt seem to work
							= bigCount * big +
							mediumCount * medium +
							smallCount * small;
	 */
	//	constructors

	public MyWater()
	{

	}

	//	methods

	public static void main(String[] boraBora)
	{
		MyWaterTests();
	}

	static void MyWaterTests()
	{
		MyWater waterStore = new MyWater();
		waterStore = new MyWater();
		waterStore = new MyWater();

		//		waterStore.reportCapacities();

		waterStore.addLarge(2);
		waterStore.addMedium(5);
		waterStore.addSmall(11);

		//		waterStore.reportLarge();
		//		waterStore.reportMedium();
		//		waterStore.reportSmall();

		MyWater howAboutWater = new MyWater();
		howAboutWater.addLarge(5);
//		howAboutWater.reportTotalGathered();

		//		waterStore.showObjectCounter();
		//		waterStore.showObjectCounter();
		//		howAboutWater.showObjectCounter();
		//		System.out.println(howAboutWater.numberOfModification + " " + howAboutWater.modificationCount);
	
		waterStore.modifyCapacity(2.0 , 10.0);
		waterStore.modifyCapacity(1.0, 5.0);
		waterStore.modifyCapacity(0.5, 4.0);
		waterStore.modifyCapacity(10.0, 9.0);
//		waterStore.reportCapacities();


//		waterStore.reportTotalGathered();

		System.out.println("Size of big" + MyWater.big);
	}

	//	adding a given number of big bottles to the stock of water, 
	void addLarge(int i)
	{
		this.waterInStock += (i * big);
		this.bigCount += i;
		//		this.modificationCount
	}

	//	adding a given number of medium bottles to the stock, 
	void addMedium(int i)
	{
		this.waterInStock += (i * medium);
		this.mediumCount += i;
	}

	//	adding a given number of small bottles to the stock. 
	void addSmall(int i)
	{
		this.waterInStock += (i * small);
		this.smallCount += i;
	}

	//	Reporters

	int reportLarge()
	{
		System.out.println("Big bottles: " + this.bigCount);
		return this.bigCount;
	}

	int reportMedium()
	{
		System.out.println("Medium bottles: " + this.mediumCount);
		return this.mediumCount;
	}

	int reportSmall()
	{
		System.out.println("Small bottles: " + this.smallCount);
		return this.smallCount;
	}

	double reportTotalGathered()
	{
		System.out.println("We have got " + this.waterInStock + "liters of water in stock");
		System.out.println("big bottles: " + this.bigCount);
		System.out.println("medium bottles: " + this.mediumCount);
		System.out.println("small bottles: " + this.smallCount);
		return this.waterInStock;
	}

	void reportCapacities()
	{
		System.out.println("Possible capacities:");

		for(int i = 0; i < MyWater.capacitiesNames.length; i++)
		{
			System.out.println("\t- " + MyWater.capacitiesNames[i] +
					", with capacity: " + MyWater.capacitiesValues[i]);
		}
	}

	void modifyCapacity(double current, double updated)
	{
		if(current == updated)
			System.out.println("No change needed");
		//		jeœli zmieniamy big i jest to rozmiar najwiêkszy
		//		to wszystko siê zgadza i zmieniamy
		else if(current == big && updated > MyWater.medium && updated > MyWater.small)
		{
			
			System.out.println("Changing biggest size from: " + current + "to " + updated);
			big = updated;
			capacitiesValues[0] = MyWater.big;
		
//			System.out.println(current + " to " + MyWater.big);
		}
		//		jeœli zmieniamy medium i jest to rozmiar œredni
		//		to wszystko siê zgadza i zmieniamy
		else if(current == medium && updated < big && updated > small)
		{
			System.out.println("Changing medium size from: " + current + "to " + updated);
			medium = updated;
			capacitiesValues[1] = MyWater.medium;
		}
		//		jeœli zmieniamy small i jest to rozmiar najmniejszy
		//		to wszystko siê zgadza i zmieniamy
		else if(current == small && updated < big && updated < medium)
		{
			System.out.println("Changing smallest size from: " + current + "to " + updated);
			small = updated; 
			capacitiesValues[2] = MyWater.small;
		}
		else
		{			
			//			if anything else occurs
			//			things don't fit
			System.out.println("Something went wrong");
			System.out.println("Can not change from " + current + " to " + updated);
			System.out.println("Make sure that\n"
					+ "- you want to change existing value\n"
					+ "- if changing biggest capacity, make sure it is bigger than medium and smallest cap");
		}	

		//		end of changing bottle capacity


	}

	void showObjectCounter()
	{
		System.out.println("Modification count: " + MyWater.modificationCount + " number of modifications " + this.numberOfModification);
	}
}
