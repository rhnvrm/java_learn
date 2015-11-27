import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Text extends JFrame{
	
	MyPanel panel = new MyPanel();
	public Text(){
		add(panel);
	}
	
	class MyPanel extends JPanel{

		int x = 50;

		
		public MyPanel() {
		addKeyListener(new KeyAdapter() {
		 public void keyPressed(KeyEvent e) {
			 switch (e.getKeyCode()) {
			 case KeyEvent.VK_RIGHT: x += 10;
			 break;
			 case KeyEvent.VK_LEFT: x -= 10;
			 break;
			 }
			 repaint();
		 }});
		setFocusable(true);
		}
		
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.drawString("Test",0,0);

		}
	}
	
	public static void main(String[] args) {
		Text frame = new Text();
		frame.setTitle("Text GR4");
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
