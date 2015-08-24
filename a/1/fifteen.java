/*

Write a program to read an integer and reverse it.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class fifteen {

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		int rev = 0;

		while(num != 0){
			rev *= 10;
			rev += num % 10;

			num /= 10;
		}

		System.out.println(rev);	
	}
}