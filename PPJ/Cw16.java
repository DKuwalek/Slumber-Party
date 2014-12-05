package iRekurencja;

//Funkcje rekurencyjne 2

public class Cw16 {

	public static void main(String[] sgra)
	{
		zadanie1();
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


	/*
//	Zadanie 2 (1p)

	Utwórz funkcjê, która rekurencyjnie odwróci ci¹g znaków (podany w postaci tablicy elementów typu char).

//	Zadanie 3 (1p)

	Utwórz funkcjê,
	która rekurencyjnie sprawdzi czy znaki (od pierwszego do ostatniego) niepustej tablicy elementów typu char tworz¹ palindrom.
	 */
}
