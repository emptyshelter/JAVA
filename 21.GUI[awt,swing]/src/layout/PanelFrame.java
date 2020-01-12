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
		
		
		sb1=new Button("�߰�");
		sb2=new Button("����");
		sb3=new Button("����");
		sb4=new Button("����Ʈ");
		
		southP.add(sb1);
		southP.add(sb2);
		southP.add(sb3);
		southP.add(sb4);
		
		/**************north panel***************/
		northP = new Panel();
		northP.setBackground(Color.ORANGE);
		northP.setLayout(new FlowLayout());
		
		nb1= new Button("����");
		nb2= new Button("�л�");
		nb3= new Button("����");
		
		northP.add(nb1);
		northP.add(nb2);
		northP.add(nb3);
		

		/**************center panel***************/
		centerP = new Panel();
		centerP.setBackground(Color.LIGHT_GRAY);
		centerP.setLayout(new BorderLayout());
		cList = new List();
		cList.add("������");
		cList.add("�̼Ҷ�");
		cList.add("��ȿ��");
		cList.add("����");
		cList.add("�嵿��");
		cTextArea = new TextArea();
		cTextArea.setText("������: ���� ���ϼ���?");
		centerP.add(cList,BorderLayout.WEST);
		centerP.add(cTextArea,BorderLayout.CENTER);
		
		/*
		 * Frame�� Panel�� ���ϼ� �ִ�.
		 * Panel�� Panel�� ���ϼ� �ִ�.
		 * Frame�� Frame�� ���ϼ� ����.
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