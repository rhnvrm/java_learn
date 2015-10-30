package SNU.gr3;

public class ConcentricRectangle extends GeometricObject implements Colorable {
	
	private Rectangle a, b;


	public ConcentricRectangle(Rectangle x, Rectangle y){

		if (x.getCentre().compareTo(y.getCentre()) == 0){
			this.a = x; 
			this.b = y;
		}
		else{
			throw new ArithmeticException("The two rectangles do not coincide");
		}


	}

	@Override
	public double costToColor(double c){
		return Math.abs(a.getArea() - b.getArea())*c;
	};

	@Override
	public double getPerimeter(){
		return -1;
	};

	@Override
	public double getArea(){
		return -1;
	};

}