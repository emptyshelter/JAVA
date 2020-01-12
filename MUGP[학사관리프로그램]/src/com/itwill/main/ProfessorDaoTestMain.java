package com.itwill.main;

import com.itwill.dao.ProfessorDao;
import com.itwill.vo.ProfessorVo;

public class ProfessorDaoTestMain {

	public static void main(String[] args) throws Exception {

		ProfessorDao professorDao = new ProfessorDao();
		System.out.println("-------insert-----");
		professorDao.insert(new ProfessorVo(1, "강호동", "C언어", "이번주는 프로젝트", "공대 1층 101호", "C언어 길라잡이", "김경호", "한빛"));
		professorDao.insert(new ProfessorVo(2, "유재석", "자바", "이번주는 휴강", "공대 2층 202호", "자바 길라잡이", "남궁석", "한빛"));
		professorDao.insert(new ProfessorVo(3, "이경규", "리눅스", "이번주는 휴강", "공대 3층 303호", "리눅스 길라잡이", "김경호", "하빛"));

		/*
		System.out.println("-------selectByPN()-----");
		ProfessorVo selectProfessor = professorDao.selectByPN(1);
		System.out.println(selectProfessor);

		System.out.println("-------updateByPN()-----");
//		professorDao.updateByPN(new ProfessorVo(2, "박씨", "자바", "이번주는 for문", "본관3층 305호", "자바 길라잡이", "박", "한빛"));

		System.out.println("-------selectAll-----");
		ArrayList<ProfessorVo> professorList = professorDao.selectAll();
		for (ProfessorVo professorVo : professorList) {
			System.out.println(professorVo);
		}
		*/
	}

}
