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
		// �Խñ��ۼ�
		BbsVo writeBoardMessage = new BbsVo("4", "�����մϴ�", "KIM", "2017.04.08.23:30", "�����ּż� �����մϴ�");
		bm.write(writeBoardMessage);

		// �Խñ� ����
		bm.updateMessage(new BbsVo("2", "[�亯�Ϸ�]JAVA�� ������", "KIM", "2017.04.08 22:30", "�˷��ּ���"));

		// �Խñ� ����
		bm.deleteMessage("3");

		// �Խñ� �ϳ� �ҷ����� (Ŭ���׼����� ��������)
		BbsVo bv = bm.oneMessageView("2");
		System.out.println(bv);

		System.out.println("--------------------");
		// ��ü ����Ʈ ���
		ArrayList<BbsVo> bbsList = bm.getBbsList();
		for (BbsVo bbsVo : bbsList) {
			System.out.println(bbsVo);
		}
	}
}
