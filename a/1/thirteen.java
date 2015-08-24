/*

Write a program to determine input the marks of n students in a subject and determine the
frequency count of marks obtained i.e. how many students obtained 100, how many 99, how
many 98 and so on up to 0.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class nine {

	public static void main( String [] args )
	{

		int num, max = Integer.MIN_VALUE, count = 0;

		Scanner s = new Scanner(System.in);

		do{

			num = s.nextInt();

			if(max == num){
				count += 1;
			}
			else if(max < num){
				count = 1;
				max = num;
			}
			else{

			}



		}while(num != 0);

		System.out.println("Max Number: " + max);
		System.out.println("     Count: " + count);

	}
}