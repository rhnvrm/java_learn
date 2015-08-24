/*

Write a program that prompts the user to enter 
a decimal integer and displays its
corresponding binary value. 
Don’t use Java’s Integer.toBinaryString(int) 
in this program.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class six {

	public static int convert(int dec)
	{
	    if (dec == 0)
	    {
	        return 0;
	    }
	    else
	    {
	        return (dec % 2 + 10 * convert(dec / 2));
	    }
	}

	public static void main( String [] args )
	{
	    int num;

	    Scanner s = new Scanner(System.in);

	    num = s.nextInt();

	    System.out.println("Binary: " + convert(num));

	}
}