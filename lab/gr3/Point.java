package SNU.gr3;

import java.util.*;

public class Point{
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
    public boolean equals(Object o) {
 
        if (o == this) {
            return true;
        }

        if (!(o instanceof Point)) {
            return false;
        }
         
        Point c = (Point) o;
         
        if(this.getX() == c.getX() && this.getY() == c.getY()){
        	return true;
        }
        else
        	return false;
    }

}
