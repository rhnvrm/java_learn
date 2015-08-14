import javax.swing.JOptionPane;
 

public class ComputeArea{
	public static void main(String[] args){
		float radius = 0;
		double area;

		area = radius * radius * 3.14159;

	    for (String s: args) {
            radius = Float.parseFloat(s);
            area = radius * radius * 3.14159;
            System.out.println("Area of circle of radius " + radius + " = " + area);
        }


	}
}
