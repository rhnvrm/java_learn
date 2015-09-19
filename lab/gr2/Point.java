package SNU.gr2;

import java.util.*;

public class Point{
	private double x,y;

	public Point(double a, double b){
		this.x = a;
		this.y = b;
	}

	public Point(){
		this.x = 0.0;
		this.y = 0.0;
	}

	public double getX(){
		return this.x;
	}

	public double getY(){
		return this.y;
	}

	public void setX(double z){
		x = z;
	}

	public void setY(double z){
		y = z;
	}

	public void setFromUser(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the data for the Point");
		System.out.print("x: ");
		x = s.nextDouble();
		System.out.print("y: ");
		y = s.nextDouble();
	}

}
