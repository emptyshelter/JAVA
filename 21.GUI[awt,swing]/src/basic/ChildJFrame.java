package basic;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;

public class ChildJFrame extends JFrame{
	public ChildJFrame() {
		setTitle("��ӿ� ���� �����ӻ��");
		setSize(300, 400);
		getContentPane().setBackground(new Color(125,125,0));
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ChildJFrame();

	}
}
