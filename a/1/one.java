/*

Write a program that reads three edges for a triangle and determines whether the input is
valid. The input is valid if the sum of any two edges is greater than the third edge.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class one {

	public static void main( String [] args )
	{
	    // Input edge lengths of a b c
	    int a,b,c;

	    //Scanner
	    Scanner s = new Scanner(System.in);

	    a = s.nextInt();
	    b = s.nextInt();
	    c = s.nextInt();

	    //Calculate sums
	    int x = a + b;
	    int y = b + c;
	    int z = c + a;

	    if(x > c && y > a && z > b){
	    	System.out.println("The input was valid!");
	    }
	    else{
	    	System.out.println("The input was invalid!");
	    }
	}
}