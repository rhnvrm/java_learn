/*

Write a program that prompts the user to 
enter the number of seconds, displays a message at
every second, and terminates when the time expires.

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