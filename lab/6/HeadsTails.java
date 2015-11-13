package q3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class HeadsTails extends JFrame{
	
	
	public HeadsTails() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(3, 3));
		
		for (int i = 0; i < 9; i++)
			add(new ClickableCell("H"));
	}
	
	class ClickableCell extends JLabel {
		public ClickableCell(String s) {
			// TODO Auto-generated constructor stub
			setBorder(new LineBorder(Color.black, 1));
			setHorizontalAlignment(JLabel.CENTER);
			setText(s);
			
			addMouseListener(new MouseAdapter() {
		        public void mouseClicked(MouseEvent e) {
		          if (getText().equals("H")) {
		            setText("T"); // Flip from H to T
		          }
		          else {
		            setText("H"); // Flip from T to H
		          }
		        }
		      });
		}
	}
	
	
	public static void main(String[] args) {
		HeadsTails frame = new HeadsTails();
		
		frame.setSize(300, 300);
		frame.setTitle("Heads Tails Demo");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
}
