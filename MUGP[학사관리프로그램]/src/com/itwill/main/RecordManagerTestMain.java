package com.itwill.main;

import com.itwill.dao.RecordDao;
import com.itwill.manager.RecordManager;
import com.itwill.vo.RecordVo;

public class RecordManagerTestMain {

	public static void main(String[] args) throws Exception {
		RecordManager recordManager = new RecordManager();
		RecordDao recordDao = new RecordDao();

		recordDao.insert(new RecordVo("Kim", "900101-1111111", "010-1111-1111", 95, 80, 80));
		recordDao.insert(new RecordVo("Lee", "900101-2222222", "010-2222-2222", 60, 85, 70));
		System.out.println(recordManager.printRecord("2222222"));
		System.out.println(recordManager.printCalResult("2222222"));
		System.out.println(recordManager.printCalResult("1111111"));
		System.out.println(recordDao.selectAll());

	}

}
