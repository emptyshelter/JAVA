package com.itwill.web;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;

import com.itwill.manager.ProfessorManager;
import com.itwill.vo.ProfessorVo;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "unused", "serial" })
public class PlanP extends JPanel{
	private JTextField professName;
	private JTextField subject;
	private JTextField PRoom;
	private JTextField booKName;
	private JTextField bookWriter;
	private JTextField bookMaker;
	
	TabProfessorPanel tabProfessorPanel;
	ProfessorManager professorManager;
	ProfessorVo professorVo;

	/**
	 * Create the panel.
	 */
	public PlanP(TabProfessorPanel tabProfessorPanel) {
		
		
		this.tabProfessorPanel = tabProfessorPanel;
		try {
			professorManager = tabProfessorPanel.professorManager;
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		
		try {
			professorVo =professorManager.findSubjectPlan(1);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "ã�� ������ �����ϴ�.");
		}
		setLayout(null);
		JLabel professor = new JLabel("New label");
		professor.setBounds(15, 16, 105, 96);
		add(professor);
		
		professName = new JTextField();
		professName.setBounds(238, 23, 116, 21);
		add(professName);
		professName.setColumns(10);
		professName.setText(professorVo.getpName());
		
		subject = new JTextField();
		subject.setBounds(238, 54, 116, 21);
		add(subject);
		subject.setColumns(10);
		subject.setText(professorVo.getSubject());
		
		PRoom = new JTextField();
		PRoom.setBounds(238, 85, 116, 21);
		add(PRoom);
		PRoom.setColumns(10);
		PRoom.setText(professorVo.getpRoom());
		
		JLabel lblNewLabel_1 = new JLabel("\uAD50\uC218 \uC774\uB984:");
		lblNewLabel_1.setBounds(146, 26, 68, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uACFC\uBAA9:");
		lblNewLabel_2.setBounds(146, 57, 56, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uAD50\uC218\uBC29:");
		lblNewLabel_3.setBounds(146, 88, 56, 15);
		add(lblNewLabel_3);
		
		JLabel book = new JLabel("New label");
		book.setBounds(15, 120, 105, 96);
		add(book);
		
		
		JLabel lblNewLabel_5 = new JLabel("\uAC15\uC758 \uAD50\uC7AC:");
		lblNewLabel_5.setBounds(146, 136, 68, 15);
		add(lblNewLabel_5);
		
		JLabel label = new JLabel("\uAD50\uC7AC \uC800\uC790:");
		label.setBounds(146, 167, 68, 15);
		add(label);
		
		JLabel label_1 = new JLabel("\uAD50\uC7AC \uCD9C\uD310\uC0AC:");
		label_1.setBounds(146, 198, 80, 15);
		add(label_1);
		
		booKName = new JTextField();
		booKName.setBounds(238, 133, 116, 21);
		add(booKName);
		booKName.setColumns(10);
		booKName.setText(professorVo.getBookName());
		
		bookWriter = new JTextField();
		bookWriter.setBounds(238, 164, 116, 21);
		add(bookWriter);
		bookWriter.setColumns(10);
		bookWriter.setText(professorVo.getBookWriter());
		
		bookMaker = new JTextField();
		bookMaker.setBounds(238, 195, 116, 21);
		add(bookMaker);
		bookMaker.setColumns(10);
		bookMaker.setText(professorVo.getBookMaker());
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(41, 226, 345, 50);
		add(textArea);
		textArea.setText(professorVo.getSubjectP());
		
		JButton btnNewButton = new JButton("\uC218\uC815");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pName = professName.getText();		//�����̸�
				String subjectN = subject.getText();	//����
				String pR = PRoom.getText();			//������
				String bookN = booKName.getText();		//å�̸�
				String bookW = bookWriter.getText();		//å����
				String bookM = bookMaker.getText();		//å ���ǻ�
				int number = 1;
			}
		});
		btnNewButton.setBounds(366, 193, 72, 23);
		add(btnNewButton);

	}
	
	
}
