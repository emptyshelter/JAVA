package com.itwill.main;

import com.itwill.manager.AdminManager;
import com.itwill.vo.AdminVO;

public class AdminManagerTestMain {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		AdminManager memberManager = new AdminManager();

		System.out.println("---------------ȸ�������ϱ�--------------");
		AdminVO joinMember;
		joinMember = new AdminVO("������", "123456", "01051190122");
//		joinMember = new AdminVO("�輺��", "910122", "01051190122");
//		joinMember = new AdminVO("��ȣ��", "890117", "01023456789");
//		joinMember = new AdminVO("������", "930201", "01012345678");
//		joinMember = new AdminVO("����ȣ", "920303", "01034567890");
//		joinMember = new AdminVO("������", "830707", "01025229099");
//		joinMember = new AdminVO("�ڽ���", "960409", "01036251487");
		
//		boolean isSuccess = memberManager.joinMember(joinMember);
//		System.out.println("isSuccess: " + isSuccess);
//
//		if (!isSuccess) {
//			System.out.println("�̸� �ߺ� �ٽ��ؔg��");
//		}
//
//		System.out.println("-------------�α���----------------");
//		String name = "������";
//		String pw = "830707";
//		boolean loginSuccess = memberManager.login(name, pw);
//		if (loginSuccess) {
//			System.out.println(name + " �� �α����� �����޽��ϴ� �氡��");
//		} else {
//			System.out.println(name + " �� �α��� ������");
//		}

		/*
		System.out.println("---------------�Է��� �л��� ���� ����-------------");
		AdminVO updateMember = new AdminVO("�տ���", "751225", "01056569898");
		memberManager.memberUpdate(updateMember);
		*/
		
		// System.out.println("------�Է��� �л��� ���� ����-------");
		// try {
		// memberManager.memberDelete("�����");
		// } catch (NameNotFoundExecption e) {
		// JOptionPane.showMessageDialog(null, e.getMessage());
		// }
		//
		// System.out.println("---------------ȸ�� ��ü ���� ���-------------");
		// ArrayList<AdminVO> memberList = memberManager.getmemberList();
		// for (AdminVO memberVO : memberList) {
		// System.out.println(memberVO);
		// }

	}

}
