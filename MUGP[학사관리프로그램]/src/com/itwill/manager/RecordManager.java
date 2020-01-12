package com.itwill.manager;

import com.itwill.dao.RecordDao;
import com.itwill.vo.RecordVo;

public class RecordManager {
	private RecordDao recordDao;

	public RecordManager() throws Exception {
		recordDao = new RecordDao();
	}

/*	public void calAvgSubject() throws Exception {
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		for (int i = 0; i < recordDao.selectAll().size(); i++) {
			result1 += recordDao.selectAll().get(i).getsubjectScore1();
			result2 += recordDao.selectAll().get(i).getsubjectScore2();
			result3 += recordDao.selectAll().get(i).getsubjectScore3();
		}

		result1 = result1 / recordDao.selectAll().size();
		result2 = result2 / recordDao.selectAll().size();
		result3 = result3 / recordDao.selectAll().size(); // 과목별 평균 점수 계산
		
		recordDao.updateSubAvg(result1, result2, result3);
	}// 과목별 평균 점수 저장
*/
	public void calAvgSubject() throws Exception{
		recordDao.calAvgSubject();
	}
	
	public void calRankSubject() throws Exception {
		recordDao.updateSubrank();
	} // 과목별 석차 계산

	public void calTotal() throws Exception {
		recordDao.updateTotal();
	} // 학생 한 명이 수강한 전체 과목의 총점과 평균, 석차 계산

	public RecordVo printRecord(String id) throws Exception {
		calAvgSubject();
		calRankSubject();
			if (recordDao.selectById(id) != null) {
				return recordDao.selectById(id);
			}
		return null;
	}

	public String printCalResult(String id) throws Exception {
		calTotal();
			if (recordDao.printTotalSubRank(id) != null) {
				return recordDao.printTotalSubRank(id);
			}
		return null;
	}
}
