/*
Q1. Prime number generator

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class one {

	public static int isPrime(int x){
		for(int i = 2; i * i <= x; i++){
			if(x % i == 0) return 0;
		}
		return 1;
	}

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		System.out.println("Primes between 1 and " + num + ": "); 

		for(int i = 2; i <= num; i++){
			if(isPrime(i) == 1){
				System.out.println(i);
			}
		}
	}
}

/*

Q2. Pyriamid

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class two {

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		for(int i = 0; i < num; i++){
			for(int j = i; j < num; j++){
				System.out.print(" ");
			}
			for(int j = num - i - 1; j < num; j++){
				System.out.print(num - j);
			}
			System.out.print('\n');
		}
	}
}

/*
Q3. Leap years between 1901 and 2000

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class three {

	public static int isPrime(int x){
		for(int i = 2; i * i <= x; i++){
			if(x % i == 0) return 0;
		}
		return 1;
	}

	public static void main( String [] args )
	{

		int BEGIN = 1901, END = 2000, printed = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Leap years between 1901 to 2000 "); 

		for(int i = BEGIN; i <= END; i++)
		{
			
			if ( i%400 == 0)
			{
				System.out.print(i + " ");
				printed++;
			}
			else if ( i%100 == 0)
				;
			else if ( i%4 == 0 )
			{
				System.out.print(i + " ");
				printed++;
			}



			if(printed%12== 0 && printed != 0) {
				System.out.println();
				printed = 0;
			}
		}

		System.out.println();
	}
}	

