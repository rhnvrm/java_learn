/*

Write a program that prompts the user to enter the center coordinates and radii of two circles
and determines whether the second circle is inside the first or overlaps with the first.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class four {

	public static void main( String [] args )
	{
	    int a, b;

	    //Scanner
	    Scanner s = new Scanner(System.in);

	    a = s.nextInt();
	    b = s.nextInt();
	   
	    System.out.println("LCM: " + lcm(a,b));	   
	    System.out.println("HCF: " + hcf(a,b));

	}
}