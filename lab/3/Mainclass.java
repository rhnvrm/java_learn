package Test;

import SNU.geometryUtil.*;

import java.util.Scanner;

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
		int exit = 0;
		Scanner s = new Scanner();

		//loop
		do{
			System.out.println("Choose: ");
			System.out.println(" 1 : Create Objects: ");
			System.out.println(" 2 : Browse Objects: ");
			System.out.println("-1 : Exit");
			System.out.print("?>");
			choice = s.nextInt();

			if(choice == 1){
				System.out.println("Choose Object: ");
				System.out.println(" 1 : Circle");
				System.out.println(" 2 : Rectangle");
				System.out.println(" 3 : Square");
				System.out.println(" 4 : Triangle");
				System.out.println("-1 : Exit");
				System.out.print("?>");
				choice = s.nextInt();
				if(choice == 1){
					circles[circles[0].getCount()] =  new Circle();
				}
				else if (choice == 2){
					rectangles[rectangles[0].getCount()] =  new Rectangle();
				}
				else if (choice == 3){
					squares[squares[0].getCount()] =  new Square();
				}
				else if (choice == 4){
					triangles[triangles[0].getCount()] = new	Triangle();
				}
			}
			else if(choice == 2){
				System.out.println("Choose Object: ");
				System.out.println(" 1 : Circle");
				System.out.println(" 2 : Rectangle");
				System.out.println(" 3 : Square");
				System.out.println(" 4 : Triangle");
				System.out.println("-1 : Exit");
				System.out.print("?>");
				choice = s.nextInt();
				if(choice == 1){
					System.out.println("Choose Method: ");
					System.out.println(" 1 : getCount");
					System.out.println(" 2 : getRadius");
					System.out.println(" 3 : getArea");
					System.out.println(" 4 : getPerimeter");
					System.out.println("-1 : Exit");
					System.out.print("?>");
					choice = s.nextInt();

					if (choice == 1) {
						case 1: System.out.println(circles[0].getCount());
					}
				}
				else if (choice == 2){
					rectangles[rectangles[0].getCount()] =  new Rectangle();
				}
				else if (choice == 3){
					squares[squares[0].getCount()] =  new Square();
				}
				else if (choice == 4){
					triangles[triangles[0].getCount()] = new	Triangle();
				}
			}
			else{

			}
		}while(choice != -1);
	}

}

