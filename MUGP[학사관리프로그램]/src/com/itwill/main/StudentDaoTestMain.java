package com.itwill.main;

import com.itwill.dao.StudentDao;
import com.itwill.vo.StudentVo;

public class StudentDaoTestMain {

	public static void main(String[] args) throws Exception {

		/*
		 * Data Access ����� �����ϴ� ��ü ����
		 */


		StudentDao studentDao = new StudentDao();
	
		System.out.println("----- �л� ���� ��� -----");

		studentDao.insertCourse(new StudentVo("�輺��", "123456", "010-0000-0001", "�ڹ�", "1���а� 101ȣ", "������ 1����", "���ȣ"));
		studentDao.insertCourse(new StudentVo("��ȣ��", "123456", "010-0000-0002", "������", "2���а� 202ȣ", "ȭ���� 2����", "���ȣ"));
		studentDao.insertCourse(new StudentVo("������", "123456", "010-0003-0003", "�ڹ�", "1���а� 101ȣ", "������ 1����", "���ȣ"));
		studentDao.insertCourse(new StudentVo("������", "123456", "010-0000-0004", "C���", "3���а� 303ȣ", "������ 3����", "���ȣ"));
		studentDao.insertCourse(new StudentVo("����ȣ", "123456", "010-0000-0005", "�ڹ�", "�ڿ����� 202ȣ", "����� 2����", "���ȣ"));
		studentDao.insertCourse(new StudentVo("�ڽ���", "123456", "010-0000-0006", "������", "�ڿ����� 101ȣ", "�ݿ��� 1����", "���ȣ"));

		/*
		System.out.println("\n----- �л��� �������� ���� -----");
		boolean flag = studentDao
				.updateByStudent(new StudentVo("������", "1234567", "010-2522-1111", "�ڹ�", "1���а� 101ȣ", "������ 1����", "���缮"));
		System.out.println("flag: " + flag);
	
		System.out.println("\n----- �л��� �ð�ǥ, ������� ��ȸ -----");

		StudentVo selectStudent = studentDao.selectByName("������");
		// StudentVo selectStudent = studentDao.selectByUndergrad("1234567");
		System.out.println("�л� ��ȸ: " + selectStudent);
		*/

	}

}
