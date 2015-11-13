package q2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class DraggableCircle extends JFrame{

	CirclePanel canvas = new CirclePanel();
	
	public DraggableCircle() {
		// TODO Auto-generated constructor stub
		
		this.add(canvas);
		
		
	}
	
	class CirclePanel extends JPanel{
		int x= 100, y = 100, diameter = 50;
		
		public boolean isInsideCircle(int px, int py) {
            return distance(px, py, x-diameter/2, y-diameter/2) < diameter;
        }

        public double distance(
                double x1, double y1, double x2, double y2) {
            return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        }
		
		public CirclePanel() {
			// TODO Auto-generated constructor stub
			this.addMouseMotionListener(new MouseAdapter() {
				
				/*@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					x = e.getX();
					y = e.getY();
					repaint();
				}*/
				/*
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
					
				}*/
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseClicked(e);
					System.out.println(" "+isInsideCircle(e.getX(),e.getY()));
				}
				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseDragged(e);
					
					if(isInsideCircle(e.getX(),e.getY()))
					{
						x = e.getX();
						y = e.getY();
						repaint();
					}
				}
				
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			g.drawOval(x-diameter/2, y-diameter/2, diameter, diameter);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DraggableCircle frame = new DraggableCircle();
		frame.setTitle("DraggableCircle Demo");
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	}

}
