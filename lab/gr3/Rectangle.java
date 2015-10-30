package SNU.gr3;

import java.util.*;

public class Rectangle extends GeometricObject implements Comparable<GeometricObject>{

	private Point a, b, c, d;
	private double length, breadth;
	private Point centre;

	public Rectangle(Point p, Point q, Point r, Point s){

		if(IsRectangleAnyOrder(p,q,r,s)){
			this.a = p;
			this.b = q;
			this.c = r;
			this.d = s;

			length = Math.abs(distance(a,b));
			breadth = Math.abs(distance(a,d));

			this.centre.setX((this.a.getX() + this.c.getX())/2);
			this.centre.setY((this.a.getY() + this.c.getY())/2);

		}
		else{
			throw new ArithmeticException("Invalid Rectangle");
		}
	}

	public double distance(Point a, Point b){
		return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX()) + (a.getY()-b.getY())*(a.getY()-b.getY()));
	}


	boolean IsOrthogonal(Point a, Point b, Point c)
	{
	    return (b.getX() - a.getX()) * (b.getX() - c.getX()) + (b.getY() - a.getY()) * (b.getY() - c.getY()) == 0;
	}

	boolean IsRectangle(Point a, Point b, Point c, Point d)
	{
	    return
	        IsOrthogonal(a, b, c) &&
	        IsOrthogonal(b, c, d) &&
	        IsOrthogonal(c, d, a);
	}

	boolean IsRectangleAnyOrder(Point a, Point b, Point c, Point d)
	{
	    return IsRectangle(a, b, c, d) ||
	           IsRectangle(b, c, a, d) ||
	           IsRectangle(c, a, b, d);
	}

	public void setLength(double l){
		length = l;
	}

	public double getLength(){
		return length;
	}

	public void setBreadth(double b){
		breadth = b;
	}

	public double getBreadth(){
		return breadth;
	}

	public Point getCentre(){
		return centre;
	}

	public void setFromUser(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter data for Point a");
		a.setFromUser();
		System.out.println("Enter data for Point b");
		b.setFromUser();
		System.out.println("Enter data for Point c");
		c.setFromUser();
		System.out.println("Enter data for Point d");
		d.setFromUser();

		length = Math.abs(distance(a,b));
		breadth = Math.abs(distance(a,d));

		this.centre.setX((this.a.getX() + this.c.getX())/2);
		this.centre.setY((this.a.getY() + this.c.getY())/2);
	}

	@Override
	public double getPerimeter(){
		return 2*(length+breadth);
	};

	@Override
	public double getArea(){
		return length*breadth;
	};

	@Override
	public int compareTo(GeometricObject o) {       

        if(this.getArea() > o.getArea()){
			return 1;
		}
		else if(this.getArea() < o.getArea()){
			return -1;
		}
		else 
			return 0;

    }
}
