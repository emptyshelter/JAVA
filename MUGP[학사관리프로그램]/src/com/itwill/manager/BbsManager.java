package com.itwill.manager;


import java.util.ArrayList;

import com.itwill.dao.BbsDao;
import com.itwill.vo.BbsVo;

public class BbsManager {

	@SuppressWarnings({ "rawtypes", "unused" })
	private ArrayList bbs;
	private BbsDao bd;

	public BbsManager() throws Exception {
		bd = new BbsDao();
	}

	// 게시글 작성
	public void write(BbsVo insertBbsVo) throws Exception {
		bd.insert(insertBbsVo);
	}

	// 게시글 수정
	public void updateMessage(BbsVo updateBbsVo) throws Exception {
		bd.updateByNo(updateBbsVo);
	}

	// 게시글 삭제
	public void deleteMessage(String no) throws Exception {
		ArrayList<BbsVo> bbsList = bd.selectAll();
		for (int i = 0; i < bbsList.size(); i++) {
			BbsVo temp = bbsList.get(i);
			if (temp.getNo().equals(no)) {
				bd.deleteByNo(no);
			}
		}

	}

	// 게시글 상세보기
	public BbsVo oneMessageView(String no) throws Exception {
		BbsVo oneBbs = bd.selectedByNo(no);
		return oneBbs;
	}

	// Dao에서 ArrayList 불러오기
	public ArrayList<BbsVo> getBbsList() throws Exception {
		BbsDao bbsDao = new BbsDao();
		return bbsDao.selectAll();
	}
	// 텍스트 불러오기

}
