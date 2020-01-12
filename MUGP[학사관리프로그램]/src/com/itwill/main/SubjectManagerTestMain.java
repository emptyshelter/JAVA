package com.itwill.main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.itwill.manager.SubjectManager;
import com.itwill.vo.SubjectVO;

public class SubjectManagerTestMain {

	public static void main(String[] args) throws Exception {
		SubjectManager subjectManager = new SubjectManager();

		System.out.println("---------------�������ϱ�--------------");
		SubjectVO uploadsubject = new SubjectVO("�ڷᱸ��", "����ȫ", "��123", "���а�101");
		boolean isSuccess = subjectManager.SubjectPlus(uploadsubject);
		System.out.println("isSuccess: " + isSuccess);

		if (!isSuccess) {
			System.out.println("�����ߺ� �ٽ��ؔg��");
		}

		System.out.println("---------------�Է��� ������ ���� ����-------------");
		SubjectVO updateMember = new SubjectVO("JAVA", "������", "��789", "���а�320");
		subjectManager.subjectUpdate(updateMember);

		System.out.println("------�Է��� ������ ���� ����-------");
		try {
			subjectManager.subjectDelete("C++");
		} catch (SubNameNotFoundExecption e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

		System.out.println("---------------���� ��ü ���� ���-------------");
		ArrayList<SubjectVO> subjectList = subjectManager.getsubjectList();
		for (SubjectVO subjectVO : subjectList) {
			System.out.println(subjectVO);
		}

	}
}
