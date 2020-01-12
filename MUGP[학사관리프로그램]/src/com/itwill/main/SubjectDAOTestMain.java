package com.itwill.main;

import java.awt.Frame;
import java.util.ArrayList;

import com.itwill.dao.SubjectDAO;
import com.itwill.vo.SubjectVO;

@SuppressWarnings("serial")
public class SubjectDAOTestMain extends Frame {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		SubjectDAO subjectDAO = new SubjectDAO();

		System.out.println("-------과목입력-------");
		subjectDAO.insert(new SubjectVO("JAVA", "박지연", "월123", "공학관319"));
		subjectDAO.insert(new SubjectVO("C++", "홍찬기", "월456", "공학관320"));
		subjectDAO.insert(new SubjectVO("유닉스", "홍찬기", "화123", "공학관305"));

		System.out.println("-------입력한 과목정보 출력------");
		SubjectVO selectSubject = subjectDAO.selectByName("guard");
		System.out.println("JAVA: " + subjectDAO.selectByName("JAVA"));
		System.out.println("유닉스: " + subjectDAO.selectByName("유닉스"));

		System.out.println("--------입력한 과목정보 수정-------");
		subjectDAO.updateByName(new SubjectVO("JAVA", "박지연", "수123", "공학관306"));
		subjectDAO.deleteByName("C++");

		System.out.println("----------모든과목출력-----------");
		ArrayList<SubjectVO> subjectList = subjectDAO.selectAll();
		for (SubjectVO subjectVO : subjectList) {
			System.err.println(subjectVO);
		}
	}
}
