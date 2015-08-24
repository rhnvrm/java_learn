/*

Write a program to generate multiplication tables for 1 ,2, ..., 10. Each table up to 10

Modify (20) so that your output now looks like this:
2x1=2 3x1=3 ... 5x1=5
2x2=4 3x2=6 ... 5x2=10
...
...
2x10=20 3x10=30 ... 5x10=50

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