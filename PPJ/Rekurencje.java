import java.util.ArrayList;


public class Rekurencje {
       
	static void permutacjaRek(char tab[],char generated[],int depth)
	{
		boolean found;
		if(depth>=tab.length)
		{
			for(int i=0;i<generated.length;i++)
				System.out.print(generated[i]+" ");
			
			System.out.println();
			
		}
		for(int i=0; i<tab.length; i++){
			found=false;
			for(int j=0;j<depth;j++)
			{
				if(tab[i]==generated[j])
				{
					found=true;
					break;
				}
			}
			if(!found)
			{
				generated[depth]=tab[i];
				permutacjaRek(tab,generated,depth+1);
			}
			
		}
		
	}
	
	static void permutacja(char tab[])
	{
		char generated[]=new char[tab.length];
		permutacjaRek(tab, generated,0);
	}  
	
	
	
	static boolean czyPalindrom(String palindrom){
		if(palindrom.length()<=1) // warunek zakonczenia rekurencji 
			return true;
		if(palindrom.charAt(0)==palindrom.charAt(palindrom.length()-1))
		{
			return czyPalindrom(palindrom.substring(1, palindrom.length()-1));
			
		}
		else 
			return false;
		
	}
	
	static void reverse (char tab[]){
		char pom;
		for(int i=0; i<tab.length/2;i++){
			pom=tab[i];
			tab[i]=tab[tab.length-1-i];
			tab[tab.length-1-i]=pom;
			System.out.println(tab);
			
		}
		
	}
	
	static String reverseRek (String tab ) {
		
		if(tab.length()<=1){
			return tab;
			}
		return tab.charAt(tab.length()-1)+reverseRek(tab.substring(1,tab.length()-1))+tab.charAt(0);		
	}
	
	static double poleT(double x[], double y[], double z[]){
		return  Math.abs(x[0]*y[1] + y[0]*z[1] + z[0]*x[1]-x[1]*y[0] - y[1]*z[0] -z[1]*x[0])/2;
		
		
	}
	
	static double poleW(ArrayList<double []>wielokat){
		if(wielokat.size()<3){
			return 0;
		}
		double polet=poleT(wielokat.get(0),wielokat.get(1),wielokat.get(2) );
//		if(wielokat.size()==3){ //warunek zakonczenia rekurencji 
//	    	return polet;
//	    }	
		wielokat.remove(1);
		return polet+ poleW(wielokat);
	}
	
	public static void main(String[] args) {
		char test[] = (new String("abcd")).toCharArray();
		permutacja(test);
		
		System.out.println(czyPalindrom("kajak"));
		System.out.println(czyPalindrom("kaasdjak"));
		
		char test2[] = (new String("abcdabcd")).toCharArray();
		reverse(test2);
		
		System.out.println(test2);
		System.out.println(reverseRek("alamakota"));
		
		
		ArrayList<double[]> wielokat=new ArrayList<double[]>(); 
		for(int i=0;i<10;i++) //losowo generuje 10 punkow i dodaje do listy
		{
			double point[]=new double[2];
			point[0]=Math.random()*10;
			point[1]=Math.random()*10;
			wielokat.add(point); //dodajemy punkty do listy
		}
		for(int i=0;i<wielokat.size();i++)
			
			System.out.println(wielokat.get(i)[0]+" "+wielokat.get(i)[1]); //pobieramy punkty z listy 
		
		
		System.out.println("pole to: "+ poleW(wielokat));
		
	}

}
