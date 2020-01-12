package com.itwill.web;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itwill.manager.AdminManager;
import com.itwill.manager.SubjectManager;
import com.itwill.vo.AdminVO;
import com.itwill.vo.SubjectVO;

@SuppressWarnings("serial")
public class AdminListPanel extends JPanel {
	private JTable adminTable;

	DefaultTableModel defaultTableModel;
	ArrayList<AdminVO> studentList; // �Ŵ������� ���Ѽ� ���������� ��̸���Ʈ
	ArrayList<SubjectVO> subjectList;

	@SuppressWarnings("rawtypes")
	Vector columVector; //
	@SuppressWarnings("rawtypes")
	Vector DateVector;

	AdminManager adminManager;
	SubjectManager subjectManager;

	MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	public AdminListPanel(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		try {
			adminManager = mainFrame.adminManager;
			subjectManager = mainFrame.subjectManager;

		} catch (Exception e) {
			e.printStackTrace();
		}

		setLayout(null);

		JButton adminStudentListB = new JButton("�л����");
		adminStudentListB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					getStudentList();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		adminStudentListB.setBounds(336, 0, 97, 23);
		add(adminStudentListB);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 33, 433, 253);
		add(scrollPane);

		adminTable = new JTable();
		scrollPane.setViewportView(adminTable);

		JButton adminSubjectListB = new JButton("������");
		adminSubjectListB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					getSubjectList();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		adminSubjectListB.setBounds(0, 0, 97, 23);
		add(adminSubjectListB);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void getStudentList() throws Exception {
		studentList = adminManager.getmemberList();
		columVector = new Vector();

		columVector.add("�̸�");
		columVector.add("�ֹι�ȣ");
		columVector.add("����ó");

		DateVector = new Vector();

		for (AdminVO student : studentList) {
			Vector rowVector = new Vector(); // �÷����Ϳ��� �������ذ� �������ε��� rowvector��
												// �ְ�

			rowVector.add(student.getName());
			rowVector.add(student.getJoomin());
			rowVector.add(student.getCallnumber());

			DateVector.add(rowVector); // �װ� �����͹��Ϳ� �־���
		}

		defaultTableModel = new DefaultTableModel(DateVector, columVector);

		adminTable.setModel(defaultTableModel);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void getSubjectList() throws Exception {
		subjectList = subjectManager.getsubjectList();
		columVector = new Vector();

		columVector.add("����");
		columVector.add("����");
		columVector.add("�ð�");
		columVector.add("���ǽ�");

		DateVector = new Vector();

		for (SubjectVO subject : subjectList) {
			Vector rowVector = new Vector(); // �÷����Ϳ��� �������ذ� �������ε��� rowvector��
												// �ְ�

			rowVector.add(subject.getSub());
			rowVector.add(subject.getProf());
			rowVector.add(subject.getTime());
			rowVector.add(subject.getRoom());

			DateVector.add(rowVector); // �װ� �����͹��Ϳ� �־���
		}

		defaultTableModel = new DefaultTableModel(DateVector, columVector);

		adminTable.setModel(defaultTableModel);
	}

}
