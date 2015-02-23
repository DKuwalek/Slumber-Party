package Rozdzia³1;

public class VectorTests {

	// here goes the method increase

	public static void main(String[] args) {


		double[] d = { 1, 2, -7, 3, 4 };
		Vector v1 = new Vector(d);
		Vector v2 = new Vector(5);
		v2.set(1, 12);
		v2.set(3, -1);
		System.out.println(
				v1.min() + " " + v1.max() + " "
						+ v2.min() + " " + v2.max()
				);
		//		System.out.println(v1);
		//		System.out.println(v2);
		System.out.println();

		//	Result: 
		//
		//	-7.0 4.0 -1.0 12.0 

		/*---------------------------------------------------*/


		Vector v3 = v1.add(v2);
		Vector.show(d);
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());

		// The method increase called below 
		// increases the value of each element of the given vector (here v1)
		// by the given value (here 1)
		// until their sum exceeds specified value (here 5)
			Vector.increase(v1, 1, 5);
			System.out.println("Now v1 = " + v1);


		/*------------------------------------------------------*/


		// v4 and v5 denote objects of the class Vector
		// ...
		//	try {
		//	    v4 = new Vector("2 7 a one z");
		//	    v5 = new Vector("      ");
		//	} catch (IllegalArgumentException exc) {
		//	    System.out.println(exc.toString());
		//	}
//			v5 = v4.sort("Asc");  // sort in ascending order			
			System.out.println(v1);
//			double[] dArr = {7.0, 2.0, 1.0};
//			v1.vectorValues = dArr;
			v1.insertionSortAsc();// sort in ascending order
			System.out.println(v1);
			v1.insertionSortDesc();// sort in ascending order
			System.out.println(v1);
		//	System.out.println(v4.toString());
		//	System.out.println(v5.toString());
		//	v5 = v4.sort("DESC"); // sort in descending order
		//	System.out.println(v5.toString());
	
//		v1.moduloTest();
			
			System.out.println((int)('a'-87));
	}
}
