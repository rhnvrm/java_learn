/*

Write a program to determine input the marks of n students in a subject and determine the
frequency count of marks obtained i.e. how many students obtained 100, how many 99, how
many 98 and so on up to 0.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class thirteen {

	public static void main( String [] args )
	{

		int num;

		int[] arr = new int[101];

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Marks: (-1 to exit)");
		do{

			num = s.nextInt();

			if(num!=-1)arr[num] += 1;
			
		}while(num != -1);

		System.out.println("\nMarks' frequency: ");
		for(int i = 0; i < 101; i++){
			if(arr[i] != 0){
				System.out.println(i + ": " + arr[i]);
			}
		}

	}
}