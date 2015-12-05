package SNU.geometryUtil;


public class Rectangle{
	private double l,b;
	
	private static int counter = 0;

	public Rectangle(){
		counter++;
	}

	public Rectangle(double x, double y){
		l = x;
		b = y;
		counter++;
	}

	public static int getCounter(){
		return counter;
	}

	public double getL(){
		return l;
	}
	public double getB(){
		return b;
	}

	public void setL(double x){
		l = x;
	}
	public void setB(double x){
		b = x;
	}


	public double getPerimeter(){
		return 2.0*(l+b);
	}

	public double getArea(){
		return l*b;
	}

}