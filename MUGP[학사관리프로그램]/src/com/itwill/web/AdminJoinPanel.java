package com.itwill.web;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.itwill.manager.AdminManager;

@SuppressWarnings("serial")
public class AdminJoinPanel extends JPanel {

	AdminJoinStudentChangeDialog adminJoinStudentChangeDialog;
	AdminJoinSubjectChangeDialog adminJoinSubjectChangeDialog;
	@SuppressWarnings("unused")
	private JPanel contentPane;

	AdminManager adminManager;
	MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	public AdminJoinPanel(MainFrame mainFrame) {
		this.mainFrame = mainFrame;

		try {
			adminManager = mainFrame.adminManager;
		} catch (Exception e) {
			e.printStackTrace();
		}

		setLayout(null);

		JButton adminStudentJoinB = new JButton("학생등록");
		adminStudentJoinB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminJoinStudentChangeDialog = new AdminJoinStudentChangeDialog(mainFrame);
				adminJoinStudentChangeDialog.setModal(true);
				adminJoinStudentChangeDialog.setVisible(true);
			}
		});
		adminStudentJoinB.setBounds(0, 0, 97, 23);
		add(adminStudentJoinB);

		JButton adminSubjectJoinB = new JButton("과목등록");
		adminSubjectJoinB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminJoinSubjectChangeDialog = new AdminJoinSubjectChangeDialog(mainFrame);
				adminJoinSubjectChangeDialog.setModal(true);
				adminJoinSubjectChangeDialog.setVisible(true);
			}
		});
		adminSubjectJoinB.setBounds(0, 33, 97, 23);
		add(adminSubjectJoinB);

	}
}
