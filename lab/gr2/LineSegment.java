package SNU.gr2;

import java.util.*;

public class LineSegment{
	private Point a,b;

	public LineSegment (Point x, Point y) {
		this.a = x;
		this.b = y;
	}

	public LineSegment(){
		this.a = new Point(0,0);
		this.b = new Point(0,0);
	}

	public Point getA(){
		return a;
	}

	public Point getB(){
		return b;
	}

	public void setFromUser(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter data for Point a");
		a.setFromUser();
		System.out.println("Enter data for Point b");
		b.setFromUser();
	}


	public boolean isInside(Point p) {

		double x1 = a.getX(), x2 = b.getX(),
			   y1 = a.getY(), y2 = b.getY();

		if(p.getX() >= x1 && p.getX() <= x2){
			if(p.getY() >= y1 && p.getY() <= y2){
				double m = (y2 - y1)/(x2 - x1);

				double LHS = p.getY();
				double RHS = m * p.getX();
				
				//System.out.println(LHS);
				//System.out.println(RHS);

				if(LHS == RHS){
					return true;
				}
				else{
					return false;
				}
			}
		}
		return false;
		
	}
}