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
		if (!subjectFile.exists()) { // �������� �ʴ´ٸ�?
			// Application ���� �����
			subjectFile.createNewFile();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(subjectFile));
			oos.writeObject(new ArrayList<SubjectVO>()); // ������ 0¥�� ��̸���Ʈ�� �ʱ�ȭ
			oos.close();
		}
	}

	/*
	 * File read admin.ser�� ����� ������ >> ArrayList<AdminVO>�� �����ϴ� �۾�
	 */
	@SuppressWarnings("unchecked")
	private ArrayList<SubjectVO> fileRead() throws Exception {
		File subjectFile = new File("subject.ser");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(subjectFile));
		ArrayList<SubjectVO> subjectList = (ArrayList<SubjectVO>) ois.readObject();
		// ois�� ȣ���ϸ� memberList�� ������
		ois.close();
		return subjectList;

	}

	/*
	 * file write ArrayList<AdminVO>������ admin.ser�� ����
	 */
	private void fileWrite(ArrayList<SubjectVO> subjectList) throws Exception {
		File subjectFile = new File("subject.ser");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(subjectFile));
		oos.writeObject(subjectList);
		oos.close();

	}

	/*
	 * Create - �л� �� ���� �߰�
	 */
	public void insert(SubjectVO insertsubject) throws Exception {
		ArrayList<SubjectVO> subjectList = this.fileRead();
		subjectList.add(insertsubject);
		this.fileWrite(subjectList);

	}

	/*
	 * Read - �л� �� ���� �̸����� select
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
	 * Read - ��� �л� select
	 */
	public ArrayList<SubjectVO> selectAll() throws Exception {
		ArrayList<SubjectVO> subjectList = this.fileRead();
		return subjectList;

		// return this.fileRead();

	}

	/*
	 * Update - �л� �� ���� ����
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
	 * Delete - �л� �Ѹ��� �̸����� ã�Ƽ� Delete
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
			throw new NameNotFoundExecption(subname + " �� ���������ʴ� �����Դϴ�.");
		}
		return;
	}

}
