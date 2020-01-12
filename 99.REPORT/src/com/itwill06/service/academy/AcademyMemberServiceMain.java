package com.itwill06.service.academy;

public class AcademyMemberServiceMain {

	public static void main(String[] args) {
		AcademyMemberService academyMemberService=new AcademyMemberService();
		System.out.println("1.AcademyMember ��ü���");
		academyMemberService.print();
		System.out.println("2.��ȣ 1 �� AcademyMember ��ü ����������ȯ����");
		AcademyMember findMember=
				academyMemberService.findAcademyMemberByNo(1);
		findMember.print();
		System.out.println(findMember);
		System.out.println("2.��ȣ 2 �� AcademyMember ��ü ����������ȯ����");
		findMember=
				academyMemberService.findAcademyMemberByNo(2);
		findMember.print();
		System.out.println(findMember);
		System.out.println("3.AcademyMember �߿��� AcademyStudent��ü�迭 ����������ȯ����");
		AcademyMember[] findMembers=
				academyMemberService.findAcademyMembersByType(AcademyMember.STUDENT_TYPE);
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println("3.AcademyMember �߿��� AcademyGangsa��ü�迭 ����������ȯ����");
		findMembers=
				academyMemberService.findAcademyMembersByType(AcademyMember.GANGSA_TYPE);
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println("3.AcademyMember �߿��� AcademyStaff��ü�迭 ����������ȯ����");
		findMembers=
				academyMemberService.findAcademyMembersByType(AcademyMember.STAFF_TYPE);
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println(
		"4.AcademyMember �߿��� �ڹٹ���  AcademyStudent��ü�� �迭����������ȯ����");
		findMembers=
				academyMemberService.findByAcademyMembers(AcademyMember.STUDENT_TYPE,"�ڹ�");
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println(
		"4.AcademyMember �߿��� �����μ��� AcademyStaff  ��ü�� �迭����������ȯ����");
		findMembers=
				academyMemberService.findByAcademyMembers(AcademyMember.STAFF_TYPE, "����");
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println(
		"4.AcademyMember �߿��� �ڹٰ����� AcademyGangsa ��ü�� �迭����������ȯ����");
		findMembers=
				academyMemberService.findByAcademyMembers(AcademyMember.GANGSA_TYPE, "DB");
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println("---------------------------------------------");
		
		System.out.println(
		"5.AcademyMember �߿��� �ڹٹ���  AcademyStudent��ü�� �迭����������ȯ����");
		findMembers=
				academyMemberService.findByAcademyMembers2(new AcademyStudent(1, "KIM", "�ڹ�"));
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println(
				"5.AcademyMember �߿��� �ڹٰ����� AcademyGangsa ��ü�� �迭����������ȯ����");
		findMembers=
				academyMemberService.findByAcademyMembers2(new AcademyGangsa(5, "CHOI", "���α׷���"));
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println(
		"5.AcademyMember �߿��� �����μ��� AcademyStaff  ��ü�� �迭����������ȯ����");
		findMembers=
				academyMemberService.findByAcademyMembers2(new AcademyStaff(8, "AIM", "����"));
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
	}

}
