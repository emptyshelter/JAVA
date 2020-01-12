package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;

public class PanelFrame extends Frame {
	Panel southP;
	Button sb1,sb2,sb3,sb4;
	Panel northP;
	Button nb1,nb2,nb3,nb4;
	Panel centerP;
	List cList;
	TextArea cTextArea;
	
	public PanelFrame() {
		setLayout(new BorderLayout());
		/**************south panel*****************/
		southP=new Panel();
		southP.setBackground(Color.PINK);
		southP.setLayout(new FlowLayout());
		
		
		sb1=new Button("추가");
		sb2=new Button("수정");
		sb3=new Button("삭제");
		sb4=new Button("리스트");
		
		southP.add(sb1);
		southP.add(sb2);
		southP.add(sb3);
		southP.add(sb4);
		
		/**************north panel***************/
		northP = new Panel();
		northP.setBackground(Color.ORANGE);
		northP.setLayout(new FlowLayout());
		
		nb1= new Button("교수");
		nb2= new Button("학생");
		nb3= new Button("직원");
		
		northP.add(nb1);
		northP.add(nb2);
		northP.add(nb3);
		

		/**************center panel***************/
		centerP = new Panel();
		centerP.setBackground(Color.LIGHT_GRAY);
		centerP.setLayout(new BorderLayout());
		cList = new List();
		cList.add("김태희");
		cList.add("이소라");
		cList.add("이효리");
		cList.add("공유");
		cList.add("장동건");
		cTextArea = new TextArea();
		cTextArea.setText("김태희: 요즘 뭐하세요?");
		centerP.add(cList,BorderLayout.WEST);
		centerP.add(cTextArea,BorderLayout.CENTER);
		
		/*
		 * Frame에 Panel을 붙일수 있다.
		 * Panel에 Panel을 붙일수 있다.
		 * Frame에 Frame을 붙일수 없다.
		 */
		add(northP,BorderLayout.NORTH);
		add(southP,BorderLayout.SOUTH);
		add(centerP,BorderLayout.CENTER);
		
		setSize(300, 400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new PanelFrame();

	}

}
