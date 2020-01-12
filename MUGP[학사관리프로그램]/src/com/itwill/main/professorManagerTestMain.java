package com.itwill.main;

import java.util.ArrayList;

import com.itwill.dao.RecordDao;
import com.itwill.manager.ProfessorManager;
import com.itwill.vo.ProfessorVo;
import com.itwill.vo.RecordVo;

public class professorManagerTestMain {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		ProfessorManager professorManager = new ProfessorManager();
		RecordDao recordDao = new RecordDao();

		System.out.println("--------���� ��ȹ-----------");
		ProfessorVo professorSP = professorManager.findSubjectPlan(1);
		System.out.println(professorSP);

		System.out.println("--------�����Է�------------");
		 professorManager.inputScore(new RecordVo("KIM", "870225-123456","010-1111-1111", 90,80,70));
		
		 professorManager.inputScore(new RecordVo("NA", "870321-125789","010-1122-1221", 70,90,60));
		
		
		System.out.println("---------�л���Ȳ-------------");
		ArrayList subjectStudents = professorManager.findSubjectStudent("C���");
		System.out.println(subjectStudents);

		ArrayList<RecordVo> selectall = recordDao.selectAll();
		System.out.println(selectall);
	}
}
