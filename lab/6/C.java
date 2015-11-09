package q1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import SNU.gr2.Point;

@SuppressWarnings("serial")
public class C extends JFrame {
	
	private static JLabel jlabel = new JLabel("Mouse is outside!");
	
	private static Point a,b,c;
	
	public static double distance(
            double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

	
	public boolean isInsideRect(int px, int py) {
        // /return px < rectX+rectWidth && py < rectY+rectHeight && px > rectX && py > rectY;
    }
	
	public C()
	{
	
	 //Set JFrame title
	 super("Q1b");

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
			
			//jlabel.setText(""+isInsideRect(e.getX(),e.getY())+" "+e.getX()+" "+e.getY());
			
			//repaint();

			if(isInsideRect(e.getX(),e.getY())){
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
	 	g.drawLine(c.getX(),c.getY(),b.getX(),b.getY());
	 	g.drawLine(a.getX(),a.getY(),c.getX(),c.getY());
	 	
	}

	public static void main(String[] args) {

		C frame = new C();
		
		frame.a.setX(5);
		frame.a.setY(5);
		frame.b.setX(90);
		frame.b.setY(90);
		frame.c.setX(50);
		frame.c.setY(50);

		
		frame.add(jlabel);
		frame.repaint();
		
	}

}
