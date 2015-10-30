package SNU.gr3;

import java.util.*;

public class Point implements Comparable<Point>{
	private double x,y;

	public Point(double a, double b){
		this.x = a;
		this.y = b;
	}

	public Point(){
		this(0.0, 0.0);
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

	@Override
    public int compareTo(Point other){
        // compareTo should return < 0 if this is supposed to be
        // less than other, > 0 if this is supposed to be greater than 
        // other and 0 if they are supposed to be equal
        
        int xc = Double.compare(this.getX(),other.getX());
        int yc = Double.compare(this.getY(),other.getY());

   		if(xc == 0 && yc == 0){
   			return 0;
   		}
   		else{
   			return -1;
   		}

    }

}
