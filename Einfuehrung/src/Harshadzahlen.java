
public class Harshadzahlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Harshad();
		
	}

	public static void Harshad() {
        
            	
            	
        int max = 100;
        
        for (int i = 1; i <= max; i++) {
            int a = 0;
            int b = i;
 
            while (b > 0) { 
                a = a + b % 10;
                b = b / 10;
            }
 
            if (i % a == 0) {
                System.out.println(i);
            }
        }
            
            
            
 
        
            
            
            
            
            }
        }	
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

