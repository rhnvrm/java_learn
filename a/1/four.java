/*

Write a program to find out sum of digits of a given number.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class three {

	public static void main( String [] args )
	{
	    int num, sum;

	    //Scanner
	    Scanner s = new Scanner(System.in);

	    num = s.nextInt();

	    sum = 0;

	    while(num != 0){
	    	//add remainder from num
	    	sum += num % 10;
	    	num /= 10;
	    }
	    System.out.println("The sum of digits of given number is: " + sum);
	}
}