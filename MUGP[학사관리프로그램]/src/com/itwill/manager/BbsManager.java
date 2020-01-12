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

	// �Խñ� �ۼ�
	public void write(BbsVo insertBbsVo) throws Exception {
		bd.insert(insertBbsVo);
	}

	// �Խñ� ����
	public void updateMessage(BbsVo updateBbsVo) throws Exception {
		bd.updateByNo(updateBbsVo);
	}

	// �Խñ� ����
	public void deleteMessage(String no) throws Exception {
		ArrayList<BbsVo> bbsList = bd.selectAll();
		for (int i = 0; i < bbsList.size(); i++) {
			BbsVo temp = bbsList.get(i);
			if (temp.getNo().equals(no)) {
				bd.deleteByNo(no);
			}
		}

	}

	// �Խñ� �󼼺���
	public BbsVo oneMessageView(String no) throws Exception {
		BbsVo oneBbs = bd.selectedByNo(no);
		return oneBbs;
	}

	// Dao���� ArrayList �ҷ�����
	public ArrayList<BbsVo> getBbsList() throws Exception {
		BbsDao bbsDao = new BbsDao();
		return bbsDao.selectAll();
	}
	// �ؽ�Ʈ �ҷ�����

}
