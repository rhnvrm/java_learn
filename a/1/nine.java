/*

Write a program that simulates flipping a 
coin one million times and displays the number of
heads and tails.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class eight {

	public static void main( String [] args )
	{

		int FLIPS = 1000000;

		int heads = 0, tails = 0, coin;



		for(int i = 0; i < FLIPS; i++){
			coin = (int)((Math.random() > 0.5)?1:0);

			if(coin == 0) heads++;
			else tails++;
		}

	    System.out.println("Heads: " + heads);
	    System.out.println("Tails: " + tails);

	}
}