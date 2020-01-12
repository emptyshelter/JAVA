package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutFrame extends Frame {
	private Button b1,b2,b3,b4,b5;
	public BorderLayoutFrame() {
		super("BorderLayout");
		
		b1=new Button("SOUTH");
		b2=new Button("NORTH");
		b3=new Button("EAST");
		b4=new Button("WEST");
		b5=new Button("CENTER");
		
		/*
		 * LayoutManager��ü����
		 */
		this.setLayout(new BorderLayout());
		this.add(b1,BorderLayout.SOUTH);
		this.add(b2,BorderLayout.NORTH);
		this.add(b3,BorderLayout.EAST);
		this.add(b4,BorderLayout.WEST);
		this.add(b5,BorderLayout.CENTER);
		setSize(300,400);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new BorderLayoutFrame();

	}

}
