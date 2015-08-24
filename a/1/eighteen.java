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
				System.out.printf("%d", num);
				num++;
			}
			num--;
			num--;
			for ( c = 1 ; c < d ; c++)
			{
				System.out.printf("%d", num);
				num--;
			}
			System.out.printf("\n");
		}

	}
}