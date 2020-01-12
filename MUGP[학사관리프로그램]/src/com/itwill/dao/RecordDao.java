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
			// Application ���� ����� �Ǵ� ���� ���� �� ���� ����
			memberFile.createNewFile();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(memberFile));
			oos.writeObject(new ArrayList<RecordVo>()); // size 0¥�� ArrayList�� �־��־� file�� �ʱ�ȭ.
			oos.close();
		}
	}

	/*
	 * File read member.ser �� ArrayList<MemberVO> ��ȯ�ϴ� �۾� ����
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
	 * File read (ArrayList<MemberVO> �� member.ser ���Ϸ� ��ȯ.
	 */
	private void fileWrite(ArrayList<RecordVo> recordList) throws Exception {
		File recordFile = new File("record.ser");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(recordFile));
		oos.writeObject(recordList);
		oos.close();
	}// CRUD�ʹ� ����� ����.

	/*
	 * Create - Member �Ѹ��� �߰�
	 */
	public void insert(RecordVo insertRecord) throws Exception {
		ArrayList<RecordVo> recordList = this.fileRead();
		recordList.add(insertRecord);
		this.fileWrite(recordList);
	}

	/*
	 * Read - Member �Ѹ��� ID�� �˻��ؼ� ���� �о����
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
	 * Read - ��� Member select
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
	 * Read - �л� �� ���� ��ü ���� ��� �� ����
	 */
	public String printTotalSubRank(String id) throws Exception {
		String result = null;
		ArrayList<RecordVo> recordList = this.fileRead();
		for (int i = 0; i < recordList.size(); i++) {
			if (recordList.get(i).getId().equals(id)) {
				result = "��ü ����:" + recordList.get(i).getTotalScore() + " \t\t �� ���: " + recordList.get(i).getAvgT()
						+ "\t\t �� ����: " + recordList.get(i).getRankT();
			}
		}
		return result;
	}

	/*
	 * Update - Subject ���� ��� �� �Է�
	 */
	public void updateSubrank() throws Exception {
		ArrayList<RecordVo> recordList = this.fileRead();
		for (int i = 0; i < recordList.size(); i++) {
			recordList.get(i).setSubject1Rank(1);
			recordList.get(i).setSubject2Rank(1);
			recordList.get(i).setSubject3Rank(1);
		} // ��ư �ݺ������� ���� �� ���� �ִ� ���� �߰��ؼ� ���� �ʵ���.
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
	 * Update - ��ü ��� ��� �� �Է�
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
		} // ��ư �ݺ������� ���� �� ���� �ִ� ���� �߰��ؼ� ���� �ʵ���.
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
	 * Update - ���� ��� ���� ���� //0412 ����
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
		result3 = result3 / recordList.size(); // ���� ��� ���� ���

		for (int i = 0; i < recordList.size(); i++) {
			recordList.get(i).setSubject1Avg(result1);
			recordList.get(i).setSubject2Avg(result2);
			recordList.get(i).setSubject3Avg(result3);
		}

		this.fileWrite(recordList);
	}

	/*
	 * Delete - Member �Ѹ��� ID�� ã�Ƽ� ����
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
