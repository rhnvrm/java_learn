/*

Write a program that prompts the user to enter a 
decimal integer and displays its
corresponding hexadecimal value. 
Don’t use Java’s Integer.toHexString(int) in this
program.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class seven {

	public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }       
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
      
        return reverse;
	}

	public static String convert(int dec)
	{
	    String hex = "";

	    while(dec != 0){

	    	int remainder = dec % 16;
	    	if(remainder > 9){
	    		char x='e';
	    		remainder -= 10;
	    		switch(remainder){
	    			case 0: 
	    				x = 'A';
	    				break;
	    			case 1: 
	    				x = 'B';
	    				break;
	    			case 2: 
	    				x = 'C';
	    				break;
	    			case 3: 
	    				x = 'D';
	    				break;	    				
	    			case 4: 
	    				x = 'E';
	    				break;	    				
	    			case 5: 
	    				x = 'F';
	    				break;		    				
	    		}

	    		hex += x;


	    	}
	    	else{
				hex += (char)(remainder + 48);
	    	}
	    	dec /= 16;
	    }
	    return reverse(hex);
	}

	public static void main( String [] args )
	{
	    int num;

	    Scanner s = new Scanner(System.in);

	    num = s.nextInt();

	    System.out.println("Hex: " + convert(num));

	}
}