
package SNU;

public class Rectangle extends GeometricObject implements Colorable{
    private double width,height;
    
    public Rectangle()
    {
        super();
    }
    public Rectangle(double width, double height, String color, boolean filled)
    {
        super(color,filled);
        this.width = width;
        this.height = height;
    }
    
    public void setWidth(double width)
    {
        this.width = width;
    }
    public double getWidth()
    {
        return width;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public double getHeight()
    {
        return height;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getArea()
    {
        return (height*width);
    }

    /**
     *
     * @return
     */
    @Override
    public double getPerimeter()
    {
        return (2.0 * (width+height));
    }
    @Override
    public void howToColor()
    {
        System.out.println("Color all 4 sides");
    }
    
}
