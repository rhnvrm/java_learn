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

		// 4 * * * * requires 0 spaces
		// 3  * * *  requires 1 spaces
		// 2   * *	 requires 2 spaces	
		// 1    *             3 spaces

		for(int i = num; i > 0; i--){
			for(int spaces = 0; spaces < (num-i); spaces++){
				System.out.print(" ");
			}	
			for(int j = 0; j < i; j++){
				System.out.print("* ");
			}

			System.out.print("\n");
		}

	}
}