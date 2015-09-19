package SNU.gr2;

import java.util.*;

public class Triangle{
	private Point a,b,c;

	public Triangle (Point x, Point y, Point z) {
		this.a = x;
		this.b = y;
		this.c = z;
	}

	public Triangle(){
		this.a = new Point(0,0);
		this.b = new Point(0,0);
		this.c = new Point(0,0);
	}

	public void setFromUser(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter data for Point a");
		a.setFromUser();
		System.out.println("Enter data for Point b");
		b.setFromUser();
		System.out.println("Enter data for Point c");
		c.setFromUser();
	}

	public double getArea() {

		double x1 = a.getX(), x2 = b.getX(), x3 = c.getX();
		double y1 = a.getY(), y2 = b.getY(), y3 = c.getY();
		/*System.out.print(x1);
		System.out.print(x2);
		System.out.print(x3);
		System.out.print(y1);
		System.out.print(y2);
		System.out.print(y3);*/

		double area = (0.5)*(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2));
		//System.out.println(area);
		return area;
	}

	public boolean isInside(Point p) {
		Triangle A1 = new Triangle(p,a,b);
		Triangle A2 = new Triangle(p,b,c);
		Triangle A3 = new Triangle(p,a,c);
		double LHS = Math.abs(this.getArea()), RHS = Math.abs(A1.getArea()) + Math.abs(A2.getArea()) + Math.abs(A3.getArea());
		
		System.out.println(LHS);
		System.out.println(RHS);

		if(LHS == RHS){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isInside(LineSegment l){
		if(isInside(l.getA()) && isInside(l.getB())){
			return true;
		}
		else{
			return false;
		}
	}
}