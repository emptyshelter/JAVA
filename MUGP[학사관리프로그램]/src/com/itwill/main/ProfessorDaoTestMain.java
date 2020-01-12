package com.itwill.main;

import com.itwill.dao.ProfessorDao;
import com.itwill.vo.ProfessorVo;

public class ProfessorDaoTestMain {

	public static void main(String[] args) throws Exception {

		ProfessorDao professorDao = new ProfessorDao();
		System.out.println("-------insert-----");
		professorDao.insert(new ProfessorVo(1, "��ȣ��", "C���", "�̹��ִ� ������Ʈ", "���� 1�� 101ȣ", "C��� �������", "���ȣ", "�Ѻ�"));
		professorDao.insert(new ProfessorVo(2, "���缮", "�ڹ�", "�̹��ִ� �ް�", "���� 2�� 202ȣ", "�ڹ� �������", "���ü�", "�Ѻ�"));
		professorDao.insert(new ProfessorVo(3, "�̰��", "������", "�̹��ִ� �ް�", "���� 3�� 303ȣ", "������ �������", "���ȣ", "�Ϻ�"));

		/*
		System.out.println("-------selectByPN()-----");
		ProfessorVo selectProfessor = professorDao.selectByPN(1);
		System.out.println(selectProfessor);

		System.out.println("-------updateByPN()-----");
//		professorDao.updateByPN(new ProfessorVo(2, "�ھ�", "�ڹ�", "�̹��ִ� for��", "����3�� 305ȣ", "�ڹ� �������", "��", "�Ѻ�"));

		System.out.println("-------selectAll-----");
		ArrayList<ProfessorVo> professorList = professorDao.selectAll();
		for (ProfessorVo professorVo : professorList) {
			System.out.println(professorVo);
		}
		*/
	}

}
