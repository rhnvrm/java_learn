package q1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class A extends JFrame {
	
	private static JLabel jlabel = new JLabel("Mouse is not in the Circle!");
	
	private static int circleX=50, circleY=15, circleWidth=100, centerX=circleX + circleWidth/2, centerY=circleY  + circleWidth/2;
	
	public static double distance(
            double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

	
	public boolean isInsideCircle(int px, int py) {
        return distance(px, py, centerX, centerY) < circleWidth/2;
    }
	
	public A()
	{
	
	 //Set JFrame title
	 super("Draw A Circle In JFrame");

	 //Set default close operation for JFrame
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	 //Set JFrame size
	 setSize(300,150);

	 //Make JFrame visible 
	 setVisible(true);
	 
	 this.addMouseMotionListener(new MouseAdapter() {
		
		@Override
		public void mouseMoved(MouseEvent e) {
			
			super.mouseMoved(e);
			
			jlabel.setText(""+isInsideCircle(e.getX(),e.getY())+" "+e.getX()+" "+e.getY());
			repaint();
		}
		
		 
		 
	});
	}


	
	public void paint(Graphics g)
	{
	 super.paint(g);

	 	g.drawOval(circleX, circleY, circleWidth, circleWidth);
	 	
	 	
	}

	public static void main(String[] args) {

		A frame = new A();
		
		
		
		frame.add(jlabel);
		
	}

}
