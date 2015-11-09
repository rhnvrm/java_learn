package SNU.gr3;

import java.util.*;

public class Point{
	private int x,y;

	public Point(int a, int b){
		this.x = a;
		this.y = b;
	}

	public Point(){
		this(0,0);
	}

	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}

	public void setX(int z){
		x = z;
	}

	public void setY(int z){
		y = z;
	}


	@Override
    public boolean equals(Object o) {
 
        if (o == this) {
            return true;
        }

        if (!(o instanceof Point)) {
            return false;
        }
         
        Point c = (Point) o;
         
        if(this.getX() == c.getX() && this.getY() == c.getY()){
        	return true;
        }
        else
        	return false;
    }

}
