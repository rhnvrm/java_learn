/*

Write a program to input a set of integers and count the number of primes.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class twelve {

	public static boolean isPrime(int num) {
        if (num == 2 ) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
	}

	public static void main( String [] args )
	{
	    int num, vars, count = 0;

	    //Scanner
	    Scanner s = new Scanner(System.in);



	    System.out.print("Enter number of vars: ");
	    vars = s.nextInt();
	    while(vars-- != 0){
	    	if(isPrime(num = s.nextInt())){
	    		count+=1;
	    	}
	    }
	    
  
	    System.out.println("# of Primes " + count);

	}
}