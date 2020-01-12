package com.itwill.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.itwill.main.IdNotFoundException;
import com.itwill.vo.*;

public class ProfessorDao {

	public ProfessorDao() throws Exception {

		File professorFile = new File("professor.ser");

		if (!professorFile.exists()) {
			professorFile.createNewFile();

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(professorFile));
			oos.writeObject(new ArrayList<ProfessorVo>());
			oos.close();

		}
	}

	@SuppressWarnings("unchecked")
	private ArrayList<ProfessorVo> fileRead() throws Exception {
		File professorFile = new File("professor.ser");

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(professorFile));

		ArrayList<ProfessorVo> professorList = (ArrayList<ProfessorVo>) ois.readObject();
		ois.close();
		return professorList;

	}

	private void fileWrite(ArrayList<ProfessorVo> professorList) throws Exception {

		File professorFile = new File("professor.ser");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(professorFile));
		oos.writeObject(professorList);
		oos.close();

	}

	public void insert(ProfessorVo insertprofessor) throws Exception {
		ArrayList<ProfessorVo> professorList = this.fileRead();
		professorList.add(insertprofessor);
		this.fileWrite(professorList);
	}

	public ProfessorVo selectByPN(int number) throws Exception {

		ProfessorVo findMember = null;
		ArrayList<ProfessorVo> professorList = this.fileRead();
		for (ProfessorVo professorVo : professorList) {
			if (professorVo.getpNo() == number) {
				findMember = professorVo;
				break;
			}
		}
		return findMember;
	}

	public ArrayList<ProfessorVo> selectAll() throws Exception {
		ArrayList<ProfessorVo> professorList = this.fileRead();
		return professorList;
	}

	/*
	 * Update -professor 한명 수정
	 */
	public void updateByPN(ProfessorVo updateVO) throws Exception {

		ArrayList<ProfessorVo> professorList = this.fileRead();

		for (int i = 0; i < professorList.size(); i++) {
			ProfessorVo tempProfessorVo = professorList.get(i);
			if (updateVO.getpNo() == tempProfessorVo.getpNo()) {
				professorList.set(i, updateVO);
				break;
			}
		}
		this.fileWrite(professorList);

	}

	/*
	 * Delete - professor 한명을 아이디로 찾아서 삭제
	 */
	public void deleteById(int number) throws Exception {

		ArrayList<ProfessorVo> professorList = this.fileRead();

		boolean existedId = false;

		for (int i = 0; i < professorList.size(); i++) {

			ProfessorVo tempProfessorVo = professorList.get(i);

			if (tempProfessorVo.getpNo() == number) {
				professorList.remove(i);
				existedId = true;
				break;
			}
		}

		if (!existedId) {
			throw new IdNotFoundException(number + " 는 존재하지 않는 번호입니다.");
		}
		this.fileWrite(professorList);
	}

}
