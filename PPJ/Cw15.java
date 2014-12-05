package iRekurencja;
//Funkcje rekurencyjne 1
public class Cw15 {

	public static void main(String agava[])
	{
		zadanie1();
		zadanie3();
	}

	static  void zadanie1()
	{
		//		Zadanie 1

		//		Utwórz dwie wersje (iteracyjn¹ i rekurencyjn¹) funkcji obliczaj¹cej element (o podanym numerze) ci¹gu Fibonacciego,
		//		zdefiniowanego nastêpuj¹co:

		//		Fib(1) = 1, Fib(2) = 2,
		//		Fib(n) = Fib(n-1) + Fib(n-2), dla dowolnego n naturalnego wiêkszego od 2.

		//		Element nr: - 0 1 2 3 4 5 6  7  8  9 
		//		FIBONACCI : 0 1 1 2 3 5 8 13 21 34 55

		//TESTY
		//		System.out.println(fibonacciIteration(45));
		//		System.out.println(fibonacciRecursion(45));
	}

	static int fibonacciIteration(int element)
	{	
		int total = 0;
		int nMinus1 = 1;
		int nMinus2 = 2;

		if(element == 1)
			return 1;
		else if(element == 2)
			return 2;
		else if(element > 2)
		{
			for (int i = 3; i <= element; i++)
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

	public static int fibonacciRecursion(int element)
	{
		int total = 0;

		if(element == 1)
			return 1;
		else if(element == 2)
			return 2;
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

	static void zadanie2()
	{
		//		Zadanie 2

		//		Utwórz funkcjê obliczajac¹ pole powierzchni wielok¹ta wypuk³ego na p³aszczyŸnie,
		//		wykorzystuj¹c technikê dzielenia wielok¹ta na trójk¹ty.
		//		Jako argumenty funkcja przyjmuje wspó³rzêdne wszystkich wierzcho³ków wielok¹ta.
		//		Wykorzystaj rekurencjê i fakt, ¿e trójk¹t z wierzcho³kami o wspó³rzêdnych (x1, y1), (x2, y2), (x3, y3)
		//		ma pole okreœlone wzorem: |x1y2 + x2y3 + x3y1 - y1x2 - y2x3 - y3x1|/2.

	}

	static void zadanie3()
	{
		//Zadanie 3

		//		Utwórz program wyœwietlaj¹cy na konsoli wszystkie permutacje podanego zestawu (parami ró¿nych) znaków,
		//		dostarczonego jako tablicê elementów typu char.

		char[] daps = {'a', 'b'};

		permutacje(daps);
	}

	static void permutacje(char[] whizz)
	{
		System.out.println("wbijamy do mutacji\n");
		String set = new String(whizz);
		//System.out.println(set);
		mutuj("", set, 0);
	}

	public static void mutuj(String poczatek, String koniec, int glebokosc)
	{
		for (int i = 0; i < glebokosc; i++) {
			System.out.print(" ");	
		}

		System.out.println("Wywolaj mutuj z parametrami poczatek: " + poczatek +", koniec: " + koniec+"\n");
		glebokosc += 1;

		for (int i = 0; i < glebokosc; i++) {
			System.out.print(" ");	
		}

		if(koniec.length() == 0)
		{
			

			//			ESENCJA PROGRAMU
			System.out.print("koniec == 0 , wypisz zmienna poczatek: ");
			//			System.out.println((String)(poczatek + koniec));
			//			do spróbowania - czy bedzie ró¿nica
			System.out.println(poczatek + "\n");
			//			KONIEC ESENCJI

			for (int i = 0; i < glebokosc; i++) {
				System.out.print(" ");	
			}
			System.out.println("Wypisa³em permutacje i wWypadam z mutuj z parametrami poczatek: " + poczatek +", koniec: " + koniec+"\n");
		}
		else
		{
			for(int g = 0; g < koniec.length(); g++)
			{
				String nastepny = poczatek + koniec.charAt(g);
				
//				NIE ROZUMIEM LINIJK PONI¯EJ
				String reszta =koniec.substring(0, g) + koniec.substring(g + 1);

				mutuj(nastepny, reszta, glebokosc);
				
				for (int i = 0; i < glebokosc; i++) {
					System.out.print(" ");	
				}
				System.out.println("Wypadam z mutuj z parametrami poczatek: " + poczatek +", koniec: " + koniec + "\n");
			}
		}
		
	

	}

}
