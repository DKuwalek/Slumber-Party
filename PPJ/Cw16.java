package iRekurencja;

//Funkcje rekurencyjne 2

public class Cw16 {

	public static void main(String[] sgra)
	{
//		zadanie1();
//		zadanie2();
		zadanie3();
	}

	static void zadanie1()
	{
		//		Zadanie 1 (1p)
		//		Utwórz funkcjê obliczaj¹c¹ rekurencyjnie wartoœæ silni.
		System.out.println("wynik silni" + silnia(5));
	}

	static int silnia(int liczba)
	{
		if(liczba <=1)
			return 1;
		else 
			return liczba * silnia(liczba -1);			
	}


	static void zadanie2()
	{
//	Zadanie 2 (1p)

//	Utwórz funkcjê, która rekurencyjnie odwróci ci¹g znaków (podany w postaci tablicy elementów typu char).
		
//		public static String reverseOf( String s ) {
//
//		      if (s.length == 0)
//		         { return s; }
//		      else {
//		         int n = s.length;
//		         return s.charAt(n-1) + reverseOf( s.substring(0, n-1) );
//		      }
//		   }  
	}
	 
	
	static void zadanie3()
	{
//		Zadanie 3 (1p)

//		Utwórz funkcjê,
//		która rekurencyjnie sprawdzi czy znaki (od pierwszego do ostatniego)
//		niepustej tablicy elementów typu char tworz¹ palindrom.
		
		String s = "dad";
		
		System.out.println(isPalindrome(s, 0, s.length()-1));
	}
	public static boolean isPalindrome(String str,int low, int high)
	{
		if(high <= low)
	        return true;
		else if (str.charAt(low)!= str.charAt(high))
	        return false;
	    else
			return isPalindrome(str,low+1,high-1);
	   }

}
