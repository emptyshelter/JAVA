package com.itwill.web;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itwill.manager.AdminManager;
import com.itwill.manager.StudentManager;
import com.itwill.vo.AdminVO;
import com.itwill.vo.StudentVo;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TabStudentPanel extends JPanel implements ActionListener {

	public static final int COURSETIME_PANEL = 1;
	public static final int COURSElIST_PANEL = 2;
	public static final int PERSONMOD_PANEL = 3;

	private JPanel panel;
	private JPanel parentP;
	public CardLayout cardLayout;

	private JButton courseTimeBtn;
	private JButton courseListBtn;
	private JButton personModBtn;

	private JSplitPane splitPane;

	private JScrollPane courseTimePanel;
	private JScrollPane courseListPanel;

	private JTable courseTimeTb;
	private JTable courseListTb;

	private DefaultTableModel defaultTableModel;

	// private Vector<String> headerNameVector;
	private ArrayList<StudentVo> studentList;

	@SuppressWarnings("rawtypes")
	private Vector<Vector> studentTBVector;

	private JPanel personModPanel;
	private JPanel contentPanel;

	private JLabel idLB;
	private JLabel pwLB;
	private JLabel phonNumLB;

	private JPasswordField passTF;
	private JTextField idTF;

	private JButton cancelBtn;
	private JButton modBtn;
	private JTextField phonNumTF;

	StudentManager studentManager;
	AdminManager adminManager;

	/**
	 * Create the panel.
	 */
	public TabStudentPanel() {

		setLayout(new BorderLayout(0, 0));
		setBounds(0, 0, 600, 400);
		splitPane = new JSplitPane();

		splitPane.setResizeWeight(0.9);
		add(splitPane, BorderLayout.CENTER);

		panel = new JPanel();
		splitPane.setLeftComponent(panel);
		panel.setLayout(null);

		courseTimeBtn = new JButton("�����ð�ǥ");
		courseTimeBtn.addActionListener(new ActionListener() {

			private Vector<String> headerNameVector = new Vector<String>();

			@SuppressWarnings({ "unchecked", "rawtypes" })
			public void actionPerformed(ActionEvent e) {

				headerNameVector = new Vector<String>();
				headerNameVector.add("����");
				headerNameVector.add("���ǽ�");
				headerNameVector.add("�⼮�ð�");
				headerNameVector.add("������");

				studentList = new ArrayList<StudentVo>();
				studentList.add(new StudentVo("�ڹ�", "1���а� 101ȣ", "������ 1����", "���缮"));
				studentList.add(new StudentVo("C���", "2���а� 202ȣ", "ȭ���� 2����", "��ȣ��"));
				studentList.add(new StudentVo("������", "3���а� 303ȣ", "������ 3����", "�̰��"));
				studentList.add(new StudentVo("�̻����", "�ڿ����� 101ȣ", "����� 1����", "���ȣ"));
				studentList.add(new StudentVo("C++", "�ڿ����� 101ȣ", "�ݿ��� 2����", "���缮"));
				studentList.add(new StudentVo("DBA", "�ڿ����� 102ȣ", "������ 3����", "���ȣ"));

				studentTBVector = new Vector<Vector>();
				for (StudentVo studentVo : studentList) {
					Vector rowVector = new Vector();
					rowVector.add(studentVo.getSubject());
					rowVector.add(studentVo.getLectRoom());
					rowVector.add(studentVo.getLectTime());
					rowVector.add(studentVo.getStName());
					studentTBVector.add(rowVector);
				}

				defaultTableModel = new DefaultTableModel(studentTBVector, headerNameVector);

				courseTimeTb.setModel(defaultTableModel);

			}
		});
		
		courseTimeBtn.setBounds(12, 51, 103, 30);
		panel.add(courseTimeBtn);

		courseListBtn = new JButton("�������");
		courseListBtn.addActionListener(new ActionListener() {

			private Vector<String> headerNameVector2 = new Vector<String>();

			@SuppressWarnings({ "unchecked", "rawtypes" })
			public void actionPerformed(ActionEvent e) {

				// Column
				headerNameVector2 = new Vector<String>();
				headerNameVector2.add("����");
				headerNameVector2.add("���ǽ�");
				headerNameVector2.add("�ð�ǥ");

				studentList = new ArrayList<StudentVo>();
				studentList.add(new StudentVo("�ڹ�", "1���а� 101ȣ", "������ 1����"));
				studentList.add(new StudentVo("C���", "2���а� 202ȣ", "ȭ���� 2����"));
				studentList.add(new StudentVo("������", "3���а� 303ȣ", "������ 3����"));
				studentList.add(new StudentVo("C++", "�ڿ����� 101ȣ", "�ݿ��� 2����"));
				studentList.add(new StudentVo("DBA", "�ڿ����� 102ȣ", "������ 3����"));

				studentTBVector = new Vector<Vector>();
				for (StudentVo studentVo : studentList) {
					Vector rowVector = new Vector();
					rowVector.add(studentVo.getSubject());
					rowVector.add(studentVo.getLectRoom());
					rowVector.add(studentVo.getLectTime());
					studentTBVector.add(rowVector);
				}

				defaultTableModel = new DefaultTableModel(studentTBVector, headerNameVector2);

				courseListTb.setModel(defaultTableModel);

			}
		});
		
		courseListBtn.setBounds(12, 124, 103, 30);
		panel.add(courseListBtn);

		personModBtn = new JButton("��������");
		personModBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		personModBtn.setBounds(12, 193, 103, 30);
		panel.add(personModBtn);

		parentP = new JPanel();
		splitPane.setRightComponent(parentP);
		cardLayout = new CardLayout(0, 0);
		parentP.setLayout(cardLayout);

		courseTimePanel = new JScrollPane();
		parentP.add(courseTimePanel, "ctp");

		courseTimeTb = new JTable();
		courseTimePanel.setViewportView(courseTimeTb);

		courseListPanel = new JScrollPane();
		parentP.add(courseListPanel, "clp");

		courseListTb = new JTable();
		courseListPanel.setViewportView(courseListTb);

		personModPanel = new JPanel();
		parentP.add(personModPanel, "pmp");
		personModPanel.setLayout(new BorderLayout(0, 0));

		contentPanel = new JPanel();
		personModPanel.add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		idLB = new JLabel("���̵�");
		idLB.setBounds(63, 93, 57, 15);
		contentPanel.add(idLB);

		pwLB = new JLabel("��й�ȣ");
		pwLB.setBounds(63, 135, 57, 15);
		contentPanel.add(pwLB);

		phonNumLB = new JLabel("��ȭ��ȣ");
		phonNumLB.setBounds(63, 178, 57, 15);
		contentPanel.add(phonNumLB);

		passTF = new JPasswordField();
		passTF.setBounds(128, 132, 130, 21);
		contentPanel.add(passTF);

		idTF = new JTextField();
		idTF.setBounds(128, 90, 130, 21);
		contentPanel.add(idTF);
		idTF.setColumns(10);

		phonNumTF = new JTextField();
		phonNumTF.setBounds(128, 175, 130, 21);
		contentPanel.add(phonNumTF);
		phonNumTF.setColumns(10);

		modBtn = new JButton("����");
		modBtn.addActionListener(new ActionListener() {
			
			@SuppressWarnings({ "deprecation" })
			public void actionPerformed(ActionEvent e) {

				String id = idTF.getText();
				String password = passTF.getText();
				String phonNumber = phonNumTF.getText();

				if (id == null || id.equals("")) {
					JOptionPane.showMessageDialog(null, "���̵� �Է��ϼ���!!");
					idTF.requestFocus();
					return;
				}

				StudentVo updateStudent = new StudentVo(id, password, phonNumber, null, null, null, null);
				
				AdminVO updateAdmin = new AdminVO(id, password, phonNumber);
				
				
				try {

					boolean isSuccess = studentManager.updateByStudent(updateStudent);
					adminManager.memberUpdate(updateAdmin);

					if (isSuccess) {
						JOptionPane.showMessageDialog(null, "ȸ������ �Ϸ�");
					} else {
						JOptionPane.showMessageDialog(null, "ȸ������ �̿Ϸ�");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "ȸ�������� ���� �߻�");
				}

			}
		});
		
		modBtn.setBounds(128, 225, 97, 23);
		contentPanel.add(modBtn);

		cancelBtn = new JButton("���");
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		cancelBtn.setBounds(237, 225, 97, 23);
		contentPanel.add(cancelBtn);

		courseTimeBtn.addActionListener(this);
		personModBtn.addActionListener(this);
		courseListBtn.addActionListener(this);
		
		/***********manager��ü����*********/
		try {
			studentManager = new StudentManager();
			adminManager = new AdminManager();
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String actionCommand = e.getActionCommand();
		switch (actionCommand) {
		
		case "�����ð�ǥ":
			cardLayout.show(parentP, "ctp");
			break;

		case "�������":
			cardLayout.show(parentP, "clp");
			break;

		case "��������":
			cardLayout.show(parentP, "pmp");
			break;

		}
	}
	
}
