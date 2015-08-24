/*

Write a program that prompts the user to enter 
a decimal integer and displays its
corresponding binary value. 
Don’t use Java’s Integer.toBinaryString(int) 
in this program.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class five {

	public static void main( String [] args )
	{
	    double x1, y1, r1, x2, y2, r2;

	    //Scanner
	    Scanner s = new Scanner(System.in);

	    System.out.println("Enter the center coords and radii of circle 1 then circle 2 respectively: ");

		x1 = s.nextDouble();
		y1 = s.nextDouble();
		r1 = s.nextDouble();
		x2 = s.nextDouble();
		y2 = s.nextDouble();
		r2 = s.nextDouble();

		double distance = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);

		if (r2 >= r1 && distance <= (r2 - r1)){
        	System.out.println("Circle 1 is inside Circle 2.");
	    }
	    else if (r1 >= r2 && distance <= (r1 - r2) ) {
	        System.out.println("Circle 2 is inside Circle 1.");
	    }
	    else if (distance > (r1 + r2)){
	        System.out.println("Circle 2 does not overlap Circle 1.");
	    }
	    else {
	        System.out.println("Circle 2 overlaps Circle 1.");
	    }

	}
}