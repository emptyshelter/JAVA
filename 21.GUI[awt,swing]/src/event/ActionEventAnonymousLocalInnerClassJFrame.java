package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/*
Event program���
  1. ActionEvent Source ����(Button):ActionEvent
  2. ActionEvent Handler Ŭ���� �ۼ�
      - ActionListener interface implement
  3. ActionEvent Source��ü �� ActionEvent Handler��ü�� �������ش�.
*/
public class ActionEventAnonymousLocalInnerClassJFrame extends JFrame {
	private JButton southB;
	private JButton northB;
	
	public ActionEventAnonymousLocalInnerClassJFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		southB=new JButton("�̺�Ʈ�[SOUTH]");
		northB=new JButton("�̺�Ʈ�[NORTH]");
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(southB,BorderLayout.SOUTH);
		this.getContentPane().add(northB,BorderLayout.NORTH);
		
		/*
		 * event
		 */
		southB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.GREEN);
				setTitle("SOUTH ��ư");
				
			}
		});
//		southB.addActionListener((ActionEvent e)->{
//			getContentPane().setBackground(Color.GREEN);
//			setTitle("SOUTH ��ư");
//		});
		northB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.RED);
				setTitle("NORTH ��ư");
				
			}
		});
		
		
		
		setSize(300,400);
		setVisible(true);
	}
	/**********************************************/
	public static void main(String[] args) {
		new ActionEventAnonymousLocalInnerClassJFrame();

	}

}