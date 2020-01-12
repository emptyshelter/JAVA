package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/*
1. �̺�Ʈ �ҽ� ���� :�ϳ��� �����쿡�� ���� ���� ������Ʈ�� ������ �� �����Ƿ�
					 ������ �̺�Ʈ�� �߻��Ǹ� ó���� ������Ʈ�� �����Ѵ�. 
2. �̺�Ʈ �ڵ鷯(������) Ŭ�����ۼ� : 
			�̺�Ʈ�� ���������� ó���� �� �ֵ��� 
            �ش� �̺�Ʈ�� ó���� �̺�Ʈ ������ �������̽��� 
            �̿��ؼ� �̺�Ʈ �ڵ鷯(������) Ŭ������ �ۼ��Ѵ�. 

3. �̺�Ʈ �ҽ���ü�� �̺�Ʈ �ڵ鷯(������)��ü ���� :
 				�̺�Ʈ �����ʰ� �ۼ��̵Ǹ� �����ʿ� �̺�Ʈ �ҽ��� ������ �Ͽ� 
 				�̺�Ʈ �ҽ����� ���������� �̺�Ʈ�� �߻��� �Ǹ� ó���Ҽ� �ֵ��� 
				addXXXXListener()�Լ��� ���� ������ �����ش�.  
				XXXX�κ��� �ش� ������Ʈ�� ���� �� �ִ� ������ �̸��� �ǹ��Ѵ�.
	  
	  ���� ��� ��ư�� ActionEvent�� ó���ϱ� ���Ͽ� 
	  ��ư���ٰ� addActionListener�� ���̴� ����̴�.

 */
public class ActionEventJFrame extends JFrame {
	private JButton southB;
	private JButton northB;
	
	public ActionEventJFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		southB=new JButton("�̺�Ʈ�[SOUTH]");
		northB=new JButton("�̺�Ʈ�[NORTH]");
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(southB,BorderLayout.SOUTH);
		this.getContentPane().add(northB,BorderLayout.NORTH);
		
		/*
		 * event
		 */
		southB.addActionListener(
				new SouthButtonActionEventHandler(this));
		northB.addActionListener(
				new NorthButtonActionEventHandler());
		
		
		
		setSize(300,400);
		setVisible(true);
	}
	/****************************************************************/
	public class NorthButtonActionEventHandler 
		implements ActionListener{
		int count;
		@Override
		public void actionPerformed(ActionEvent e) {
			int r = (int)(Math.random()*256);
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			northB.setBackground(new Color(r,g,b));
			setTitle("north button click count:"+ ++count);
			getContentPane().setBackground(new Color(r,g,b));
		}
	}
	/****************************************************************/
	public static void main(String[] args) {
		new ActionEventJFrame();

	}

}