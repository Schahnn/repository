

public class PasswortChecker {
  
 static int length = 7;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	passwortchecker("PAssworT");
	
	
	}

	public static void passwortchecker(String test) {
		
		System.out.println(test);
		char[] charArray = test.toCharArray();
		System.out.println(charArray[2]);
		System.out.println();
		
		
		for (int i= 0; i< charArray.length ; i++ )
		{
			//System.out.println(charArray[i]);
			if(Character.isUpperCase(charArray[i]))
			{
				System.out.println(charArray[i] +"ist ein Gro�buchstabe!");
				
			}else 
			{
				System.out.println(charArray[i] +"ist kein Gro�buchstabe!");
			}
			
		
		if (Character.isDigit(charArray[i]))
		{
			System.out.println(charArray[i] +"ist eine Zahl!");
		}
		else {
			
			System.out.println(charArray[i] +"ist keine Zahl!");
		}
			
		
		

		if (Character.isLetterOrDigit(charArray[i]))
		{
			System.out.println(charArray[i] +"ist kein Sonderzeichen!");
		}
		else {
			
			System.out.println(charArray[i] +"ist ein Sonderzeichen!");
		}
		
		
		
		
		
     
		
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
