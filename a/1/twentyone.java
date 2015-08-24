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


public class twentyone {

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		for(int i = 0; i <= 10; i++){
			System.out.print(num + "x" + i + "=" + num*i);
			System.out.print('\t');
			System.out.print(num+1 + "x" + i + "=" + (num+1)*i);
			System.out.print('\t');
			System.out.print(num+2 + "x" + i + "=" + (num+2)*i);
			System.out.print('\t');
			System.out.print(num+3 + "x" + i + "=" + (num+3)*i);
			System.out.print('\t');
			System.out.print(num+4 + "x" + i + "=" + (num+4)*i);
			System.out.print('\n');
		}

	}
}