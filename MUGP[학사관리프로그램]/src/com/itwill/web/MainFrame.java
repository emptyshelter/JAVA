package com.itwill.web;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import com.itwill.manager.AdminManager;
import com.itwill.manager.BbsFreeManager;
import com.itwill.manager.BbsManager;
import com.itwill.manager.SubjectManager;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	/**** Manager ****/
	public AdminManager adminManager;
	public BbsManager bbsManager;
	public BbsFreeManager bbsFreeManager;
	public SubjectManager subjectManager;

	/*
	 * 패널 선언
	 */
	BbsListPanel bbsListPanel;
	AdminListPanel adminStudentListPanel;
	AdminJoinPanel adminJoinPanel;

	private LoginDialog loginDialog;

	private TabLoginPanel tabLoginPanel;
	private TabStudentPanel tabStudentPanel;
	private TabRecordPanel tabRecordPanel;
	private TabProfessorPanel tabProfessorPanel;
	private TabBbsPanel tabBbsPanel;
	private TabAdminPanel tabAdminPanel;

	private String nowLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws Exception
	 */
	public MainFrame() throws Exception {
		

		boolean check = false;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 650, 450);

		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		try {
			adminManager = new AdminManager();
			subjectManager = new SubjectManager();
			bbsManager = new BbsManager();
			bbsFreeManager = new BbsFreeManager();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "에러발생");
			System.exit(0);
		}

		/*
		 * 패널 객체 생성
		 */
		bbsListPanel = new BbsListPanel(this);
		adminStudentListPanel = new AdminListPanel(this);
		adminJoinPanel = new AdminJoinPanel(this);

		tabLoginPanel = new TabLoginPanel();
		tabLoginPanel.setBackground(SystemColor.menu);
		tabLoginPanel.setForeground(SystemColor.menu);

		tabbedPane.addTab("로그인", null, tabLoginPanel, null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 340, 619, 33);
		tabLoginPanel.setLayout(null);
		JLabel mainImageL = new JLabel("");
		mainImageL.setBounds(9, 2, 600, 340);
		tabLoginPanel.add(mainImageL);
		
		File backImageFile = new File("C:\\JAVAIOT\\workspaceSE\\MUGP[학사관리프로그램]\\image\\login_screen.gif");
		
//		ImageIcon icon = new ImageIcon(MainFrame.class.getResource("image\\login_screen.gif"));

		panel.setBackground(SystemColor.menu);
		tabLoginPanel.add(panel);

		JButton btnLogin = new JButton("Login");
		panel.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(SystemColor.menu);
				loginDialog = new LoginDialog(MainFrame.this);
				loginDialog.setModal(true);
				loginDialog.setVisible(true);

				nowLogin = adminManager.getNowLogin();

				boolean check = loginDialog.isEnable();
				if (check == true || check == false) {
					tabbedPane.setEnabledAt(1, check); // login 성공 여부에 따라 second
					// Tab 활성화 여부 결정
					tabbedPane.setEnabledAt(2, check);
					tabbedPane.setEnabledAt(3, check);
					tabbedPane.setEnabledAt(4, check);
					tabbedPane.setEnabledAt(5, false);
					if (nowLogin != null) {

						if (nowLogin.equals("관리자")) {
							tabbedPane.setEnabledAt(5, check);
						}

					}
				}
			}
		});
		Image backImage = ImageIO.read(backImageFile);
		Image scaledBackImage = backImage.getScaledInstance(600, 400, 0);
		mainImageL.setIcon(new ImageIcon(scaledBackImage));

		tabStudentPanel = new TabStudentPanel();
		tabStudentPanel.setBackground(SystemColor.menu);
		tabbedPane.addTab("학생", null, tabStudentPanel, null);
		tabbedPane.setEnabledAt(1, check);
		// 초기 false로 설정되어 있어서 login 성공 이전에는 tab이 비활성화

		tabRecordPanel = new TabRecordPanel(MainFrame.this);
		tabRecordPanel.setBackground(SystemColor.menu);
		tabbedPane.addTab("성적", null, tabRecordPanel, null);
		tabbedPane.setEnabledAt(2, check);

		tabProfessorPanel = new TabProfessorPanel(MainFrame.this);
		tabProfessorPanel.setBackground(SystemColor.menu);
		tabbedPane.addTab("교수님", null, tabProfessorPanel, null);
		tabbedPane.setEnabledAt(3, check);

		tabBbsPanel = new TabBbsPanel();
		tabBbsPanel.setBackground(SystemColor.menu);
		tabbedPane.addTab("공지사항", null, tabBbsPanel, null);
		tabbedPane.setEnabledAt(4, check);

		tabAdminPanel = new TabAdminPanel();
		tabAdminPanel.setBackground(SystemColor.menu);
		tabbedPane.addTab("관리자", null, tabAdminPanel, null);
		tabbedPane.setEnabledAt(5, check);
		tabAdminPanel.setLayout(null);

		BbsListPanel bbsListPanel = new BbsListPanel(this);
		bbsListPanel.setBounds(0, 0, 619, 373);
		tabBbsPanel.add(bbsListPanel);
		tabBbsPanel.setLayout(null);

		AdminJoinPanel adminJoinPanel_1 = new AdminJoinPanel(this);
		adminJoinPanel_1.setBackground(SystemColor.menu);
		adminJoinPanel_1.setBounds(12, 10, 97, 56);
		tabAdminPanel.add(adminJoinPanel_1);

		AdminListPanel adminListPanel = new AdminListPanel(this);
		adminListPanel.setBackground(SystemColor.menu);
		adminListPanel.setBounds(173, 10, 434, 286);
		tabAdminPanel.add(adminListPanel);
		tabbedPane.setEnabledAt(1, check);
	}

	public String getNowLogin() {
		return nowLogin;
	}

}