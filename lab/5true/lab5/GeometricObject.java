
package SNU;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject>,Colorable{
    private String color;
    private boolean filled;
    private Date dateCreated;
    
    protected GeometricObject()
    {
        dateCreated = new Date();
    }
    protected GeometricObject(String color, boolean filled)
    {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor() 
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    public Date getDate()
    {
        return dateCreated;
    }
    public static void max(GeometricObject obj1, GeometricObject obj2)
    {
        System.out.println("obj"+obj1.compareTo(obj2)+" is greater");
    }
    @Override
    public int compareTo(GeometricObject o)
    {
        if(getArea() > o.getArea())
            return 1;
        else if(getArea() < o.getArea())
            return 2;
        else
            return -1;
    }
    @Override
    public abstract void howToColor();
    
    public abstract double getArea();
    public abstract double getPerimeter();
     
    
}
