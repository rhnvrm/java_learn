/*

Write a program that prompts the user to 
enter the number of seconds, displays a message at
every second, and terminates when the time expires.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.*;

public class ten {	

	public static void main( String [] args )
	{
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number of seconds: ");
		int sec = s.nextInt();

        while (sec > 0) { 
            System.out.println("Seconds Left: " + sec); 
            long start = System.currentTimeMillis(); 
            //wait till 1 sec \/
            while (start + 1000 > System.currentTimeMillis()); 
            sec--; 
        } 

	}

}