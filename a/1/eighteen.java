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

Author: Rohan Verma (hello@rohanverma.net)

*/
import java.util.Scanner;


public class eighteen {

	public static void main( String [] args )
	{

		int num;

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		for(int i = 0; i < num; i++){
			for(int k = i + 1; k < num; k++){
				System.out.print(' ');
			}
			int j = 1;
			for(j = 1 + i; j < num; j++){
				System.out.print(j);
			}
			j--;
			for(; j > i; j--){
				System.out.print(j);
			}
			System.out.print('\n');
		}
	}
}