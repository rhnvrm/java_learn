package Test;

import java.util.*;
import SNU.gr3.*;

public class Tester {
	public static void main(String[] args) {
		ArrayList<GeometricObject> l = new ArrayList<GeometricObject>();

		Scanner s = new Scanner(System.in);

		boolean exit = false;

		int choice = -1;

		while(!exit){

			if(l.isEmpty()){
				System.out.println("New Object. (0- Exit, 1- Rectangle, 2- Octagon)");
				choice = s.nextInt();

				if(choice == 0) exit = true;
				else if(choice == 1){
					System.out.println("Enter Rectangle Points in order a,b,c,d");

					Point a = new Point(),b = new Point(),c = new Point(),d = new Point();

					a.setFromUser();
					b.setFromUser();
					c.setFromUser();
					d.setFromUser();

					Rectangle r = new Rectangle(a,b,c,d);

					l.add(r);
				}
				else if(choice == 2){
					System.out.println("Enter Octagon Points in order a,b,c,d");

					ArrayList<Point> p = new ArrayList<Point>();
					for(int i = 0; i < 7; i++){
						Point t = new Point();
						t.setFromUser();
					}

					Octagon o = new Octagon(p);

					l.add(o);
				}
				else{
					System.out.println("Invalid Choice");
				}

			}
			else{
				System.out.println("What to do? (0- Exit, 1- Add New, 2- Compare Two, 3- Max)");
				choice = s.nextInt();

				if(choice == 0) exit = true;

				else if(choice == 1){
					System.out.println("New Object. (0- Exit, 1- Rectangle, 2- Octagon)");
					choice = s.nextInt();

					if(choice == 0) exit = true;
					else if(choice == 1){
						System.out.println("Enter Rectangle Points in order a,b,c,d");

						Point a = new Point(),b = new Point(),c = new Point(),d = new Point();

						a.setFromUser();
						b.setFromUser();
						c.setFromUser();
						d.setFromUser();

						Rectangle r = new Rectangle(a,b,c,d);

						l.add(r);
					}
					else if(choice == 2){
						System.out.println("Enter Octagon Points in order a,b,c,d");

						ArrayList<Point> p = new ArrayList<Point>();
						for(int i = 0; i < 7; i++){
							Point t = new Point();
							t.setFromUser();
						}

						Octagon o = new Octagon(p);

						l.add(o);
					}
				}

				else if(choice == 2){
					int p1, p2;

					p1 = s.nextInt();
					p2 = s.nextInt();

					if(p1 > l.size() || p2 > l.size())
						{//throw new Exception("Index out of Bounds");}
						}
					else{
						int rval = l.get(p1).compareTo(l.get(p2));
						if(rval == 0){
							System.out.println("Same Area");
						}
						else{
							System.out.println("Different Area!");
						}
					}
				}

				else if(choice == 3){
					GeometricObject m = max(l);

					System.out.println("The maximum element has area: " + m.getArea());
				}

			}

		}

	}

	public static GeometricObject max(ArrayList<GeometricObject> l){
			
			GeometricObject m = l.get(0);

			for(int i = 1; i < l.size(); i++){
				if(m.compareTo(l.get(i)) < 0){
					m = l.get(i);
				}
			}

			return m;
	}

}