package Package1;
import java.awt.Color;

import javax.swing.JFrame;

public class HelloWorld1 extends JFrame{

	public static void main(String[] args) {
		HelloWorld1 a1=new HelloWorld1();
		a1.setTitle("Hello World");
		a1.setSize(400, 300);
		a1.setBackground(Color.red);
		a1.setVisible(true);		
	}

}
