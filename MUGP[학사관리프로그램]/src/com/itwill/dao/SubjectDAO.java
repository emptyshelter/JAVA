package com.itwill.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.itwill.main.NameNotFoundExecption;
import com.itwill.vo.SubjectVO;

public class SubjectDAO {

	private File subjectFile;

	public SubjectDAO() throws Exception {
		subjectFile = new File("subject.ser");
		if (!subjectFile.exists()) { // 존재하지 않는다면?
			// Application 최초 실행시
			subjectFile.createNewFile();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(subjectFile));
			oos.writeObject(new ArrayList<SubjectVO>()); // 사이즈 0짜리 어레이리스트를 초기화
			oos.close();
		}
	}

	/*
	 * File read admin.ser에 저장된 파일을 >> ArrayList<AdminVO>로 변경하는 작업
	 */
	@SuppressWarnings("unchecked")
	private ArrayList<SubjectVO> fileRead() throws Exception {
		File subjectFile = new File("subject.ser");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(subjectFile));
		ArrayList<SubjectVO> subjectList = (ArrayList<SubjectVO>) ois.readObject();
		// ois를 호출하면 memberList가 딱나옴
		ois.close();
		return subjectList;

	}

	/*
	 * file write ArrayList<AdminVO>파일을 admin.ser로 변경
	 */
	private void fileWrite(ArrayList<SubjectVO> subjectList) throws Exception {
		File subjectFile = new File("subject.ser");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(subjectFile));
		oos.writeObject(subjectList);
		oos.close();

	}

	/*
	 * Create - 학생 한 명을 추가
	 */
	public void insert(SubjectVO insertsubject) throws Exception {
		ArrayList<SubjectVO> subjectList = this.fileRead();
		subjectList.add(insertsubject);
		this.fileWrite(subjectList);

	}

	/*
	 * Read - 학생 한 명을 이름으로 select
	 */
	public SubjectVO selectByName(String subname) throws Exception {
		SubjectVO findsubject = null;
		ArrayList<SubjectVO> subjectList = fileRead();
		for (SubjectVO subjectVO : subjectList) {
			if (subjectVO.getSub().equals(subname)) {
				findsubject = subjectVO;
				break;
			}
		}
		return findsubject;

	}

	/*
	 * Read - 모든 학생 select
	 */
	public ArrayList<SubjectVO> selectAll() throws Exception {
		ArrayList<SubjectVO> subjectList = this.fileRead();
		return subjectList;

		// return this.fileRead();

	}

	/*
	 * Update - 학생 한 명의 수정
	 */
	public void updateByName(SubjectVO updateVO) throws Exception {

		ArrayList<SubjectVO> subjectList = this.fileRead();
		for (int i = 0; i < subjectList.size(); i++) {
			SubjectVO tempSubjectVO = subjectList.get(i);
			if (updateVO.getSub().equals(tempSubjectVO.getSub())) {
				subjectList.set(i, updateVO);
				break;
			}

		}
		this.fileWrite(subjectList);

	}

	/*
	 * Delete - 학생 한명을 이름으로 찾아서 Delete
	 */
	public void deleteByName(String subname) throws Exception {
		ArrayList<SubjectVO> subjectList = this.fileRead();
		boolean existName = false;
		for (int i = 0; i < subjectList.size(); i++) {
			SubjectVO tempSubjectVO = subjectList.get(i);
			if (tempSubjectVO.getSub().equals(subname)) {
				subjectList.remove(i);
				existName = true;
				break;
			}
		}
		this.fileWrite(subjectList);

		if (!existName) {
			throw new NameNotFoundExecption(subname + " 는 존재하지않는 과목입니다.");
		}
		return;
	}

}
