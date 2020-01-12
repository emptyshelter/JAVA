package com.itwill.main;

import java.awt.Frame;
import java.util.ArrayList;

import com.itwill.dao.AdminDAO;
import com.itwill.vo.AdminVO;

@SuppressWarnings("serial")
public class AdminDaoTestMain extends Frame {

	public static void main(String[] args) throws Exception {
		AdminDAO memberDao = new AdminDAO(); // dao에서 생성해준 빈 어레이리스트가 들어가게됨

		System.out.println("-------학생정보입력-----");
		memberDao.insert(new AdminVO("김성훈", "123456", "01000000001"));
		memberDao.insert(new AdminVO("나호준", "123456", "01000000002"));
//		memberDao.insert(new AdminVO("남민지", "123456", "01000000003"));
		memberDao.insert(new AdminVO("정대현", "123456", "01000000004"));
		memberDao.insert(new AdminVO("박준호", "123456", "01000000005"));
		memberDao.insert(new AdminVO("박슬기", "123456", "01000000006"));
		memberDao.insert(new AdminVO("이경규", "700000", "01003000003"));
		memberDao.insert(new AdminVO("강호동", "700000", "01000070009"));
		memberDao.insert(new AdminVO("유재석", "700000", "01000080010"));
		memberDao.insert(new AdminVO("관리자", "123456", "12-345-6789"));
		

		/*
		System.out.println("-------입력한 학생의 정보 출력-----");
		AdminVO selectMember = memberDao.selectByName("guard");
		System.out.println("guard:" + selectMember);
		System.out.println("김성훈:" + memberDao.selectByName("김성훈"));
		System.out.println("김지훈:" + memberDao.selectByName("김지훈"));

		System.out.println("-------입력한 학생의 정보 수정-----");
		memberDao.updateByName(new AdminVO("박슬기", "940525", "01042131212"));
		memberDao.deleteByName("강하니");
		*/
		System.out.println("-------현재 저장되어있는 학생 전부 출력-----");
		ArrayList<AdminVO> memberList = memberDao.selectAll();
		for (AdminVO memberVO : memberList) {
			System.out.println(memberVO);
		}
		
	}
}
