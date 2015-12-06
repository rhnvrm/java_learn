
package SNU;

import static SNU.GeometricObject.max;
import java.util.Scanner;

public class GeoObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeometricObject[] objects = {new Circle(5.0,"red",true), new Circle(12.3,"",false), new Rectangle(3.0,4.0,"blue",true), new Rectangle(12.0,4.0,"",false)};
        Scanner input = new Scanner(System.in);
        int n,i;

        for(i=0;i < objects.length;i++)
        {
            costOfPaintingAShape(objects[i]);
            objects[i].howToColor();
        }
        for(i=0;i < objects.length - 1;i++)
        {
            max(objects[i],objects[i+1]);
        }
        
        
        // TODO code application logic here
    }
    
    public static void costOfPaintingAShape(GeometricObject obj)
    {
        double costPerUnitArea = 5.0, cost;
        
        if(obj.isFilled())
        System.out.println("Cost of painting is " + costPerUnitArea*obj.getArea());
    }
    
}
