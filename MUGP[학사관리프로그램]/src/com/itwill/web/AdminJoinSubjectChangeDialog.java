package com.itwill.web;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.itwill.manager.SubjectManager;
import com.itwill.vo.SubjectVO;

@SuppressWarnings("serial")
public class AdminJoinSubjectChangeDialog extends JDialog {
	
	MainFrame mainFrame;

	private final JPanel contentPanel = new JPanel();
	private JTextField subTF;
	private JTextField profTF;
	private JTextField timeTF;
	private JTextField roomTF;
	
	SubjectManager subjectManager;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		try {
			AdminJoinSubjectChangeDialog dialog = new AdminJoinSubjectChangeDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/

	/**
	 * Create the dialog.
	 */
	public AdminJoinSubjectChangeDialog(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		
		try {
		subjectManager = mainFrame.subjectManager;
		} catch (Exception e) {
			e.printStackTrace();
		}
		setBounds(100, 100, 226, 179);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("SUBJECT");
			lblNewLabel.setBounds(12, 10, 57, 15);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("PROF");
			lblNewLabel_1.setBounds(12, 35, 57, 15);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("TIME");
			lblNewLabel_2.setBounds(12, 60, 57, 15);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("ROOM");
			lblNewLabel_3.setBounds(12, 85, 57, 15);
			contentPanel.add(lblNewLabel_3);
		}
		{
			subTF = new JTextField();
			subTF.setBounds(81, 7, 116, 21);
			contentPanel.add(subTF);
			subTF.setColumns(10);
		}
		{
			profTF = new JTextField();
			profTF.setBounds(81, 32, 116, 21);
			contentPanel.add(profTF);
			profTF.setColumns(10);
		}
		{
			timeTF = new JTextField();
			timeTF.setBounds(81, 57, 116, 21);
			contentPanel.add(timeTF);
			timeTF.setColumns(10);
		}
		{
			roomTF = new JTextField();
			roomTF.setBounds(81, 82, 116, 21);
			contentPanel.add(roomTF);
			roomTF.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String sub = subTF.getText();
						String prof = profTF.getText();
						String time = timeTF.getText();
						String room = roomTF.getText();
						
						if (sub == null || sub.equals("")) {
							JOptionPane.showMessageDialog(null, "과목을 입력하세요");
							subTF.requestFocus();
							return;
						} else if (prof == null || prof.equals("")) {
							JOptionPane.showMessageDialog(null, "교수이름을 입력하세요");
							profTF.requestFocus();
							return;
						} else if (time == null || time.equals("")) {
							JOptionPane.showMessageDialog(null, "강의시간을 입력하세요");
							timeTF.requestFocus();
							return;
						} else if (room == null || room.equals("")) {
							JOptionPane.showMessageDialog(null, "강의실을 입력하세요");
							roomTF.requestFocus();
							return;
						}
						
						SubjectVO joinSubject = new SubjectVO(sub, prof, time, room);
						
						try {
							
						boolean isSuccess = subjectManager.SubjectPlus(joinSubject);
						
						if (isSuccess) {
							JOptionPane.showMessageDialog(null, "과목등록성공");
							dispose();
						} else {
							JOptionPane.showMessageDialog(null, "과목등록실패");
						}
						} catch (Exception e1) {
							//과목등록실패
							e1.printStackTrace();
							JOptionPane.showMessageDialog(null, "과목등록애로발생");
						}			
					}
				});
				
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
