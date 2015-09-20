package Test;

import SNU.geometryUtil.*;

import java.util.*;

public class Mainclass{
	
	public static void main(String args[]){

		Circle[] circles;
		circles = new Circle[11];
		circles[0] = new Circle();
		Rectangle[] rectangles;
		rectangles = new Rectangle[11];
		rectangles[0] = new	Rectangle();
		Square[] squares;
		squares = new Square[11];
		squares[0] = new Square();
		Triangle[] triangles;
		triangles = new Triangle[11];
		triangles[0] = new Triangle();

		System.out.println("Welcome to Test Module for SNU.geometryUtil");
		
		// vars for loop and scanner
		int choice = 0;
		Scanner s = new Scanner(System.in);

		//loop
		do{
			System.out.println("Choose: ");
			System.out.println(" 1 : Create Objects ");
			System.out.println(" 2 : Browse Objects ");
			System.out.println("-1 : Exit");
			System.out.print("?> ");
			choice = s.nextInt();

			if(choice == 1){
				System.out.println("Choose Object: ");
				System.out.println(" 1 : Circle");
				System.out.println(" 2 : Rectangle");
				System.out.println(" 3 : Square");
				System.out.println(" 4 : Triangle");
				System.out.println("-1 : Exit");
				System.out.print("?> ");
				choice = s.nextInt();
				if(choice == 1){
<<<<<<< HEAD
					System.out.print("Enter Radius: ");
					double radius = s.nextDouble();
					circles[circles[0].getCounter()] =  new Circle(radius);
=======
					circles[circles[0].getCounter()] =  new Circle();
					
>>>>>>> 8a6359bc798d9df8aed7d4e4d51ac94c75db30d2
				}
				else if (choice == 2){
					System.out.print("Enter Length: ");
					double length = s.nextDouble();
					System.out.print("Enter Breadth: ");
					double breadth = s.nextDouble();
					rectangles[rectangles[0].getCounter()] =  new Rectangle(length,breadth);
				}
				else if (choice == 3){
					squares[squares[0].getCounter()] =  new Square();
				}
				else if (choice == 4){
					triangles[triangles[0].getCounter()] = new	Triangle();
				}
				choice = 0;
			}
			else if(choice == 2){
				System.out.println("Choose Object Array: ");
				System.out.println(" 1 : Circle");
				System.out.println(" 2 : Rectangle");
				System.out.println(" 3 : Square");
				System.out.println(" 4 : Triangle");
				System.out.println("-1 : Exit");
				System.out.print("?> ");
				choice = s.nextInt();

				if(choice == 1){

					System.out.println("Choose Method: ");
					System.out.println(" 1 : getCount");
					System.out.println(" 2 : getRadius");
					System.out.println(" 3 : getArea");
					System.out.println(" 4 : getPerimeter");
					System.out.println("-1 : Exit");
					System.out.print("?> ");

					choice = s.nextInt();

					if (choice == 1) {
						System.out.println(circles[0].getCounter() - 1);
					}
					else if(choice == 2){
						System.out.print("Select Circle: ");
						int i = s.nextInt();
						System.out.println(circles[i].getRadius());
					}
					else if(choice == 3){
						System.out.print("Select Circle: ");
						int i = s.nextInt();
						System.out.println(circles[i].getArea());
<<<<<<< HEAD
					}
					else if(choice == 4){
						System.out.print("Select Circle: ");
						int i = s.nextInt();
						System.out.println(circles[i].getPerimeter());
=======
>>>>>>> 8a6359bc798d9df8aed7d4e4d51ac94c75db30d2
					}
					else if(choice == 4){
						System.out.print("Select Circle: ");
						int i = s.nextInt();
						System.out.println(circles[i].getPerimeter());
					}
					
					choice = 0;
				}
				else if (choice == 2){

					System.out.println("Choose Method: ");
					System.out.println(" 1 : getCount");
					System.out.println(" 2 : getLength");
					System.out.println(" 3 : getArea");
					System.out.println(" 4 : getPerimeter");
					System.out.println("-1 : Exit");


					System.out.print("?> ");
					choice = s.nextInt();
					
					if (choice == 1) {
						System.out.println(rectangles[0].getCounter() - 1);
					}
					else if(choice == 2){
						System.out.print("Select Circle: ");
						int i = s.nextInt();
						System.out.println(rectangles[i].getRadius());
					}
					else if(choice == 3){
						System.out.print("Select Circle: ");
						int i = s.nextInt();
						System.out.println(circles[i].getArea());
					}
					else if(choice == 4){
						System.out.print("Select Circle: ");
						int i = s.nextInt();
						System.out.println(circles[i].getPerimeter());
					}

					choice = 0;

				}
				else if (choice == 3){
					squares[squares[0].getCounter()] =  new Square();
				}
				else if (choice == 4){
					triangles[triangles[0].getCounter()] = new	Triangle();
				}
				choice = 0;
			}
			else{

			}
		}while(choice != -1);
	}

}

