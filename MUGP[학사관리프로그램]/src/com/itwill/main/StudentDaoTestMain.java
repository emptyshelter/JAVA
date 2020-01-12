package com.itwill.main;

import com.itwill.dao.StudentDao;
import com.itwill.vo.StudentVo;

public class StudentDaoTestMain {

	public static void main(String[] args) throws Exception {

		/*
		 * Data Access 기능을 수행하는 객체 생성
		 */


		StudentDao studentDao = new StudentDao();
	
		System.out.println("----- 학생 수강 등록 -----");

		studentDao.insertCourse(new StudentVo("김성훈", "123456", "010-0000-0001", "자바", "1공학관 101호", "월요일 1교시", "김경호"));
		studentDao.insertCourse(new StudentVo("나호준", "123456", "010-0000-0002", "리눅스", "2공학관 202호", "화요일 2교시", "김경호"));
		studentDao.insertCourse(new StudentVo("남민지", "123456", "010-0003-0003", "자바", "1공학관 101호", "월요일 1교시", "김경호"));
		studentDao.insertCourse(new StudentVo("정대현", "123456", "010-0000-0004", "C언어", "3공학관 303호", "수요일 3교시", "김경호"));
		studentDao.insertCourse(new StudentVo("박준호", "123456", "010-0000-0005", "자바", "자연대학 202호", "목요일 2교시", "김경호"));
		studentDao.insertCourse(new StudentVo("박슬기", "123456", "010-0000-0006", "리눅스", "자연대학 101호", "금요일 1교시", "김경호"));

		/*
		System.out.println("\n----- 학생의 개인정보 수정 -----");
		boolean flag = studentDao
				.updateByStudent(new StudentVo("정대현", "1234567", "010-2522-1111", "자바", "1공학관 101호", "월요일 1교시", "유재석"));
		System.out.println("flag: " + flag);
	
		System.out.println("\n----- 학생의 시간표, 수강기록 조회 -----");

		StudentVo selectStudent = studentDao.selectByName("정대현");
		// StudentVo selectStudent = studentDao.selectByUndergrad("1234567");
		System.out.println("학생 조회: " + selectStudent);
		*/

	}

}
