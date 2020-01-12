package com.itwill06.service.academy;

public class AcademyMemberServiceMain {

	public static void main(String[] args) {
		AcademyMemberService academyMemberService=new AcademyMemberService();
		System.out.println("1.AcademyMember 전체출력");
		academyMemberService.print();
		System.out.println("2.번호 1 번 AcademyMember 객체 참조변수반환해줘");
		AcademyMember findMember=
				academyMemberService.findAcademyMemberByNo(1);
		findMember.print();
		System.out.println(findMember);
		System.out.println("2.번호 2 번 AcademyMember 객체 참조변수반환해줘");
		findMember=
				academyMemberService.findAcademyMemberByNo(2);
		findMember.print();
		System.out.println(findMember);
		System.out.println("3.AcademyMember 중에서 AcademyStudent객체배열 참조변수반환해줘");
		AcademyMember[] findMembers=
				academyMemberService.findAcademyMembersByType(AcademyMember.STUDENT_TYPE);
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println("3.AcademyMember 중에서 AcademyGangsa객체배열 참조변수반환해줘");
		findMembers=
				academyMemberService.findAcademyMembersByType(AcademyMember.GANGSA_TYPE);
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println("3.AcademyMember 중에서 AcademyStaff객체배열 참조변수반환해줘");
		findMembers=
				academyMemberService.findAcademyMembersByType(AcademyMember.STAFF_TYPE);
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println(
		"4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		findMembers=
				academyMemberService.findByAcademyMembers(AcademyMember.STUDENT_TYPE,"자바");
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println(
		"4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		findMembers=
				academyMemberService.findByAcademyMembers(AcademyMember.STAFF_TYPE, "영업");
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println(
		"4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		findMembers=
				academyMemberService.findByAcademyMembers(AcademyMember.GANGSA_TYPE, "DB");
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println("---------------------------------------------");
		
		System.out.println(
		"5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		findMembers=
				academyMemberService.findByAcademyMembers2(new AcademyStudent(1, "KIM", "자바"));
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println(
				"5.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		findMembers=
				academyMemberService.findByAcademyMembers2(new AcademyGangsa(5, "CHOI", "프로그래밍"));
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println(
		"5.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		findMembers=
				academyMemberService.findByAcademyMembers2(new AcademyStaff(8, "AIM", "영업"));
		for (int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
	}

}
