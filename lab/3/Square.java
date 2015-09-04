package SNU.geometryUtil;


public class Square{
	private double a;

	private static int counter;

	public Square(){
		counter++;
	}

	public int getCounter(){
		return counter;
	}

	public double getA(){
		return a;
	}

	public void setA(double x){
		a = x;
	}


	public double getPerimeter(){
		return 4*a;
	}

	public double getArea(){
		return a*a;
	}

}