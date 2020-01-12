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
	 * 과목등록(중복검사, -->중복없으면 등록시킴)
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
	 * 전체 과목 정보 리스트
	 */
	public ArrayList<SubjectVO> getsubjectList() throws Exception {
		SubjectDAO subjectDAO = new SubjectDAO();

		return subjectDAO.selectAll();
	}

	/*
	 * 과목정보 수정
	 */
	public void subjectUpdate(SubjectVO updatesubject) throws Exception {

		subjectDAO.updateByName(updatesubject);
	}

	/*
	 * 과목 삭제(과목이름으로)
	 */
	public void subjectDelete(String subname) throws Exception {
		subjectDAO.deleteByName(subname);

	}

}
