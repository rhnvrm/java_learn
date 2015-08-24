/*

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class fourteenpointb {

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		for(int i = 0; i < num; i++){
			for(int j = num - i - 1; j < num; j++){
				System.out.print('*');
			}
			System.out.print('\n');
		}
	}
}