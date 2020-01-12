package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.border.Border;

public class Chatting extends Frame {
	Panel southP;
	Panel centerP;
	Panel northP;
	Button sb1;
	List cList;
	TextArea cTextArea;
	TextField sTextField;
	Label nLabel;
	
	public Chatting() {
		setLayout(new BorderLayout());
		setTitle("Chatting app");
		setSize(300, 400);
		
		
		/**************north panel***************/
		northP = new Panel();
		northP.setLayout(new FlowLayout());
		northP.setBackground(Color.PINK);
		nLabel = new Label();
		nLabel.setText("사랑이 꽃피는 채팅방");
		northP.add(nLabel);
		
		
		
		/**************center panel***************/
		centerP = new Panel();
		centerP.setLayout(new BorderLayout());
		cList = new List();
		cList.add("모모");
		cList.add("김희철");
		cList.add("강다니엘");
		cList.add("지효");
		cList.add("JYP");
		cTextArea = new TextArea();
		cTextArea.setText("JYP: ...........");
		centerP.add(cList,BorderLayout.WEST);
		centerP.add(cTextArea,BorderLayout.CENTER);
		/**************south panel***************/
		southP = new Panel();
		southP.setLayout(new FlowLayout());
		southP.setBackground(Color.PINK);

		sTextField = new TextField();
		sTextField.setText("채팅을 입력해 주세요.");

		
		sb1=new Button("전송");
		
		southP.add(sTextField);
		southP.add(sb1);
		
		/*************붙이기***********/
		add(northP,BorderLayout.NORTH);
		add(centerP,BorderLayout.CENTER);
		add(southP,BorderLayout.SOUTH);
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new Chatting();
		
	}

}
