package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Hello {
public static void main(String[] args) {
	System.out.println("hello world");
	String input = JOptionPane.showInputDialog("What is your name?");
	System.out.println(imput);
	JOptionPane.showMessageDialog(null,"Hello " +input + "! Hope you're well!");
}
}
