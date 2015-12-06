import java.io.PrintStream;
import java.util.Scanner;
public class Bio

{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int to = input.nextInt();
		input.nextLine();
		int t = to;
		while(t-- != 0)
		{
			System.out.println("Line "+ (to - t));
			String genome = input.nextLine();
			boolean found = false;
			int start = -1;
			for (int i = 0; i < genome.length() - 2; i++) {
				String triplet = genome.substring(i, i + 3);
				if (triplet.equals("ATG")) 
				{
					start = i + 3;
				} 
				else if (((triplet.equals("TAG")) || (triplet.equals("TAA")) || (triplet.equals("TGA"))) && (start != -1))
				{
					String gene = genome.substring(start, i);
					if (gene.length() % 3 == 0)
					{
					found = true;
					System.out.println(gene);
					start = -1;
					}
				}
			}
			if (!found)
				System.out.println("no gene is found");
		}
	}
}