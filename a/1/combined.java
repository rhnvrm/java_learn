/*

1
232
34543
4567654
567898765
67890109876
7890123210987
890123454321098
90123456765432109
0123456789876543210

Done

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class eighteen {

	public static void main( String [] args )
	{

		int n, c, d, num = 1, space;

		Scanner s = new Scanner(System.in);

		n = s.nextInt();

		space = n - 1;
		for ( d = 1 ; d <= n ; d++ )
		{
			num = d;
			for ( c = 1 ; c <= space ; c++ )
				System.out.printf(" ");
			space--;
			for ( c = 1 ; c <= d ; c++ )
			{
				System.out.printf("%d", num%10);
				num++;
			}
			num--;
			num--;
			for ( c = 1 ; c < d ; c++)
			{
				System.out.printf("%d", num%10);
				num--;
			}
			System.out.printf("\n");
		}

	}
}/*

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
}/*

A solution to find the greatest common divisor of two integers n1 and n2 is as follows: First
find d to be the minimum of n1 and n2, then check whether d, d-1, d-2, 2, or 1 is a divisor for
both n1 and n2 in this order. The first such common divisor is the greatest common divisor
for n1 and n2. Write a program that prompts the user to enter two positive integers and
displays the gcd.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class eleven {

	public static int hcf(int a, int b){

		int min = (a>b)?b:a;

		for(int i = min; i >= 1; i--){
			if(a % i == 0 && b % i == 0){
				return i;
			}
		}

		return -1;

	}

	public static void main( String [] args )
	{
	    int a, b;

	    //Scanner
	    Scanner s = new Scanner(System.in);

	    a = s.nextInt();
	    b = s.nextInt();
  
	    System.out.println("HCF: " + hcf(a,b));

	}
}/*

Write a program to read an integer and reverse it.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class fifteen {

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		int rev = 0;

		while(num != 0){
			rev *= 10;
			rev += num % 10;

			num /= 10;
		}

		System.out.println(rev);	
	}
}/*

Write a program that prompts the user to enter 
a decimal integer and displays its
corresponding binary value. 
Don’t use Java’s Integer.toBinaryString(int) 
in this program.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class five {

	public static void main( String [] args )
	{
	    double x1, y1, r1, x2, y2, r2;

	    //Scanner
	    Scanner s = new Scanner(System.in);

	    System.out.println("Enter the center coords and radii of circle 1 then circle 2 respectively: ");

		x1 = s.nextDouble();
		y1 = s.nextDouble();
		r1 = s.nextDouble();
		x2 = s.nextDouble();
		y2 = s.nextDouble();
		r2 = s.nextDouble();

		double distance = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);

		if (r2 >= r1 && distance <= (r2 - r1)){
        	System.out.println("Circle 1 is inside Circle 2.");
	    }
	    else if (r1 >= r2 && distance <= (r1 - r2) ) {
	        System.out.println("Circle 2 is inside Circle 1.");
	    }
	    else if (distance > (r1 + r2)){
	        System.out.println("Circle 2 does not overlap Circle 1.");
	    }
	    else {
	        System.out.println("Circle 2 overlaps Circle 1.");
	    }

	}
}/*

Write a program to find out the L.C.M. and H.C.F. of two numbers.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class four {

	public static int hcf(int a, int b){
		if (b == 0) {
			return a;
		}
		else {
			return hcf(b, a % b);
		}
		//return -1;
	}

	public static int lcm(int a, int b){
		
		return (a*b)/hcf(a,b);
	}

	public static void main( String [] args )
	{
	    int a, b;

	    //Scanner
	    Scanner s = new Scanner(System.in);

	    a = s.nextInt();
	    b = s.nextInt();
	   
	    System.out.println("LCM: " + lcm(a,b));	   
	    System.out.println("HCF: " + hcf(a,b));

	}
}/*

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
}/*

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class fourteenpointb {

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		for(int i = 0; i < num; i++){
			for(int j = num - i - 1; j < num; j++){
				System.out.print('*');
			}
			System.out.print('\n');
		}
	}
}/*

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

		for(int i = 0; i < num; i++){
			for(int j = (num - i - 1)/2; j < num; j++){
				System.out.print(' ');
			}
			for(int j = i; j < num; j++){
				System.out.print('*');
			}
			
			System.out.print('\n');
		}
	}
}/*

Write a program that prompts the user to 
enter the number of seconds, displays a message at
every second, and terminates when the time expires.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class nine {

	public static void main( String [] args )
	{

		int num, max = Integer.MIN_VALUE, count = 0;

		Scanner s = new Scanner(System.in);

		do{

			num = s.nextInt();

			if(max == num){
				count += 1;
			}
			else if(max < num){
				count = 1;
				max = num;
			}
			else{

			}



		}while(num != 0);

		System.out.println("Max Number: " + max);
		System.out.println("     Count: " + count);

	}
}/*

In a strong number, the sum of the factorials of digits of a number is equal to the original
number. Write a program to check given number is strong number or not.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class nineteen {

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		int temp = num,i,f,r,sum=0;
		while(num!=0){
			i=1;f=1;
			r=num%10;

			while(i<=r){
				f=f*i;
				i++;
			}
			sum=sum+f;
			num=num/10;
		}
		if(sum==temp)
			System.out.printf("%d is a strong number\n",temp);
		else
			System.out.printf("%d is not a strong number\n",temp);

	}
}/*

Write a program that reads three edges for a triangle and determines whether the input is
valid. The input is valid if the sum of any two edges is greater than the third edge.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class one {

	public static void main( String [] args )
	{
	    // Input edge lengths of a b c
	    int a,b,c;

	    //Scanner
	    Scanner s = new Scanner(System.in);

	    a = s.nextInt();
	    b = s.nextInt();
	    c = s.nextInt();

	    //Calculate sums
	    int x = a + b;
	    int y = b + c;
	    int z = c + a;

	    if(x > c && y > a && z > b){
	    	System.out.println("The input was valid!");
	    }
	    else{
	    	System.out.println("The input was invalid!");
	    }
	}
}/*

Write a program that prompts the user to enter a 
decimal integer and displays its
corresponding hexadecimal value. 
Don’t use Java’s Integer.toHexString(int) in this
program.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class seven {

	public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }       
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
      
        return reverse;
	}

	public static String convert(int dec)
	{
	    String hex = "";

	    while(dec != 0){

	    	int remainder = dec % 16;
	    	if(remainder > 9){
	    		char x='e';
	    		remainder -= 10;
	    		switch(remainder){
	    			case 0: 
	    				x = 'A';
	    				break;
	    			case 1: 
	    				x = 'B';
	    				break;
	    			case 2: 
	    				x = 'C';
	    				break;
	    			case 3: 
	    				x = 'D';
	    				break;	    				
	    			case 4: 
	    				x = 'E';
	    				break;	    				
	    			case 5: 
	    				x = 'F';
	    				break;		    				
	    		}

	    		hex += x;


	    	}
	    	else{
				hex += (char)(remainder + 48);
	    	}
	    	dec /= 16;
	    }
	    return reverse(hex);
	}

	public static void main( String [] args )
	{
	    int num;

	    Scanner s = new Scanner(System.in);

	    num = s.nextInt();

	    System.out.println("Hex: " + convert(num));

	}
}/*

An Armstrong number is one in which the sum of the cubes of digits of a number is equal to
the original number. Write a program to check given number is Armstrong number or not.
For example: n=153 => 1 3 + 5 3 +3 3 = 1+125+27= 153, so 153 is an Armstrong number.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class seventeen {

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		int sum = 0;
		int temp = num;
		while(num != 0){
			sum += Math.pow((num%10),3);
			num/=10;
		}
		if(sum == temp){
			System.out.println("The number "+ temp + " is an armstrong number");
		}
		else
			System.out.println("It is not an armstrong number!");

	}
}/*

Write a program that prompts the user to enter 
a decimal integer and displays its
corresponding binary value. 
Don’t use Java’s Integer.toBinaryString(int) 
in this program.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class six {

	public static int convert(int dec)
	{
	    if (dec == 0)
	    {
	        return 0;
	    }
	    else
	    {
	        return (dec % 2 + 10 * convert(dec / 2));
	    }
	}

	public static void main( String [] args )
	{
	    int num;

	    Scanner s = new Scanner(System.in);

	    num = s.nextInt();

	    System.out.println("Binary: " + convert(num));

	}
}/*

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
}/*

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

}/*

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
}/*

Write a program to find out sum of digits of a given number.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class three {

	public static void main( String [] args )
	{
	    int num, sum;

	    //Scanner
	    Scanner s = new Scanner(System.in);

	    num = s.nextInt();

	    sum = 0;

	    while(num != 0){
	    	//add remainder from num
	    	sum += num % 10;
	    	num /= 10;
	    }
	    System.out.println("The sum of digits of given number is: " + sum);
	}
}/*

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
}/*

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
}/*

Write a program to generate multiplication tables for 1 ,2, ..., 10. Each table up to 10

Modify (20) so that your output now looks like this:
2x1=2 3x1=3 ... 5x1=5
2x2=4 3x2=6 ... 5x2=10
...
...
2x10=20 3x10=30 ... 5x10=50

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class twentyone {

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		for(int i = 0; i <= 10; i++){
			System.out.print(num + "x" + i + "=" + num*i);
			System.out.print('\t');
			System.out.print(num+1 + "x" + i + "=" + (num+1)*i);
			System.out.print('\t');
			System.out.print(num+2 + "x" + i + "=" + (num+2)*i);
			System.out.print('\t');
			System.out.print(num+3 + "x" + i + "=" + (num+3)*i);
			System.out.print('\t');
			System.out.print(num+4 + "x" + i + "=" + (num+4)*i);
			System.out.print('\n');
		}

	}
}/*

Write a program to print ASCII value of all characters.

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class two {

	public static void main( String [] args )
	{
		System.out.println("ASCII VALUE CHART");
	    for(int i = 0; i < 256; i++){
	    	System.out.print('(');
			System.out.print((char)i);	    	
			System.out.print(", ");
	    	System.out.print(i);
	    	System.out.print("),   ");

	    	if(i % 10 == 0) System.out.print('\n');
	    }
	    System.out.print('\n');
	}
}