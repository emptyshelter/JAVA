package com.itwill.main;

import com.itwill.manager.StudentManager;
import com.itwill.vo.StudentVo;

public class StudentManagerTestMain {

	public static void main(String[] args) throws Exception {

		StudentManager studentManager = new StudentManager();

		/*
		System.out.println("----- �л� ���� ��� -----");
		StudentVo register = new StudentVo("������", "830707", "010-2522-9099", "�ڹ�", "1���а� 101ȣ", "������ 1����", "���ȣ");
		boolean registerSuccess = studentManager.registerCourse(register);
		if (!registerSuccess) {
			System.out.println("�̹� ��������� �Ǿ� �ֽ��ϴ�.");
		} else {
			System.out.println("��������� �Ϸ� �Ǿ����ϴ�.");
		}
		

		System.out.println("\n----- �л��� �������� ���� -----");
//		boolean updateSuccess = studentManager.updateByStudent(new StudentVo("������", "830707", "010-1234-5678", "C���", "2���а� 202ȣ", "ȭ���� 1����", "���缮"));
		boolean updateSuccess = studentManager.updateByStudent(new StudentVo("������", "830707", "010-1234-5678", "C���", "2���а� 202ȣ", "ȭ���� 1����", "���缮"));
		if (!updateSuccess) {
			System.out.println("�й��� ��ġ���� �ʽ��ϴ�.");
		} else {
			System.out.println("�л��� ������ �����Ǿ����ϴ�.");
		}
		*/
		System.out.println("\n----- �л��� ���� �ð�ǥ ��ȸ-----");
		// StudentVo selectStudent = studentManager.selectByUndergrad("1234567");
		StudentVo selectStudent = studentManager.selectByName("������");
		System.out.println("�л� �ð�ǥ: " + selectStudent);
		
	}
}
