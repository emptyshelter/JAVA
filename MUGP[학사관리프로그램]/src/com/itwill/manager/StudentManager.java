/*
 * - ��������� ���� �����Ͻ�(����) ����� �����ϴ� ��ü
 * - UI(JFrame)���� �� ��ü�� Ư������� ����ؼ� ������ �����Ѵ�.
 * - MemberManager(MemberService)��ü�� ����Ͻ�(����)�޽�� �����
 *   Data Access�� �ʿ��� ��� MemberDao��ü�� �����޽��(insert, select, update, delete)
 *   �� ����ؼ� (�޽��ȣ��) ����ó��
 * - �������(����Ÿ)�� ������ �ʴ´�.
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
	 * �л��� ���� �ð�ǥ ��ȸ
	 */
//	public StudentVo selectByUndergrad(String hackBun) throws Exception {
    public StudentVo selectByName(String name) throws Exception {

		studentDao = new StudentDao();

		return studentDao.selectByName(name);
	}

	/*
	 * �л� �������� ����
	 */
	public boolean updateByStudent(StudentVo studentVo) throws Exception {

		boolean updateSucess = studentDao.updateByStudent(studentVo);

		return updateSucess;
	}

}
