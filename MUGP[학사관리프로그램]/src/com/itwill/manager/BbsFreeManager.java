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
	
		//�Խñ� �ۼ�
	public void  write(BbsVo insertBbsVo) throws Exception{
		bd.insert(insertBbsVo);
	}
		//�Խñ� ����
	public void updateMessage(BbsVo updateBbsVo)throws Exception{ 
		bd.updateByNo(updateBbsVo);
	}
		//�Խñ� ����
	public void deleteMessage(String no)throws Exception{
		ArrayList<BbsVo> bbsList = bd.selectAll();
		for (int i = 0; i < bbsList.size(); i++) {
			BbsVo temp = bbsList.get(i);
			if(temp.getNo().equals(no)){
				bd.deleteByNo(no);
			}
		}
	}
		//�Խñ� �󼼺���
	public BbsVo oneMessageView(String no) throws Exception{
		BbsVo oneBbs = bd.selectedByNo(no);
		return oneBbs;
	}
		//Dao���� ArrayList �ҷ�����
	public ArrayList<BbsVo> getBbsList() throws Exception{
		BbsFreeDao bbsFreeDao = new BbsFreeDao();
		return bbsFreeDao.selectAll();
	}
		//�ؽ�Ʈ �ҷ�����
	
}
