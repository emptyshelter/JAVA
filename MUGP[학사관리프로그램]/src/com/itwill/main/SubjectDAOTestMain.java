package com.itwill.main;

import java.awt.Frame;
import java.util.ArrayList;

import com.itwill.dao.SubjectDAO;
import com.itwill.vo.SubjectVO;

@SuppressWarnings("serial")
public class SubjectDAOTestMain extends Frame {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		SubjectDAO subjectDAO = new SubjectDAO();

		System.out.println("-------�����Է�-------");
		subjectDAO.insert(new SubjectVO("JAVA", "������", "��123", "���а�319"));
		subjectDAO.insert(new SubjectVO("C++", "ȫ����", "��456", "���а�320"));
		subjectDAO.insert(new SubjectVO("���н�", "ȫ����", "ȭ123", "���а�305"));

		System.out.println("-------�Է��� �������� ���------");
		SubjectVO selectSubject = subjectDAO.selectByName("guard");
		System.out.println("JAVA: " + subjectDAO.selectByName("JAVA"));
		System.out.println("���н�: " + subjectDAO.selectByName("���н�"));

		System.out.println("--------�Է��� �������� ����-------");
		subjectDAO.updateByName(new SubjectVO("JAVA", "������", "��123", "���а�306"));
		subjectDAO.deleteByName("C++");

		System.out.println("----------���������-----------");
		ArrayList<SubjectVO> subjectList = subjectDAO.selectAll();
		for (SubjectVO subjectVO : subjectList) {
			System.err.println(subjectVO);
		}
	}
}
