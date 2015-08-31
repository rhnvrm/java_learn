/*
Prime number generator

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