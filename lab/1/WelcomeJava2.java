import javax.swing.JOptionPane;

public class WelcomeJava2{
	public static void main(String[] args){
		JOptionPane.showMessageDialog(null, "Welcome to Java");
		JOptionPane.showMessageDialog(null, "Welcome to Java 3", "GUI Welcome", 3);
		JOptionPane.showMessageDialog(null, "Welcome to Java 3", "GUI Welcome", 2);
		JOptionPane.showMessageDialog(null, "Welcome to Java 3", "GUI Welcome", JOptionPane.QUESTION_MESSAGE);
	}
}
