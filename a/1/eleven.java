/*

Write a program to find out the L.C.M. and H.C.F. of two numbers.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class four {

	public static int hcf(int a, int b){
		if (b == 0) {
			return a;
		}
		else {
			return hcf(b, a % b);
		}
		//return -1;
	}

	public static int lcm(int a, int b){
		
		return (a*b)/hcf(a,b);
	}

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