package com.itwill.main;

import com.itwill.dao.RecordDao;
import com.itwill.vo.RecordVo;

public class RecordDaoTestMain {

	public static void main(String[] args) throws Exception {

		RecordDao recordDao = new RecordDao();
		System.out.println("-------insert-----");
		recordDao.insert(new RecordVo("�輺��", "910122", "01051190122", 50, 90, 75));
		recordDao.insert(new RecordVo("��ȣ��", "890117", "01023456789", 75, 80, 90));
//		recordDao.insert(new RecordVo("������", "930201", "01012345678", 0, 0, 0));
		recordDao.insert(new RecordVo("������", "830707", "01025229099", 100, 50, 30));
		recordDao.insert(new RecordVo("����ȣ", "920303", "01034567890", 100, 90, 95));
		recordDao.insert(new RecordVo("�ڽ���", "960409", "01036251487", 70, 90, 88));

		// memberDao.insert(new AdminVO());
		// memberDao.insert(new AdminVO());
		// memberDao.insert(new AdminVO());
		// memberDao.insert(new AdminVO());
		// memberDao.insert(new AdminVO());
		// memberDao.insert(new AdminVO());

		// System.out.println("-------selectAll-----");
		// ArrayList<RecordVo> memberList = recordDao.selectAll();
		// for (RecordVo RecordVo : memberList) {
		// System.out.println(RecordVo);
		// }

		System.out.println("-------selectByNoS()-----");
		// RecordVo selectNo = recordDao.selectByNoS(1,"C���");

		System.out.println("-------deleteById()-----");
		// recordDao.deleteById(1,"C���");
		System.out.println("-------selectAll-----");
		// memberList = recordDao.selectAll();
		// for (RecordVo RecordVo : memberList) {
		// System.out.println(RecordVo);
		// }

	}

}