import java.util.ArrayList;
import java.util.List;

public class ArrayUebung {

	
	static List<String> wochentage = new ArrayList<String>();
	 static List<String> monate = new ArrayList<String>();
	static List<Integer> tage=new ArrayList<Integer>();

	
	public static void main(String[] args) {
	
	// TODO Auto-generated method stub


	tage.add(27);
	tage.add(28);
	tage.add(29);
	
	
	tage.add(30);
	tage.add(31);
	
		
		
		
		
		
		
		
	monate.add("Januar");	
	monate.add("Februar");	
	monate.add("März");	
	monate.add("April");	
	monate.add("Mai");	
	monate.add("Juni");	
	monate.add("Juli");	
	monate.add("August");	
	monate.add("September");	
	monate.add("Oktober");	
	monate.add("November");	
	monate.add("Dezember");	
		
		
    wochentage.add("Montag");
	wochentage.add("Dienstag");
	wochentage.add("Mittwoch");
	wochentage.add("Donnerstag");
	wochentage.add("Freitag");
	wochentage.add("Samstag");
	wochentage.add("Sonntag");
	
	monatstage();
	
                                              
	
}
	

	public static void wochentage(){
	
	
		
		wochentage.set(4, "NochnichtFreitag");
		System.out.println(wochentage.get(4));
		
	}
	
	
	
	public static void alleWochentage()
	{
			System.out.println(wochentage);
		
	}
	
	
	
	public static void monatstage()
	{
		
	
		System.out.println("Der Monat " + monate.get(0) + " hat genau "+ tage.get(4) +"  Tage");
		
		
		
		
	}
	
	
	
	}
	
	
	
	

