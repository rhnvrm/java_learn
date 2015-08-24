/*

An Armstrong number is one in which the sum of the cubes of digits of a number is equal to
the original number. Write a program to check given number is Armstrong number or not.
For example: n=153 => 1 3 + 5 3 +3 3 = 1+125+27= 153, so 153 is an Armstrong number.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class seventeen {

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		int sum = 0;
		int temp = num;
		while(num != 0){
			sum += Math.pow((num%10),3);
			num/=10;
		}
		if(sum == temp){
			System.out.println("The number "+ temp + " is an armstrong number");
		}
		else
			System.out.println("It is not an armstrong number!");

	}
}