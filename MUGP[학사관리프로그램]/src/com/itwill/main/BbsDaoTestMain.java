package com.itwill.main;

import java.util.ArrayList;

import com.itwill.dao.BbsDao;
import com.itwill.manager.BbsManager;
import com.itwill.vo.BbsVo;

public class BbsDaoTestMain {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		
		BbsManager bm = new BbsManager();
		BbsDao bd = new BbsDao();
		// 게시글작성
		BbsVo writeBoardMessage = new BbsVo("4", "감사합니다", "KIM", "2017.04.08.23:30", "도움주셔서 감사합니다");
		bm.write(writeBoardMessage);

		// 게시글 수정
		bm.updateMessage(new BbsVo("2", "[답변완료]JAVA가 뭐에요", "KIM", "2017.04.08 22:30", "알려주세요"));

		// 게시글 삭제
		bm.deleteMessage("3");

		// 게시글 하나 불러오기 (클릭액션으로 수정예정)
		BbsVo bv = bm.oneMessageView("2");
		System.out.println(bv);

		System.out.println("--------------------");
		// 전체 리스트 출력
		ArrayList<BbsVo> bbsList = bm.getBbsList();
		for (BbsVo bbsVo : bbsList) {
			System.out.println(bbsVo);
		}
	}
}
