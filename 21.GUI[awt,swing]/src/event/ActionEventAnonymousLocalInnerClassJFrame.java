package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/*
Event program방법
  1. ActionEvent Source 선정(Button):ActionEvent
  2. ActionEvent Handler 클래스 작성
      - ActionListener interface implement
  3. ActionEvent Source객체 와 ActionEvent Handler객체를 연결해준다.
*/
public class ActionEventAnonymousLocalInnerClassJFrame extends JFrame {
	private JButton southB;
	private JButton northB;
	
	public ActionEventAnonymousLocalInnerClassJFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		southB=new JButton("이벤트쏘쓰[SOUTH]");
		northB=new JButton("이벤트쏘쓰[NORTH]");
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
				setTitle("SOUTH 버튼");
				
			}
		});
//		southB.addActionListener((ActionEvent e)->{
//			getContentPane().setBackground(Color.GREEN);
//			setTitle("SOUTH 버튼");
//		});
		northB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.RED);
				setTitle("NORTH 버튼");
				
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
