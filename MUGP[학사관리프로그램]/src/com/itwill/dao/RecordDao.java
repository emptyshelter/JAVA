package com.itwill.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.itwill.vo.RecordVo;

public class RecordDao {

	public RecordDao() throws Exception {

		File memberFile = new File("record.ser");
		if (!memberFile.exists()) {
			// Application 최초 실행시 또는 파일 삭제 후 파일 생성
			memberFile.createNewFile();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(memberFile));
			oos.writeObject(new ArrayList<RecordVo>()); // size 0짜리 ArrayList를 넣어주어 file을 초기화.
			oos.close();
		}
	}

	/*
	 * File read member.ser → ArrayList<MemberVO> 변환하는 작업 수행
	 */
	@SuppressWarnings("unchecked")
	private ArrayList<RecordVo> fileRead() throws Exception {
		File recordFile = new File("record.ser");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(recordFile));
		ArrayList<RecordVo> recordList = (ArrayList<RecordVo>) ois.readObject();
		ois.close();
		return recordList;
	}

	/*
	 * File read (ArrayList<MemberVO> → member.ser 파일로 변환.
	 */
	private void fileWrite(ArrayList<RecordVo> recordList) throws Exception {
		File recordFile = new File("record.ser");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(recordFile));
		oos.writeObject(recordList);
		oos.close();
	}// CRUD와는 상관이 없음.

	/*
	 * Create - Member 한명을 추가
	 */
	public void insert(RecordVo insertRecord) throws Exception {
		ArrayList<RecordVo> recordList = this.fileRead();
		recordList.add(insertRecord);
		this.fileWrite(recordList);
	}

	/*
	 * Read - Member 한명을 ID로 검색해서 정보 읽어오기
	 */
	public RecordVo selectById(String id) throws Exception {
		RecordVo findRecord = null;
		ArrayList<RecordVo> recordList = this.fileRead();
		for (RecordVo RecordVo : recordList) {
			if (RecordVo.getId().equals(id)) {
				findRecord = RecordVo;
			}
		}
		return findRecord;
	}

	/*
	 * Read - 모든 Member select
	 */
	public ArrayList<RecordVo> selectAll() throws Exception {
		ArrayList<RecordVo> recordList = this.fileRead();
		return recordList;
	}

	public boolean selectById(RecordVo recordVo) throws Exception {
		boolean findRecord = false;
		ArrayList<RecordVo> recordList = this.fileRead();
		for (int i = 0; i < recordList.size(); i++) {
			if (recordList.get(i).getNameStudent().equals(recordVo.getNameStudent())) {
				recordList.set(i, recordVo);
				findRecord = true;
				this.fileWrite(recordList);
			}
		}
		return findRecord;
	}

	/*
	 * Read - 학생 한 명의 전체 과목 평균 및 석차
	 */
	public String printTotalSubRank(String id) throws Exception {
		String result = null;
		ArrayList<RecordVo> recordList = this.fileRead();
		for (int i = 0; i < recordList.size(); i++) {
			if (recordList.get(i).getId().equals(id)) {
				result = "전체 총점:" + recordList.get(i).getTotalScore() + " \t\t 총 평균: " + recordList.get(i).getAvgT()
						+ "\t\t 총 석차: " + recordList.get(i).getRankT();
			}
		}
		return result;
	}

	/*
	 * Update - Subject 석차 계산 후 입력
	 */
	public void updateSubrank() throws Exception {
		ArrayList<RecordVo> recordList = this.fileRead();
		for (int i = 0; i < recordList.size(); i++) {
			recordList.get(i).setSubject1Rank(1);
			recordList.get(i).setSubject2Rank(1);
			recordList.get(i).setSubject3Rank(1);
		} // 버튼 반복적으로 누를 때 원래 있던 값에 추가해서 하지 않도록.
		for (int i = 0; i < recordList.size(); i++) {
			for (int j = 0; j < recordList.size(); j++) {
				if (recordList.get(i).getsubjectScore1() < recordList.get(j).getsubjectScore1()) {
					recordList.get(i).setSubject1Rank(recordList.get(i).getSubject1Rank() + 1);
				}
				if (recordList.get(i).getsubjectScore2() < recordList.get(j).getsubjectScore2()) {
					recordList.get(i).setSubject2Rank(recordList.get(i).getSubject2Rank() + 1);
				}
				if (recordList.get(i).getsubjectScore3() < recordList.get(j).getsubjectScore3()) {
					recordList.get(i).setSubject3Rank(recordList.get(i).getSubject3Rank() + 1);
				}
			}
		}
		this.fileWrite(recordList);
	}

	/*
	 * Update - 전체 평균 계산 후 입력
	 */
	public void updateTotal() throws Exception {
		ArrayList<RecordVo> recordList = this.fileRead();
		int result = 0;
		for (int i = 0; i < recordList.size(); i++) {
			result = recordList.get(i).getsubjectScore1() + recordList.get(i).getsubjectScore2()
					+ recordList.get(i).getsubjectScore3();
			recordList.get(i).setTotalScore(result);
			result = result / 3;
			recordList.get(i).setAvgT(result);
		}
		for (int i = 0; i < recordList.size(); i++) {
			recordList.get(i).setRankT(1);
			recordList.get(i).setRankT(1);
			recordList.get(i).setRankT(1);
		} // 버튼 반복적으로 누를 때 원래 있던 값에 추가해서 하지 않도록.
		for (int i = 0; i < recordList.size(); i++) {
			for (int j = 0; j < recordList.size(); j++) {
				if (recordList.get(i).getTotalScore() < recordList.get(j).getTotalScore()) {
					recordList.get(i).setRankT(recordList.get(i).getRankT() + 1);
				}
			}
		}
		this.fileWrite(recordList);
	}

	/*
	 * Update - 과목별 평균 점수 저장 //0412 수정
	 */
	public void calAvgSubject() throws Exception {
		ArrayList<RecordVo> recordList = this.fileRead();
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		for (int i = 0; i < recordList.size(); i++) {
			result1 += recordList.get(i).getsubjectScore1();
			result2 += recordList.get(i).getsubjectScore2();
			result3 += recordList.get(i).getsubjectScore3();
		}
		result1 = result1 / recordList.size();
		result2 = result2 / recordList.size();
		result3 = result3 / recordList.size(); // 과목별 평균 점수 계산

		for (int i = 0; i < recordList.size(); i++) {
			recordList.get(i).setSubject1Avg(result1);
			recordList.get(i).setSubject2Avg(result2);
			recordList.get(i).setSubject3Avg(result3);
		}

		this.fileWrite(recordList);
	}

	/*
	 * Delete - Member 한명을 ID로 찾아서 삭제
	 */
	@SuppressWarnings("unused")
	public void deleteById(String id) throws Exception {
		ArrayList<RecordVo> recordList = this.fileRead();
		boolean existId = false;
		for (int i = 0; i < recordList.size(); i++) {
			RecordVo tempMemberVO = recordList.get(i);
			if (tempMemberVO.getId().equals(id)) {
				recordList.remove(i);
				existId = true;
				break;
			}
		}
		this.fileWrite(recordList);
	}

}
