package gr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Test extends JFrame{
	
	MyPanel panel = new MyPanel();
	public Test(){
		add(panel);
	}
	
	class MyPanel extends JPanel{

		int x = 50;
		int size = 10;
		
		
		public MyPanel() {
		addKeyListener(new KeyAdapter() {
		 public void keyPressed(KeyEvent e) {
			 switch (e.getKeyCode()) {
			 case KeyEvent.VK_RIGHT: x += 10;
			 break;
			 case KeyEvent.VK_LEFT: x -= 10;
			 break;
			 case KeyEvent.VK_UP: size+=10;
			 break;
			 case KeyEvent.VK_DOWN: size-=10;
			 }
			 repaint();
		 }});
		setFocusable(true);
		}
		
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			
			
			Font f = new Font(Font.MONOSPACED, 0, size);
			
			g.setFont(f);
			
			g.drawString("Rohan Verma",x,150);

		}
	}
	
	public static void main(String[] args) {
		Test frame = new Test();
		frame.setTitle("Rohan Verma GR4");
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
