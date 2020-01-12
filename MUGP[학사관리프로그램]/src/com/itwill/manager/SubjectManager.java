package com.itwill.manager;

import java.util.ArrayList;

import com.itwill.dao.SubjectDAO;
import com.itwill.vo.SubjectVO;

public class SubjectManager {

	private SubjectDAO subjectDAO;

	public SubjectManager() throws Exception {
		subjectDAO = new SubjectDAO();
	}

	/*
	 * ������(�ߺ��˻�, -->�ߺ������� ��Ͻ�Ŵ)
	 */
	public boolean SubjectPlus(SubjectVO subplus) throws Exception {
		boolean subjectPlus = true;

		SubjectVO findsubject = subjectDAO.selectByName(subplus.getSub());
		if (findsubject == null) {
			subjectDAO.insert(subplus);
			subjectPlus = true;
		} else {
			subjectPlus = false;
		}
		return subjectPlus;

	}

	/*
	 * ��ü ���� ���� ����Ʈ
	 */
	public ArrayList<SubjectVO> getsubjectList() throws Exception {
		SubjectDAO subjectDAO = new SubjectDAO();

		return subjectDAO.selectAll();
	}

	/*
	 * �������� ����
	 */
	public void subjectUpdate(SubjectVO updatesubject) throws Exception {

		subjectDAO.updateByName(updatesubject);
	}

	/*
	 * ���� ����(�����̸�����)
	 */
	public void subjectDelete(String subname) throws Exception {
		subjectDAO.deleteByName(subname);

	}

}
