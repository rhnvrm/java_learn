/*

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class fourteenpointc {

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		for(int i = 0; i < num; i++){
			for(int j = (num - i - 1)/2; j < num; j++){
				System.out.print(' ');
			}
			for(int j = i; j < num; j++){
				System.out.print('*');
			}
			
			System.out.print('\n');
		}
	}
}