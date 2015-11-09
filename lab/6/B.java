package q1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class B extends JFrame {
	
	private static JLabel jlabel = new JLabel("Mouse is outside!");
	
	private static int rectX=50, rectY=15, rectWidth=200, rectHeight=100;
	
	public static double distance(
            double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

	
	public boolean isInsideRect(int px, int py) {
        return px < rectX+rectWidth && py < rectY+rectHeight && px > rectX && py > rectY;
    }
	
	public B()
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

	 	g.drawRect(rectX, rectY, rectWidth, rectHeight);
	 	
	 	
	}

	public static void main(String[] args) {

		B frame = new B();
		
		
		
		frame.add(jlabel);
		
	}

}
