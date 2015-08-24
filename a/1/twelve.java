/*

A solution to find the greatest common divisor of two integers n1 and n2 is as follows: First
find d to be the minimum of n1 and n2, then check whether d, d-1, d-2, 2, or 1 is a divisor for
both n1 and n2 in this order. The first such common divisor is the greatest common divisor
for n1 and n2. Write a program that prompts the user to enter two positive integers and
displays the gcd.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class twelve {

	public static int hcf(int a, int b){

		int min = (a>b)?b:a;

		for(int i = min; i >= 1; i--){
			if(a % i == 0 && b % i == 0){
				return i;
			}
		}

		return -1;

	}

	public static void main( String [] args )
	{
	    int a, b;

	    //Scanner
	    Scanner s = new Scanner(System.in);

	    a = s.nextInt();
	    b = s.nextInt();
  
	    System.out.println("HCF: " + hcf(a,b));

	}
}