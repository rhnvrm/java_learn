
package SNU;

public class Circle extends GeometricObject{
    private double rad;
    
    public Circle()
    {
        super();
    }
    public Circle(double rad, String color, boolean filled)
    {
        super(color,filled);
        this.rad = rad;
    }
    
    public void setRadius(double rad)
    {
        this.rad = rad;
    }
    public double getRadius()
    {
        return rad;
    }
    public double getDiameter()
    {
        return rad*2.0;
    }

    /**
     *
     * @return
     */
    @Override
    public double getArea()
    {
        return (rad*rad*Math.PI);
    }

    /**
     *
     * @return
     */
    @Override
    public double getPerimeter()
    {
        return (2.0 * rad * Math.PI);
    }
    @Override
    public void howToColor()
    {
        System.out.println("Color the circumference");
    }
    
}
