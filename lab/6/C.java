package q1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import SNU.gr3.Point;

@SuppressWarnings("serial")
public class C extends JFrame {
	
	private static JLabel jlabel = new JLabel("Mouse is outside!");
	
	private  Point a = new Point(),b= new Point(),c=new Point();
	
	private static double distance(
            double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

	private int sign(int n){
		return Math.abs(n)/n;
	}

	private int dotProduct(Point A, Point B, Point P){
		return (A.getX()-P.getX())*(B.getY()-P.getY())-(B.getX()-P.getX())*(A.getY()-P.getY());
	}

	public boolean isInside(int x, int y) {

		Point p = new Point(x,y);

		int ab = dotProduct(a,b,p);
		int bc = dotProduct(b,c,p);
		int ca = dotProduct(c,a,p);
		return sign(ab)==sign(bc) && sign(bc)==sign(ca);

        
    }
	
	public C()
	{

		super("Q1c");

		a.setX(0);
		a.setY(75);
		b.setX(90);
		b.setY(90);
		c.setX(50);
		c.setY(0);
	
	 //Set JFrame title
	 

	 //Set default close operation for JFrame
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	 //Set JFrame size
	 setSize(300,200);

	 //Make JFrame visible 
	 setVisible(true);
	 
	 this.addMouseMotionListener(new MouseAdapter() {
		
		@Override
		public void mouseMoved(MouseEvent e) {
			
			super.mouseMoved(e);
			
			//jlabel.setText(""+isInside(e.getX(),e.getY())+" "+e.getX()+" "+e.getY());
			
			//repaint();

			if(isInside(e.getX(),e.getY())){
				jlabel.setText("Mouse is inside!");
			}
			else{
				jlabel.setText("Mouse is outside!");
			}

			repaint();
		}
		
		 
		 
	});
	}


	
	public void paint(Graphics g)
	{
	 super.paint(g);

	 	g.drawLine(a.getX(),a.getY(),b.getX(),b.getY());
	 	g.drawLine(b.getX(),b.getY(),c.getX(),c.getY());
	 	g.drawLine(c.getX(),c.getY(),a.getX(),a.getY());
	 	
	}

	public static void main(String[] args) {

		C frame = new C();
		
		frame.add(jlabel);
		frame.repaint();
		
	}

}
