/*

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class fourteenpointa {

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		for(int i = 0; i < num; i++){
			for(int j = 0; j < num; j++){
				System.out.print('*');
			}
			System.out.print('\n');
		}
	}
}