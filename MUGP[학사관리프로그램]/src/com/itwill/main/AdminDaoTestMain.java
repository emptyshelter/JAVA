package com.itwill.main;

import java.awt.Frame;
import java.util.ArrayList;

import com.itwill.dao.AdminDAO;
import com.itwill.vo.AdminVO;

@SuppressWarnings("serial")
public class AdminDaoTestMain extends Frame {

	public static void main(String[] args) throws Exception {
		AdminDAO memberDao = new AdminDAO(); // dao���� �������� �� ��̸���Ʈ�� ���Ե�

		System.out.println("-------�л������Է�-----");
		memberDao.insert(new AdminVO("�輺��", "123456", "01000000001"));
		memberDao.insert(new AdminVO("��ȣ��", "123456", "01000000002"));
//		memberDao.insert(new AdminVO("������", "123456", "01000000003"));
		memberDao.insert(new AdminVO("������", "123456", "01000000004"));
		memberDao.insert(new AdminVO("����ȣ", "123456", "01000000005"));
		memberDao.insert(new AdminVO("�ڽ���", "123456", "01000000006"));
		memberDao.insert(new AdminVO("�̰��", "700000", "01003000003"));
		memberDao.insert(new AdminVO("��ȣ��", "700000", "01000070009"));
		memberDao.insert(new AdminVO("���缮", "700000", "01000080010"));
		memberDao.insert(new AdminVO("������", "123456", "12-345-6789"));
		

		/*
		System.out.println("-------�Է��� �л��� ���� ���-----");
		AdminVO selectMember = memberDao.selectByName("guard");
		System.out.println("guard:" + selectMember);
		System.out.println("�輺��:" + memberDao.selectByName("�輺��"));
		System.out.println("������:" + memberDao.selectByName("������"));

		System.out.println("-------�Է��� �л��� ���� ����-----");
		memberDao.updateByName(new AdminVO("�ڽ���", "940525", "01042131212"));
		memberDao.deleteByName("���ϴ�");
		*/
		System.out.println("-------���� ����Ǿ��ִ� �л� ���� ���-----");
		ArrayList<AdminVO> memberList = memberDao.selectAll();
		for (AdminVO memberVO : memberList) {
			System.out.println(memberVO);
		}
		
	}
}
