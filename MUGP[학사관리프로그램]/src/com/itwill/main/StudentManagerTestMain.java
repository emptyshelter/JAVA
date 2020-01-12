package com.itwill.main;

import com.itwill.manager.StudentManager;
import com.itwill.vo.StudentVo;

public class StudentManagerTestMain {

	public static void main(String[] args) throws Exception {

		StudentManager studentManager = new StudentManager();

		/*
		System.out.println("----- 학생 수강 등록 -----");
		StudentVo register = new StudentVo("정대현", "830707", "010-2522-9099", "자바", "1공학관 101호", "월요일 1교시", "김경호");
		boolean registerSuccess = studentManager.registerCourse(register);
		if (!registerSuccess) {
			System.out.println("이미 수강등록이 되어 있습니다.");
		} else {
			System.out.println("수강등록이 완료 되었습니다.");
		}
		

		System.out.println("\n----- 학생의 개인정보 수정 -----");
//		boolean updateSuccess = studentManager.updateByStudent(new StudentVo("정대현", "830707", "010-1234-5678", "C언어", "2공학관 202호", "화요일 1교시", "유재석"));
		boolean updateSuccess = studentManager.updateByStudent(new StudentVo("정대현", "830707", "010-1234-5678", "C언어", "2공학관 202호", "화요일 1교시", "유재석"));
		if (!updateSuccess) {
			System.out.println("학번이 일치하지 않습니다.");
		} else {
			System.out.println("학생의 정보가 수정되었습니다.");
		}
		*/
		System.out.println("\n----- 학생의 수강 시간표 조회-----");
		// StudentVo selectStudent = studentManager.selectByUndergrad("1234567");
		StudentVo selectStudent = studentManager.selectByName("정대현");
		System.out.println("학생 시간표: " + selectStudent);
		
	}
}
