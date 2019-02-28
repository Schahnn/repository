
public class Uebung
{
String beliebigerString;
static int x = 1;
static int a = 5;
static int ergebnis= a*x;
static float Kommazahl= 4.5f ;
static String text ="Das Ergebnis ist zu klein "; 
static int ende = 8;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ungerade();

	}
public static void rechenspiele()
{
	ergebnis = a*x;
	System.out.println(ergebnis);
	if(ergebnis< Kommazahl)
	{
		System.out.println(text);
	}
	else
	{
		System.out.println(ergebnis-Kommazahl);
	}
	
}

public static void ungerade()
{
for(int i=1; i<ende; i=2+i )
{
	System.out.println(i);
}
}

public static void fibonaccifolge()
{
	
	
}


}
