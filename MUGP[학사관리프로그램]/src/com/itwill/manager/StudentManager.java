/*
 * - 멤버관리를 위한 비지니스(업무) 기능을 제공하는 객체
 * - UI(JFrame)에서 이 객체의 특정기능을 사용해서 업무를 수행한다.
 * - MemberManager(MemberService)객체는 비즈니스(업무)메쏘드 실행시
 *   Data Access가 필요한 경우 MemberDao객체의 단위메쏘드(insert, select, update, delete)
 *   를 사용해서 (메쏘드호출) 업무처리
 * - 멤버변수(데이타)를 가지지 않는다.
 */
package com.itwill.manager;

import com.itwill.dao.StudentDao;
import com.itwill.vo.StudentVo;

public class StudentManager {

	private StudentDao studentDao;

	public StudentManager() throws Exception {
		studentDao = new StudentDao();
	}

	public boolean registerCourse(StudentVo studentVo) throws Exception {

		boolean registerSuccess = true;

		StudentVo findStudent = studentDao.selectByBirthDate(studentVo.getBirthDate());

		if (findStudent == null) {
			studentDao.insertCourse(studentVo);
			registerSuccess = true;
		} else {
			registerSuccess = false;
		}

		return registerSuccess;
	}

	/*
	 * 학생의 수강 시간표 조회
	 */
//	public StudentVo selectByUndergrad(String hackBun) throws Exception {
    public StudentVo selectByName(String name) throws Exception {

		studentDao = new StudentDao();

		return studentDao.selectByName(name);
	}

	/*
	 * 학생 개인정보 수정
	 */
	public boolean updateByStudent(StudentVo studentVo) throws Exception {

		boolean updateSucess = studentDao.updateByStudent(studentVo);

		return updateSucess;
	}

}
