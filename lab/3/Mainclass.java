package Test;

import SNU.geometryUtil.*;

import java.util.*;

public class Mainclass{
	
	public static void main(String args[]){

		Circle[] circles = new Circle[11]; //0

		Rectangle[] rect = new Rectangle[11]; // 1

		Square[] square = new Square[11]; //2

		Triangle[] triangles = new Triangle[11]; //3


		System.out.println("Welcome to Test Module for SNU.geometryUtil");

		Scanner in = new Scanner(System.in);
		int choice  = -1;
		while(choice != 0){
			System.out.println("New Object or Browse? <1,2,[0-exit]>");
			choice = in.nextInt();
			
			if(choice == 0) System.exit(0);

			System.out.println("Choose Object type (Circle, Rectangle, Square, Triangle <0,1,2,3>");
			int object = in.nextInt();
			
			if(object == 0) {
				if(choice == 1){
					Double input = in.nextDouble();
					circles[Circle.getCounter()] = new Circle(input);
				}
				if(choice == 2){
					for(int i = 0; i < Circle.getCounter(); i++){
						System.out.println("Circle #"+i+" -> "+ "Area: " + circles[i].getArea() + " Perim: " + circles[i].getPerimeter());
					}
				}
			}
			else if(object == 1){
				if(choice == 1){
					Double l = in.nextDouble();
					Double b = in.nextDouble();
					rect[Rectangle.getCounter()] = new Rectangle(l,b);
				}
				if(choice == 2){
					for(int i = 0; i < Circle.getCounter(); i++){
						System.out.println("Rect #"+i+" -> "+ "Area: " + rect[i].getArea() + " Perim: " + rect[i].getPerimeter());
					}
				}
			}
			else if(object == 2){
				if(choice == 1){
					Double a = in.nextDouble();
					
					square[Square.getCounter()] = new Square(a);
				}
				if(choice == 2){
					for(int i = 0; i < Square.getCounter(); i++){
						System.out.println("Sqr #"+i+" -> "+ "Area: " + square[i].getArea() + " Perim: " + square[i].getPerimeter());
					}
				}
			}
			else if(object == 3){
				if(choice == 1){
					Double a = in.nextDouble();
					Double b = in.nextDouble();
					Double c = in.nextDouble();
					
					triangles[Triangle.getCounter()] = new Triangle(a,b,c);
				}
				if(choice == 2){
					for(int i = 0; i < Square.getCounter(); i++){
						System.out.println("Sqr #"+i+" -> "+ "Area: " + square[i].getArea() + " Perim: " + square[i].getPerimeter());
					}
				}
			}
		}
	}
}

