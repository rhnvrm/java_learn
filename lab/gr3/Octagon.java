package SNU.gr3;

import java.util.*;

public class Octagon extends GeometricObject implements Comparable<GeometricObject>{

	private Point a, b, c, d, e, f, g, h;
	private double side;

	public Octagon(ArrayList<Point> p){

		double s = distance(p.get(0), p.get(1));

		for(int i = 1; i < 8; i++){
			if(distance(p.get(i), p.get(i-1)) != s){
				throw new ArithmeticException("Invalid Octagon! Not Regular!");
			}
		}

			this.a = p.get(0);
			this.b = p.get(1);
			this.c = p.get(2);
			this.d = p.get(3);
			this.e = p.get(4);
			this.f = p.get(5);
			this.g = p.get(6);
			this.h = p.get(7);

			this.side = Math.abs(distance(a,b));
	}

	public double distance(Point a, Point b){
		return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX()) + (a.getY()-b.getY())*(a.getY()-b.getY()));
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
		System.out.println("Enter data for Point a");
		e.setFromUser();
		System.out.println("Enter data for Point b");
		f.setFromUser();
		System.out.println("Enter data for Point c");
		g.setFromUser();
		System.out.println("Enter data for Point d");
		h.setFromUser();

		this.side = Math.abs(distance(a,b));

	}

	@Override
	public double getPerimeter(){
		return 8*(side);
	};

	@Override
	public double getArea(){
		return 2*(1+Math.sqrt(2))*side*side;
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
