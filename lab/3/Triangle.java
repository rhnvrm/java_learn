package SNU.geometryUtil;


public class Triangle{
	private double a,b,c;

	private static int counter = 0;

	public Triangle(){
		counter++;
	}

	public static int getCounter(){
		return counter;
	}

	public Triangle(double x,double y,double z){
		a = x;
		b = y;
		c = z;
		counter++;
	}

	public double getA(){
		return a;
	}

	public double getB(){
		return b;
	}

	public double getC(){
		return c;
	}

	public void setA(double x){
		a = x;
	}

	public void setB(double x){
		b = x;
	}

	public void setC(double x){
		c = x;
	}

	public double getPerimeter(){
		return a+b+c;
	}

	public double getArea(){
		double p = getPerimeter()/2.0;

		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

}