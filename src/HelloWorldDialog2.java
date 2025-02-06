/**
 * Jaiden Palazzo
 * Lab 1 
 * @date 1/24/2025
 * @author JaidenPalazzo
 * This is the HelloWorld Project 
 */
import javax.swing.JOptionPane;

public class HelloWorldDialog2 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name:");
		JOptionPane.showMessageDialog(null, "Hello " + name + "!!!");

	}

}
