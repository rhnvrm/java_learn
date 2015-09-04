package SNU.geometryUtil;

public class Circle{
	private double radius;

	private static int counter;

	public Circle(){
		counter++;
	}

	public Circle(double x){
		radius = x;
		counter++;
	}

	public int getCounter(){
		return counter;
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double x){
		radius = x;
	}

	public double getArea(){
		return 3.1415 * radius * radius;
	}
	public double getPerimeter(){
		return 2* 3.1415 * radius ;
	}
}
