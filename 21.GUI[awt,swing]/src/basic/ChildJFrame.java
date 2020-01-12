package basic;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;

public class ChildJFrame extends JFrame{
	public ChildJFrame() {
		setTitle("상속에 의한 프레임사용");
		setSize(300, 400);
		getContentPane().setBackground(new Color(125,125,0));
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ChildJFrame();

	}
}
