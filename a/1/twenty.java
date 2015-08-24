/*

Write a program to generate multiplication tables for 1 ,2, ..., 10. Each table up to 10

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class twenty {

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		for(int i = 0; i <= 10; i++){
			System.out.println(num + "x" + i + "=" + num*i);
		}

	}
}