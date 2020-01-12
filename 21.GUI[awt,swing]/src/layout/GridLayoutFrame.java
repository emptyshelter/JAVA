package layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;;

public class GridLayoutFrame extends Frame {
	
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,
		   b0,plusB,minusB,mulB,divB,
		   equalB,resetB;
	public GridLayoutFrame() {
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		b0 = new Button("0");
		plusB = new Button("+");
		minusB = new Button("-");
		mulB = new Button("X");
		divB = new Button("/");
		equalB = new Button("=");
		resetB = new Button("C");
		
		
				
		GridLayout gl = new GridLayout(4,4,5,5);
		setLayout(gl);
			
		add(b1);
		add(b2);
		add(b3);
		add(plusB);
		add(b4);
		add(b5);
		add(b6);
		add(minusB);
		add(b7);
		add(b8);
		add(b9);
		add(mulB);
		add(b0);
		add(equalB);
		add(resetB);
		add(divB);
		
		
		
		
		setSize(300,400);
		setVisible(true);
		
	
	}

	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new GridLayoutFrame();

	}

}
