package com.itwill.manager;

import java.util.ArrayList;

import com.itwill.dao.BbsFreeDao;
import com.itwill.vo.BbsVo;

public class BbsFreeManager {
	
	@SuppressWarnings({ "rawtypes", "unused" })
	private ArrayList bbs;
	private BbsFreeDao bd;
	

	public BbsFreeManager() throws Exception {
		bd = new BbsFreeDao();
	}
	
		//게시글 작성
	public void  write(BbsVo insertBbsVo) throws Exception{
		bd.insert(insertBbsVo);
	}
		//게시글 수정
	public void updateMessage(BbsVo updateBbsVo)throws Exception{ 
		bd.updateByNo(updateBbsVo);
	}
		//게시글 삭제
	public void deleteMessage(String no)throws Exception{
		ArrayList<BbsVo> bbsList = bd.selectAll();
		for (int i = 0; i < bbsList.size(); i++) {
			BbsVo temp = bbsList.get(i);
			if(temp.getNo().equals(no)){
				bd.deleteByNo(no);
			}
		}
	}
		//게시글 상세보기
	public BbsVo oneMessageView(String no) throws Exception{
		BbsVo oneBbs = bd.selectedByNo(no);
		return oneBbs;
	}
		//Dao에서 ArrayList 불러오기
	public ArrayList<BbsVo> getBbsList() throws Exception{
		BbsFreeDao bbsFreeDao = new BbsFreeDao();
		return bbsFreeDao.selectAll();
	}
		//텍스트 불러오기
	
}
