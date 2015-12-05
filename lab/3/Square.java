package SNU.geometryUtil;


public class Square{
	private double a;

	private static int counter = 0;

	public Square(){
		counter++;
	}

	public Square(double x){
		a = x;
		counter++;
	}

	public static int getCounter(){
		return counter;
	}

	public double getA(){
		return a;
	}

	public void setA(double x){
		a = x;
	}


	public double getPerimeter(){
		return 4.0*a;
	}

	public double getArea(){
		return a*a;
	}

}