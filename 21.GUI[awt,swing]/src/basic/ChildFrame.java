package basic;

import java.awt.Color;
import java.awt.Frame;

public class ChildFrame extends Frame{
	public ChildFrame() {
		setTitle("상속에 의한 프레임사용");
		setSize(300, 400);
		setBackground(new Color(125,125,0));
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ChildFrame();

	}
}
