package com.itwill.web;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.manager.AdminManager;
import com.itwill.vo.AdminVO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AdminJoinStudentChangeDialog extends JDialog {

	MainFrame mainFrame;

	private final JPanel contentPanel = new JPanel();
	private JTextField nameTF;
	private JTextField joominTF;
	private JTextField callnumberTF;

	AdminManager adminManager;

	/**
	 * Launch the application.
	 */

	/*
	 * public static void main(String[] args) { try {
	 * AdminJoinStudentChangeDialog dialog = new AdminJoinStudentChangeDialog();
	 * dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	 * dialog.setVisible(true); } catch (Exception e) { e.printStackTrace(); } }
	 */

	/**
	 * Create the dialog.
	 */
	public AdminJoinStudentChangeDialog(MainFrame mainFrame) {

		this.mainFrame = mainFrame;

		try {

			adminManager = mainFrame.adminManager;

		} catch (Exception e) {

			e.printStackTrace();

		}

		setBounds(100, 100, 227, 162);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("NAME");
			lblNewLabel.setBounds(12, 10, 57, 15);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("JOOMIN");
			lblNewLabel_1.setBounds(12, 35, 57, 15);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("PHONE");
			lblNewLabel_2.setBounds(12, 60, 57, 15);
			contentPanel.add(lblNewLabel_2);
		}
		{
			nameTF = new JTextField();
			nameTF.setBounds(81, 7, 116, 21);
			contentPanel.add(nameTF);
			nameTF.setColumns(10);
		}
		{
			joominTF = new JTextField();
			joominTF.setBounds(81, 32, 116, 21);
			contentPanel.add(joominTF);
			joominTF.setColumns(10);
		}
		{
			callnumberTF = new JTextField();
			callnumberTF.setBounds(81, 57, 116, 21);
			contentPanel.add(callnumberTF);
			callnumberTF.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton adminStudentJoinB = new JButton("JOIN");
				adminStudentJoinB.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						String name = nameTF.getText();
						String joomin = joominTF.getText();
						String callnumber = callnumberTF.getText();

						if (name == null || name.equals("")) {
							JOptionPane.showMessageDialog(null, "이름을 입력하세요");
							nameTF.requestFocus();
							return;
						} else if (joomin == null || joomin.equals("")) {

							JOptionPane.showMessageDialog(null, "주민번호를 입력하세요");
							joominTF.requestFocus();
							return;
						} else if (callnumber == null || callnumber.equals("")) {

							JOptionPane.showMessageDialog(null, "연락처를 입력하세요");
							callnumberTF.requestFocus();
							return;
						}

						AdminVO joinStudent = new AdminVO(name, joomin, callnumber);

						try {

							boolean isSuccess = adminManager.joinMember(joinStudent);

							if (isSuccess) {

								JOptionPane.showMessageDialog(null, "학생등록성공");
								dispose();

							} else {

								JOptionPane.showMessageDialog(null, "학생등록성공실패");
							}

						} catch (Exception e1) {

							// 학생등록성공실패
							e1.printStackTrace();
							JOptionPane.showMessageDialog(null, "학생등록성공애로발생");
						}
					}
				});

				adminStudentJoinB.setActionCommand("OK");
				buttonPane.add(adminStudentJoinB);
				getRootPane().setDefaultButton(adminStudentJoinB);
			}
			{
				JButton adminStudentCancelB = new JButton("CANCEL");
				adminStudentCancelB.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				adminStudentCancelB.setActionCommand("Cancel");
				buttonPane.add(adminStudentCancelB);
			}
		}
	}

}
