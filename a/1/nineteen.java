/*

In a strong number, the sum of the factorials of digits of a number is equal to the original
number. Write a program to check given number is strong number or not.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class nineteen {

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		int temp = num,i,f,r,sum=0;
		while(num!=0){
			i=1;f=1;
			r=num%10;

			while(i<=r){
				f=f*i;
				i++;
			}
			sum=sum+f;
			num=num/10;
		}
		if(sum==temp)
			System.out.printf("%d is a strong number\n",temp);
		else
			System.out.printf("%d is not a strong number\n",temp);

	}
}