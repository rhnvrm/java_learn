package SNU.geometryUtil;


public class Rectangle{
	private double l,b;
	
	private static int counter;

	public Rectangle(){
		counter++;
	}

	public int getCounter(){
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
		return 2*(l+b);
	}

	public double getArea(){
		return l*b;
	}

}