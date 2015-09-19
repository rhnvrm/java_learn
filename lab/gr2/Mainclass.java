package Test;

import java.util.*;

import SNU.gr2.*;

public class Mainclass{

	public static void main(String args[]){ 

		Scanner s = new Scanner(System.in);

		Point x = new Point();

		Triangle t = new Triangle();

		LineSegment l = new LineSegment();

		/*System.out.println("Enter Tester Point Values:");
		x.setFromUser();
		System.out.println("Enter Tester Triangle Values:");
		t.setFromUser();
		System.out.println("Enter Tester Line Values:");
		l.setFromUser();
	*/
		boolean exit = false;

		while(!exit){
			System.out.println("Check for point or line is in a triangle or want to exit (1/2/3)");
			int choice = s.nextInt();

			if(choice == 1){
				x.setFromUser();

				System.out.println("Check if is inside line or triangle or exit(1/2/3)");
				int secondchoice = s.nextInt();

				if(secondchoice == 1){
					l.setFromUser();
					System.out.println(l.isInside(x));
				}
				else if(secondchoice == 2){
					t.setFromUser();
					System.out.println(t.isInside(x));
				}
				else if(secondchoice == 3){
					exit = true;
				}
			}
			else if(choice == 2){
				l.setFromUser();

				System.out.println("Check if is inside triangle or exit(1/2)");
				int secondchoice = s.nextInt();

				if(secondchoice == 1){
					t.setFromUser();
					System.out.println(t.isInside(x));
				}
				else if(secondchoice == 2){
					exit = true;
				}
			}
			else if(choice == 3){
				exit = true;
			}
		}





	}


}