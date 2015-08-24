/*

Write a program to print ASCII value of all characters.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class two {

	public static void main( String [] args )
	{
		System.out.println("ASCII VALUE CHART");
	    for(int i = 0; i < 256; i++){
	    	System.out.print('(');
			System.out.print((char)i);	    	
			System.out.print(", ");
	    	System.out.print(i);
	    	System.out.print("),   ");

	    	if(i % 10 == 0) System.out.print('\n');
	    }
	    System.out.print('\n');
	}
}