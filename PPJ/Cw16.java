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
		//		Utw�rz funkcj� obliczaj�c� rekurencyjnie warto�� silni.
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

	Utw�rz funkcj�, kt�ra rekurencyjnie odwr�ci ci�g znak�w (podany w postaci tablicy element�w typu char).

//	Zadanie 3 (1p)

	Utw�rz funkcj�,
	kt�ra rekurencyjnie sprawdzi czy znaki (od pierwszego do ostatniego) niepustej tablicy element�w typu char tworz� palindrom.
	 */
}
