/*

Write an interactive program that will convert a positive integer
 quantity to a roman numeral
(e.g., 12 will be converted to XII, 14 will be converted to XIV, 
and so on). Design the
program so that it will execute repeatedly, until a value of zero 
is read in from the keyboard.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class sixteen {

	public static String IntegerToRomanNumeral(int input) {
	    if (input < 1 || input > 3999)
	        return "Invalid Roman Number Value";
	    String s = "";
	    while (input >= 1000) {
	        s += "M";
	        input -= 1000;        }
	    while (input >= 900) {
	        s += "CM";
	        input -= 900;
	    }
	    while (input >= 500) {
	        s += "D";
	        input -= 500;
	    }
	    while (input >= 400) {
	        s += "CD";
	        input -= 400;
	    }
	    while (input >= 100) {
	        s += "C";
	        input -= 100;
	    }
	    while (input >= 90) {
	        s += "XC";
	        input -= 90;
	    }
	    while (input >= 50) {
	        s += "L";
	        input -= 50;
	    }
	    while (input >= 40) {
	        s += "XL";
	        input -= 40;
	    }
	    while (input >= 10) {
	        s += "X";
	        input -= 10;
	    }
	    while (input >= 9) {
	        s += "IX";
	        input -= 9;
	    }
	    while (input >= 5) {
	        s += "V";
	        input -= 5;
	    }
	    while (input >= 4) {
	        s += "IV";
	        input -= 4;
	    }
	    while (input >= 1) {
	        s += "I";
	        input -= 1;
	    }    
	    return s;
	}

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		do{

			num = s.nextInt();

			if(num!=0){
				System.out.println("Roman numeral: " + IntegerToRomanNumeral(num));
			}

		}while(num != 0);

	}
}